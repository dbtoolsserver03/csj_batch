/*****************************************************************************
 * プログラム ：AbsBatch.java バッチの親クラス.
 *****************************************************************************
 * 変更履歴： 2020.02.12 : 新規作成
 ******************************************************************************/
package jp.co.csj.backsys.batch.abs;

import java.text.MessageFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jp.co.csj.backsys.common.DpsConsts;
import jp.co.csj.backsys.common.DpsUtilsDate;
import jp.co.csj.backsys.common.exception.DpsExceptionHandle;
import jp.co.csj.backsys.common.message.DpsMessageKey;
import jp.co.csj.backsys.common.property.DpsProperties;
import jp.co.csj.backsys.common.property.ResourceBundleUtf8Control;
import jp.co.csj.backsys.mapper.HeathCheckMapper;

public abstract class AbsBatch extends AbsLogger{

	public AbsBatch() {
		super();
	}

    /** バッチ実行結果 0:成功. */
    public static final int BATCH_RET_SUCCESS = 0;

    /** バッチ実行結果 1:異常. */
    public static final int BATCH_RET_ERROR = 1;

    /** 共通プロパティ. */
    private Properties commonProp;

    /** アプリケーションコンテクスト. */
    private ApplicationContext applicationContext;

    /** バッチID. */
    protected String batchId;

    /** バッチ名前. */
    protected String batchNm;

    protected List<String> dbHeathLst;

    private Date beginDate = new Date();

    /** 暗号化復号化キー */
    private String dpsColumnKey;

    /**
     * プロパティファイルを読み込み.
     *
     * @throws Throwable システムエラー
     */
    public void setup() throws Throwable {

        String propFile = "classpath:spring/applicationContext.xml";

        // アプリケーションコンテクストを初期化する
        try {
            applicationContext = new ClassPathXmlApplicationContext(propFile);
        } catch (Exception e) {
            log.error(MessageFormat.format(DpsMessageKey.E1001_J, propFile, getBatchId()) + DpsConsts.STR_KAKO_LEFT
                    + DpsMessageKey.E1001 + DpsConsts.STR_KAKO_RIGHT);
            throw e;
        }

        try {
            // プロパティファイルを読み込み
            commonProp = DpsProperties.getCommonProperties();
        } catch (Exception e) {
            log.error(MessageFormat.format(DpsMessageKey.E1001_J,
                    DpsProperties.RESOURCE_BUNDLE + DpsConsts.STR_DOT + ResourceBundleUtf8Control.PROPERTY_EXT,
                    getBatchId()) + DpsConsts.STR_KAKO_LEFT + DpsMessageKey.E1001 + DpsConsts.STR_KAKO_RIGHT);
            throw e;
        }
        log.info(DpsProperties.getMsg(DpsMessageKey.BATCH_VERSION, getBatchId()));
    }

    /**
     * 環境変数をチェックする.
     */
    public abstract void checkSys() throws Throwable;

    /**
     * プロパティ存在チェック処理を行う.
     *
     * @throws Throwable システムエラー
     */
    public abstract void checkProperties() throws Throwable;

    /**
     * バッチ実行する前の準備を行う.
     *
     * @throws Throwable システムエラー
     */
    public void preRun() throws Throwable {

        // 環境変数存在チェック
        log.info(DpsProperties.getMsgLog(DpsMessageKey.I0002, DpsConsts.MSG_START, getBatchId()));
        checkSys();
        log.info(DpsProperties.getMsgLog(DpsMessageKey.I0002, DpsConsts.MSG_END, getBatchId()));

        // プロパティ存在チェック
        log.info(DpsProperties.getMsgLog(DpsMessageKey.I0003, DpsConsts.MSG_START, getBatchId()));
        checkProperties();
        log.info(DpsProperties.getMsgLog(DpsMessageKey.I0003, DpsConsts.MSG_END, getBatchId()));

        // データベースのヘルスチェック
        log.info(DpsProperties.getMsgLog(DpsMessageKey.I0004, DpsConsts.MSG_START, getBatchId()));
        dbHeathCheck();
        log.info(DpsProperties.getMsgLog(DpsMessageKey.I0004, DpsConsts.MSG_END, getBatchId()));
    }

