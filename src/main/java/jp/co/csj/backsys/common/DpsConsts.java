/*****************************************************************************
 * プログラム ：DpsConsts.java
 * 定数クラス.
 *****************************************************************************
 * 変更履歴： 2020.02.12 : 新規作成
 ******************************************************************************/

package jp.co.csj.backsys.common;

public class DpsConsts {

	/** URLの一部（LIQUID） */
	public static final String LIQUID_USE = "LIQUID API";

	/** URLの一部（LIQUID） */
	public static final String JSFRONT_USE = "JSFRONT API";

	/** URLの一部（LIQUID） */
	public static final String SYS_LIQUID_API_URL = "LIQUID_API_URL";

	/** APIキー：LIQUID側から払い出されるキー */
	public static final String SYS_LIQUID_API_KEY = "LIQUID_API_KEY";

	/** URLの一部（MCS） */
	public static final String SYS_MCS_API_URL = "MCS_API_URL";

	/** BACKOFFICE_DATABASE_HOST */
	public static final String SYS_BACKOFFICE_DATABASE_HOST = "BACKOFFICE_DATABASE_HOST";
	/** BACKOFFICE_DATABASE_PORT */
	public static final String SYS_BACKOFFICE_DATABASE_PORT = "BACKOFFICE_DATABASE_PORT";
	/** BACKOFFICE_DATABASE */
	public static final String SYS_BACKOFFICE_DATABASE = "BACKOFFICE_DATABASE";
	/** BACKOFFICE_DATABASE_USER */
	public static final String SYS_BACKOFFICE_DATABASE_USER = "BACKOFFICE_DATABASE_USER";
	/** BACKOFFICE_DATABASE_PASSWORD */
	public static final String SYS_BACKOFFICE_DATABASE_PASSWORD = "BACKOFFICE_DATABASE_PASSWORD";
	/** BACKOFFICE_DATABASE_SSL_CA */
	// public static final String SYS_BACKOFFICE_DATABASE_SSL_CA = "BACKOFFICE_DATABASE_SSL_CA";
	/** BACKOFFICE_DATABASE_ENCRYPT_KRY */
	public static final String SYS_BACKOFFICE_DATABASE_ENCRYPT_KRY = "BACKOFFICE_DATABASE_ENCRYPT_KRY";

	/** J_SCORE_API_DATABASE_HOST */
	public static final String SYS_J_SCORE_API_DATABASE_HOST = "J_SCORE_API_DATABASE_HOST";
	/** J_SCORE_API_DATABASE_PORT */
	public static final String SYS_J_SCORE_API_DATABASE_PORT = "J_SCORE_API_DATABASE_PORT";
	/** J_SCORE_API_DATABASE */
	public static final String SYS_J_SCORE_API_DATABASE = "J_SCORE_API_DATABASE";
	/** J_SCORE_API_DATABASE_USER */
	public static final String SYS_J_SCORE_API_DATABASE_USER = "J_SCORE_API_DATABASE_USER";
	/** J_SCORE_API_DATABASE_PASSWORD */
	public static final String SYS_J_SCORE_API_DATABASE_PASSWORD = "J_SCORE_API_DATABASE_PASSWORD";
	/** J_SCORE_API_DATABASE_SSL_CA */
	// public static final String SYS_J_SCORE_API_DATABASE_SSL_CA = "J_SCORE_API_DATABASE_SSL_CA";

	/** SCR_BATCH_DB_DATABASE_HOST */
	public static final String SYS_SCRBATCH_DATABASE_HOST = "SCRBATCH_DATABASE_HOST";
	/** SCR_BATCH_DB_DATABASE_PORT */
	public static final String SYS_SCRBATCH_DATABASE_PORT = "SCRBATCH_DATABASE_PORT";
	/** SCR_BATCH_DB_DATABASE */
	public static final String SYS_SCRBATCH_DATABASE = "SCRBATCH_DATABASE";
	/** SCR_BATCH_DB_DATABASE_USER */
	public static final String SYS_SCRBATCH_DATABASE_USER = "SCRBATCH_DATABASE_USER";
	/** SCRBATCH_DATABASE_PASSWORD */
	public static final String SYS_SCRBATCH_DATABASE_PASSWORD = "SCRBATCH_DATABASE_PASSWORD";
	/** SCR_BATCH_DB_DATABASE_SSL_CA */
	// public static final String SYS_SCRBATCH_DATABASE_SSL_CA = "SCRBATCH_DATABASE_SSL_CA";

	/** DATABASE_SSL_CA_PASSWORD */
	public static final String SYS_DATABASE_SSL_CA_PASSWORD = "DATABASE_SSL_CA_PASSWORD";
	/** DATABASE_SSL_CA */
	public static final String SYS_DATABASE_SSL_CA = "DATABASE_SSL_CA";

