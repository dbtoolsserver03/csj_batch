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
import jp.co.csj.backsys.common.DpsConsts;
import jp.co.csj.backsys.common.DpsUtils;
import jp.co.csj.backsys.common.message.DpsMessageKey;
import jp.co.csj.backsys.common.property.DpsProperties;

public class CkCommon {

    /** ログ出力用. */
    private static Logger log = Logger.getLogger(CkCommon.class);

    private AbsApiBatch batch;

    public CkCommon(AbsApiBatch batch) {
        this.batch = batch;
    }


    public void setDpsDbSys(Map<String, String> map) {

        // BACKOFFICE_DATABASE
        map.put(DpsConsts.SYS_BACKOFFICE_DATABASE_HOST, DpsConsts.LOG_J_DB_CONECT_USE);
        map.put(DpsConsts.SYS_BACKOFFICE_DATABASE, DpsConsts.LOG_J_DB_CONECT_USE);
        map.put(DpsConsts.SYS_BACKOFFICE_DATABASE_USER, DpsConsts.LOG_J_DB_CONECT_USE);
        map.put(DpsConsts.SYS_BACKOFFICE_DATABASE_PASSWORD, DpsConsts.LOG_J_DB_CONECT_USE);
        map.put(DpsConsts.SYS_BACKOFFICE_DATABASE_PORT, DpsConsts.LOG_J_DB_CONECT_USE);
        //map.put(DpsConsts.SYS_BACKOFFICE_DATABASE_SSL_CA, DpsConsts.LOG_J_DB_CONECT_USE);
        map.put(DpsConsts.SYS_BACKOFFICE_DATABASE_ENCRYPT_KRY, DpsConsts.LOG_J_DB_CONECT_USE);
    }
	public void setFrontDbSys(Map<String, String> map) {
        map.put(DpsConsts.SYS_J_SCORE_API_DATABASE_HOST, DpsConsts.LOG_J_DB_CONECT_USE);
        map.put(DpsConsts.SYS_J_SCORE_API_DATABASE, DpsConsts.LOG_J_DB_CONECT_USE);
        map.put(DpsConsts.SYS_J_SCORE_API_DATABASE_USER, DpsConsts.LOG_J_DB_CONECT_USE);
        map.put(DpsConsts.SYS_J_SCORE_API_DATABASE_PASSWORD, DpsConsts.LOG_J_DB_CONECT_USE);
        map.put(DpsConsts.SYS_J_SCORE_API_DATABASE_PORT, DpsConsts.LOG_J_DB_CONECT_USE);
        //map.put(DpsConsts.SYS_J_SCORE_API_DATABASE_SSL_CA, DpsConsts.LOG_J_DB_CONECT_USE);
	}

	public void setScrbatchDbSys(Map<String, String> map) {
        map.put(DpsConsts.SYS_SCRBATCH_DATABASE_HOST, DpsConsts.LOG_J_DB_CONECT_USE);
        map.put(DpsConsts.SYS_SCRBATCH_DATABASE, DpsConsts.LOG_J_DB_CONECT_USE);
        map.put(DpsConsts.SYS_SCRBATCH_DATABASE_USER, DpsConsts.LOG_J_DB_CONECT_USE);
        map.put(DpsConsts.SYS_SCRBATCH_DATABASE_PASSWORD, DpsConsts.LOG_J_DB_CONECT_USE);
        map.put(DpsConsts.SYS_SCRBATCH_DATABASE_PORT, DpsConsts.LOG_J_DB_CONECT_USE);
        //map.put(DpsConsts.SYS_SCRBATCH_DATABASE_SSL_CA, DpsConsts.LOG_J_DB_CONECT_USE);
	}