    /**
     * 初期化を行う.
     *
     * @throws Throwable システムエラー
     */
    public abstract void init() throws Throwable;


    /**
     * 主処理を行う.
     *
     * @throws Throwable システムエラー
     */
    public abstract void run() throws Throwable;

    /**
     * 後処理を行う.
     *
     * @throws Throwable システムエラー
     */
    public void afterRun() {
        Date endDate = new Date();
        log.info("beginTime:[" + DpsUtilsDate.getFormatDate(beginDate, DpsConsts.YYYY_MM_DD_HH_MM_SS_SLASH_24)
                + "] endTime:[" + DpsUtilsDate.getFormatDate(endDate, DpsConsts.YYYY_MM_DD_HH_MM_SS_SLASH_24)
                + "] costTime:[" + DpsUtilsDate.longTimeToDay(endDate.getTime() - beginDate.getTime()) + "]");
    }

    /**
     * バッチ実行流れ.
     *
     * @throws Throwable システムエラー
     */
    public void produce() {
        try {

            // プロパティファイルを読み込み.
            setup();

            log.info(DpsProperties.getMsgLog(DpsMessageKey.I0001, DpsConsts.MSG_START, getBatchId()));

            // バッチ実行する前の準備を行う.
            preRun();

            // 初期化を行う.
            init();

            // 主処理を行う.
            run();
            log.info(DpsProperties.getMsgLog(DpsMessageKey.I0001, DpsConsts.MSG_END, getBatchId()));

            // 後処理を行う.
            afterRun();

            System.exit(BATCH_RET_SUCCESS);
        } catch (Throwable e) {

        	new DpsExceptionHandle(e).outputLog();

            try {
                // バッチ異常発生しました。
                log.error(DpsProperties.getMsgLog(DpsMessageKey.E0001, getBatchId()));
            } catch (Throwable e2) {
                // 処理なし
            }

            // 後処理を行う.
            afterRun();

            System.exit(BATCH_RET_ERROR);
        }
    }

    /**
     * データベースのヘルスチェックを行う.
     *
     * @throws Throwable システムエラー
     */
    public void dbHeathCheck() throws Throwable {

        boolean isOk = true;

        try {
            HeathCheckMapper heathCheckMapper =
                    (HeathCheckMapper) getApplicationContext().getBean("heathCheckMapper");
            heathCheckMapper.heathCheck();

            // データベースのヘルスチェックは正常です。（データベース名前：{0}）（バッチID：{1}）
            log.info(DpsProperties.getMsgLog(DpsMessageKey.I0006, "", getBatchId()));

        } catch (Throwable e) {
        	new DpsExceptionHandle(e).outputLog();
            // データベースのヘルスチェックは通れません。
            log.error(DpsProperties.getMsgLog(DpsMessageKey.E1005, "", getBatchId()));
            isOk = false;
        }

        if (!isOk) {
            throw new Throwable("dbHeathCheck error");
        }

    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public Properties getCommonProp() {
        return commonProp;
    }

    public void setCommonProp(Properties commonProp) {
        this.commonProp = commonProp;
    }

    public List<String> getDbHeathLst() {
        return dbHeathLst;
    }

    public void setDbHeathLst(List<String> dbHeathLst) {
        this.dbHeathLst = dbHeathLst;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getBatchNm() {
        return batchNm;
    }

    public void setBatchNm(String batchNm) {
        this.batchNm = batchNm;
    }

	public String getDpsColumnKey() {
		return dpsColumnKey;
	}

	public void setDpsColumnKey() {

	}

}