	/** mail:AWS_CLIENT_REGION */
	public static final String SYS_AWS_CLIENT_REGION = "AWS_CLIENT_REGION";
	/** mail:SES_ROLE_ARN */
	public static final String SYS_SES_ROLE_ARN = "SES_ROLE_ARN";
	/** mail:SES_PROFILE_NAME */
	public static final String SYS_SES_PROFILE_NAME = "SES_PROFILE_NAME";
	/** mail:SES_EXTERNAL_ID */
	public static final String SYS_SES_EXTERNAL_ID = "SES_EXTERNAL_ID";

	/** DPS_APP_LOG */
	public static final String SYS_DPS_APP_LOG = "DPS_APP_LOG";

	/** PDSへのファイル送信 */
	public static final String SYS_PDS_AUTHENTICATION_URL = "PDS_AUTHENTICATION_URL";
	public static final String SYS_PDS_CLIENT_ID = "PDS_CLIENT_ID";
	public static final String SYS_PDS_USER_NAME = "PDS_USER_NAME";
	public static final String SYS_PDS_USER_PASSWORD = "PDS_USER_PASSWORD";
	public static final String SYS_PDS_DATA_URL = "PDS_DATA_URL";

	/** https_proxy http://xxx.xxx.xxx.xxx:9999 */
	public static final String SYS_HTTPS_PROXY = "https_proxy";

	/** リスポンス 200:正常 */
	public static final int HTTP_STATUS_CODE_200 = 200;

	/** リスポンス 201:正常 */
	public static final int HTTP_STATUS_CODE_201 = 201;

	/** リスポンス 204:正常 */
	public static final int HTTP_STATUS_CODE_204 = 204;

	/** 文字列定数：全角スペース 「　」*/
	public static final String STR_ZENKAKU_SPACE = "　";

	/** 文字列定数：全角スペース 「 」*/
	public static final String STR_HANKAKU_SPACE = " ";

	/** 文字列定数： 「.」 */
	public static final String STR_DOT = ".";

	/** 文字列定数： 「:」 */
	public static final String STR_CORON = ":";

	/** 文字列定数： 「,」 */
	public static final String STR_CONMA = ",";

	/** 文字列定数： 「(」 */
	public static final String STR_KAKO_LEFT = "(";

	/** 文字列定数： 「)」 */
	public static final String STR_KAKO_RIGHT = ")";

	/** 文字列定数： 「"」 */
	public static final String STR_DOUBLE_QUOTATION = "\"";

	/** エンコード */
	public static final String CHAR_CODE = "UTF-8";

	public static final String YYYY_MM_DD = "yyyyMMdd";
	public static final String YYYY_MM_DD_HH_MM_SS_SSS_SLASH_24 = "yyyy/MM/dd HH:mm:ss:SSS";

	public static final String YYYY_MM_DD_HH_MM_SS_SLASH_24 = "yyyy/MM/dd HH:mm:ss";

	public static final String YYYY_MM_DD_H_MM_SS_SLASH_24 = "yyyy/MM/dd H:mm:ss";

	public static final String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";

	public static final String YYYY_MM_SLASH = "yyyy/MM";

	public static final String YYYY_MM_DD_SLASH = "yyyy/MM/dd";

	public static final String YYYY_MM_JP = "yyyy年MM月";

	public static final String YYYY = "yyyy";

	public static final String MM = "MM";

	public static final String DD = "dd";

	public static final String YYYY_MM = "yyyyMM";

	/** ログメッセージ：開始 */
	public static final String MSG_START = "開始";

	/** ログメッセージ：終了 */
	public static final String MSG_END = "終了";

	/** ログメッセージ：MGR */
	public static final String MSG_MGR = "MGR";

	/** ログメッセージ：S3 */
	public static final String MSG_S3 = "S3";

	/** ログメッセージ：PDS */
	public static final String MSG_PDS = "PDS";

	/** ログメッセージ：IF */
	public static final String MSG_IF = "IF";

	public static final String STR_ENTER = "\n";