	public void setMailSys(Map<String, String> map) {
        map.put(DpsConsts.SYS_AWS_CLIENT_REGION, DpsConsts.LOG_J_MAIL_SEND);
        map.put(DpsConsts.SYS_SES_ROLE_ARN, DpsConsts.LOG_J_MAIL_SEND);
        map.put(DpsConsts.SYS_SES_PROFILE_NAME, DpsConsts.LOG_J_MAIL_SEND);
        map.put(DpsConsts.SYS_SES_EXTERNAL_ID, DpsConsts.LOG_J_MAIL_SEND);
	}
	public void setSslCa(Map<String, String> map) {
		map.put(DpsConsts.SYS_DATABASE_SSL_CA_PASSWORD, DpsConsts.LOG_J_DB_CONECT_USE);
		map.put(DpsConsts.SYS_DATABASE_SSL_CA, DpsConsts.LOG_J_DB_CONECT_USE);

	}
	/**
	 * PDSへのファイル送信用&Token（IDトークン）取得用
	 *
	 * @param map
	 */
	public void setPdsAndTokenSys(Map<String, String> map) {
		map.put(DpsConsts.SYS_PDS_AUTHENTICATION_URL, DpsConsts.LOG_J_PDS_OR_TOKEN_USE);
		map.put(DpsConsts.SYS_PDS_CLIENT_ID, DpsConsts.LOG_J_PDS_OR_TOKEN_USE);
		map.put(DpsConsts.SYS_PDS_USER_NAME, DpsConsts.LOG_J_PDS_OR_TOKEN_USE);
		map.put(DpsConsts.SYS_PDS_USER_PASSWORD, DpsConsts.LOG_J_PDS_OR_TOKEN_USE);
		map.put(DpsConsts.SYS_PDS_DATA_URL, DpsConsts.LOG_J_PDS_OR_TOKEN_USE);
	}

	/**
	 * ログフォルダー
	 *
	 * @param map
	 */
	public void setCommonSys(Map<String, String> map) {
        // log
        map.put(DpsConsts.SYS_DPS_APP_LOG, DpsConsts.LOG_J_LOG_PATH);
	}
	/**
	 * JsFrontAPI用
	 *
	 * @param map
	 */
	public void setJsFrontApISys(Map<String, String> map) {
        // http://xxx.xxx.xxx.xxx:9999
        map.put(DpsConsts.SYS_HTTPS_PROXY, DpsConsts.LOG_J_HTTPS_PROXY);

        // URLの一部（MCS）を取得する。
        map.put(DpsConsts.SYS_MCS_API_URL, DpsConsts.JSFRONT_USE);
	}

	/**
	 * LiquidAPI用
	 *
	 * @param map
	 */
	public void setLiquidSys(Map<String, String> map) {

	    // http://xxx.xxx.xxx.xxx:9999
	    map.put(DpsConsts.SYS_HTTPS_PROXY, DpsConsts.LOG_J_HTTPS_PROXY);

	    // URLの一部（LIQUID）を取得する。
	    map.put(DpsConsts.SYS_LIQUID_API_URL, DpsConsts.LIQUID_USE);

	    // APIキー：LIQUID側から払い出されるキーを取得する。
	    map.put(DpsConsts.SYS_LIQUID_API_KEY, DpsConsts.LIQUID_USE);

	}

	public void checkMailVmFileProperties(String vmFileNmKey) throws Throwable {
		Map<String, String> map = new LinkedHashMap<String, String>();

        // メール配信 VMファイル
        map.put(vmFileNmKey, DpsConsts.LOG_J_MAIL_SEND);

        if (!DpsUtils.checkProperties(map, DpsMessageKey.E1003, batch.getBatchId())) {
            throw new Throwable(DpsProperties.getMsgLog(DpsMessageKey.E0001, batch.getBatchId()));
        }

        File f = new File(DpsConsts.SYS_ENV_MAIL_RESOURCES + DpsProperties.getMsg(vmFileNmKey));
        if (f != null && f.isFile()) {
			// 処理なし
		} else {
			log.error(DpsProperties.getMsgLog(DpsMessageKey.E1001, DpsProperties.getMsg(vmFileNmKey), batch.getBatchId()));
            throw new Throwable(DpsProperties.getMsgLog(DpsMessageKey.E0001, batch.getBatchId()));
		}
	}

}
