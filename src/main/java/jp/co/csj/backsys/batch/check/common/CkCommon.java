/*****************************************************************************
 * プログラム ：CkCommon.java
 * 説明 ：チェック共通クラス.
 *****************************************************************************
 * 変更履歴： 2020.02.12 : 新規作成
 ******************************************************************************/

package jp.co.csj.backsys.batch.check.common;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import jp.co.csj.backsys.batch.abs.AbsApiBatch;
import jp.co.csj.backsys.common.CsjConsts;
import jp.co.csj.backsys.common.CsjUtils;
import jp.co.csj.backsys.common.message.CsjMessageKey;
import jp.co.csj.backsys.common.property.CsjProperties;

public class CkCommon {

    /** ログ出力用. */
    private static Logger log = Logger.getLogger(CkCommon.class);

    private AbsApiBatch batch;

    public CkCommon(AbsApiBatch batch) {
        this.batch = batch;
    }


    public void setMydbDbSys(Map<String, String> map) {

        // BACKOFFICE_DATABASE
        map.put(CsjConsts.SYS_BACKOFFICE_DATABASE_HOST, CsjConsts.LOG_J_DB_CONECT_USE);
        map.put(CsjConsts.SYS_BACKOFFICE_DATABASE, CsjConsts.LOG_J_DB_CONECT_USE);
        map.put(CsjConsts.SYS_BACKOFFICE_DATABASE_USER, CsjConsts.LOG_J_DB_CONECT_USE);
        map.put(CsjConsts.SYS_BACKOFFICE_DATABASE_PASSWORD, CsjConsts.LOG_J_DB_CONECT_USE);
        map.put(CsjConsts.SYS_BACKOFFICE_DATABASE_PORT, CsjConsts.LOG_J_DB_CONECT_USE);
        map.put(CsjConsts.SYS_BACKOFFICE_DATABASE_ENCRYPT_KRY, CsjConsts.LOG_J_DB_CONECT_USE);
    }
	public void setFrtDbSys(Map<String, String> map) {
        map.put(CsjConsts.SYS_J_SCORE_API_DATABASE_HOST, CsjConsts.LOG_J_DB_CONECT_USE);
        map.put(CsjConsts.SYS_J_SCORE_API_DATABASE, CsjConsts.LOG_J_DB_CONECT_USE);
        map.put(CsjConsts.SYS_J_SCORE_API_DATABASE_USER, CsjConsts.LOG_J_DB_CONECT_USE);
        map.put(CsjConsts.SYS_J_SCORE_API_DATABASE_PASSWORD, CsjConsts.LOG_J_DB_CONECT_USE);
        map.put(CsjConsts.SYS_J_SCORE_API_DATABASE_PORT, CsjConsts.LOG_J_DB_CONECT_USE);
	}

	public void setScrbDbSys(Map<String, String> map) {
        map.put(CsjConsts.SYS_SCRBATCH_DATABASE_HOST, CsjConsts.LOG_J_DB_CONECT_USE);
        map.put(CsjConsts.SYS_SCRBATCH_DATABASE, CsjConsts.LOG_J_DB_CONECT_USE);
        map.put(CsjConsts.SYS_SCRBATCH_DATABASE_USER, CsjConsts.LOG_J_DB_CONECT_USE);
        map.put(CsjConsts.SYS_SCRBATCH_DATABASE_PASSWORD, CsjConsts.LOG_J_DB_CONECT_USE);
        map.put(CsjConsts.SYS_SCRBATCH_DATABASE_PORT, CsjConsts.LOG_J_DB_CONECT_USE);
	}

	public void setMailSys(Map<String, String> map) {
        map.put(CsjConsts.SYS_AWS_CLIENT_REGION, CsjConsts.LOG_J_MAIL_SEND);
        map.put(CsjConsts.SYS_SES_ROLE_ARN, CsjConsts.LOG_J_MAIL_SEND);
        map.put(CsjConsts.SYS_SES_PROFILE_NAME, CsjConsts.LOG_J_MAIL_SEND);
        map.put(CsjConsts.SYS_SES_EXTERNAL_ID, CsjConsts.LOG_J_MAIL_SEND);
	}
	public void setSslCa(Map<String, String> map) {
		map.put(CsjConsts.SYS_DATABASE_SSL_CA_PASSWORD, CsjConsts.LOG_J_DB_CONECT_USE);
		map.put(CsjConsts.SYS_DATABASE_SSL_CA, CsjConsts.LOG_J_DB_CONECT_USE);

	}

	/**
	 * ログフォルダー
	 *
	 * @param map
	 */
	public void setCommonSys(Map<String, String> map) {
        // log
        map.put(CsjConsts.SYS_CSJ_APP_LOG, CsjConsts.LOG_J_LOG_PATH);
	}
	/**
	 * JsFrontAPI用
	 *
	 * @param map
	 */
	public void setJsFrontApISys(Map<String, String> map) {
        // http://xxx.xxx.xxx.xxx:9999
        map.put(CsjConsts.SYS_HTTPS_PROXY, CsjConsts.LOG_J_HTTPS_PROXY);

        // URLの一部（MCS）を取得する。
        map.put(CsjConsts.SYS_MCS_API_URL, CsjConsts.JSFRONT_USE);
	}

	/**
	 * LiquidAPI用
	 *
	 * @param map
	 */
	public void setLiquidSys(Map<String, String> map) {

	    // http://xxx.xxx.xxx.xxx:9999
	    map.put(CsjConsts.SYS_HTTPS_PROXY, CsjConsts.LOG_J_HTTPS_PROXY);

	    // URLの一部（LIQUID）を取得する。
	    map.put(CsjConsts.SYS_LIQUID_API_URL, CsjConsts.LIQUID_USE);

	    // APIキー：LIQUID側から払い出されるキーを取得する。
	    map.put(CsjConsts.SYS_LIQUID_API_KEY, CsjConsts.LIQUID_USE);

	}

	public void checkMailVmFileProperties(String vmFileNmKey) throws Throwable {
		Map<String, String> map = new LinkedHashMap<String, String>();

        // メール配信 VMファイル
        map.put(vmFileNmKey, CsjConsts.LOG_J_MAIL_SEND);

        if (!CsjUtils.checkProperties(map, CsjMessageKey.E1003, batch.getBatchId())) {
            throw new Throwable(CsjProperties.getMsgLog(CsjMessageKey.E0001, batch.getBatchId()));
        }

        File f = new File(CsjConsts.SYS_ENV_MAIL_RESOURCES + CsjProperties.getMsg(vmFileNmKey));
        if (f != null && f.isFile()) {
			// 処理なし
		} else {
			log.error(CsjProperties.getMsgLog(CsjMessageKey.E1001, CsjProperties.getMsg(vmFileNmKey), batch.getBatchId()));
            throw new Throwable(CsjProperties.getMsgLog(CsjMessageKey.E0001, batch.getBatchId()));
		}
	}

}