	/** 本人確認結果登録API */
	public static final String API_JP_PERSON_CONFIRM_RET_INS = "本人確認結果登録API";
	/** OCR結果取得API */
	public static final String API_JP_API_URL_OCR_RET_GET = "OCR結果取得API";
	/** 自動判定結果取得API */
	public static final String API_JP_AUTO_JUDGE_RET_GET = "自動判定結果取得API";
	/** 画像データ取得API */
	public static final String API_JP_IMAGE_DATA_GET = "画像データ取得API";
	/** 口座開設結果登録API */
	public static final String API_JP_ACCOUNT_OPEN_RET_GET = "口座開設結果登録API";
	/** JVアカウント情報更新API */
	public static final String API_JP_JV_ACCOUNT_INFO_UPT = "JVアカウント情報更新API";
	/** JVアカウント情報参照API */
	public static final String API_JP_JV_ACCOUNT_INFO_REF = "JVアカウント情報参照API";
	/** 反社依頼API(JsFrontApp) */
	public static final String API_JP_JV_HX = "JVアカウント情報更新(反社依頼)API";
	/** マスキングフラグ=無（未済） */
	public static final String LOG_WHEN_NO_MASK = "マスキングフラグ=無（未済）";
	/** マスキングフラグ=無（未済） */
	public static final String LOG_IMG_HAVE = "正面画像データ存在";
	/** API呼出時間間隔 */
	public static final String LOG_J_API_SLEEP = "API呼出時間間隔";
	/** API再呼出最大回数 */
	public static final String LOG_J_API_TIMES = "API再呼出最大回数";
	/** API接続タイムアウト */
	public static final String LOG_J_API_TIMEOUT = "API接続タイムアウト";
	/** データベース接続 */
	public static final String LOG_J_DB_CONECT_USE = "データベース接続";
	/** メール配信 */
	public static final String LOG_J_MAIL_SEND = "メール配信";

	/** メール件名 */
	public static final String LOG_J_MAIL_TITLE = "メール件名";
	/** メール差出人 */
	public static final String LOG_J_MAIL_SENDER = "メール差出人";

	/** ログ出力場所 */
	public static final String LOG_J_LOG_PATH = "ログ出力場所";

	/** PDSへのファイル送信用、Token（IDトークン）取得用 */
	public static final String LOG_J_PDS_OR_TOKEN_USE = "PDSへのファイル送信用、Token（IDトークン）取得用";

	/** ファイル出力フォルダー用 */
	public static final String LOG_J_OUTPUT_FOLDER = "ファイル出力フォルダー用";
	/** ファイル出力フォルダーBK用 */
	public static final String LOG_J_OUTPUT_FOLDER_BK = "ファイル出力フォルダーBK用";
	/** オファー企業毎同意ファイル作成 */
	public static final String LOG_J_OUTPUT_FILE_ENTERPRISE = "オファー企業毎同意ファイル作成用";
	/** ユーザ毎パーソナルデータファイル作成 */
	public static final String LOG_J_OUTPUT_PERSONAL = "ユーザ毎パーソナルデータファイル作成用";
	/** S3用 */
	public static final String LOG_J_OUTPUT_S3_USE = "S3用";

	/** http://xxx.xxx.xxx.xxx:9999 */
	public static final String LOG_J_HTTPS_PROXY = "proxy(http://xxx.xxx.xxx.xxx:9999)";

	/** OCR */
	public static final String LOG_J_OCR_VAL = "OCR";

	/** 入力 */
	public static final String LOG_J_HAND_VAL = "入力";
	/** 姓名 */
	public static final String LOG_J_NM = "氏名";
	/** 住所 */
	public static final String LOG_J_ADDRESS = "住所";
	/** 生年月日 */
	public static final String LOG_J_BIRTH_DAY = "生年月日";
	/** 顔写真照合結果 */
	public static final String LOG_J_FACE_PHOTO = "顔写真照合結果";

	/** 更新 */
	public static final String LOG_J_UPT = "更新";
	/** 登録 */
	public static final String LOG_J_INS = "登録";

	/** CID */
	public static final String STR_CID = "CID";

	/** sucessful.txt */
	public static final String STR_SUCESSFUL_FILE_NAME = "sucessful.txt";

	/** sucessful.txt 0 */
	public static final String STR_SUCESSFUL_STATUS = "0";

	/** {0} */
	public static final String STR_PLACEHOLDER = "{0}";

	/** ^\\d{n}$ */
	public static final String REG_NUM_14 = "\\d{14}";

	/** ^\\d{n}$ */
	public static final String REG_NUM_2 = "\\d{2}";
	/** ^\\d{n}$ */
	public static final String REG_NUM_4 = "\\d{4}";

	public static final String SYS_ENV_FILE_DIV = System.getProperty("file.separator");

	public static final String SYS_ENV_FOLDER_RESOURCES = System.getProperty("user.dir") + SYS_ENV_FILE_DIV + "src"
			+ SYS_ENV_FILE_DIV + "main" + SYS_ENV_FILE_DIV + "resources" + SYS_ENV_FILE_DIV;

	public static final String SYS_ENV_MAIL_RESOURCES = SYS_ENV_FOLDER_RESOURCES + "mail" + SYS_ENV_FILE_DIV;

	public static final String STR_EMPTY = "";

	public static final String STR_BK = "bk";



}
