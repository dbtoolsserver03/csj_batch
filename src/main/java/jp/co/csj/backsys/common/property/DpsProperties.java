/*****************************************************************************
 * プログラム ：DpsProperties.java
 * 説明 ：dsp-batch.propertiesからデータを取得する.
 *****************************************************************************
 * 変更履歴： 2020.02.12 : 新規作成
 ******************************************************************************/

package jp.co.csj.backsys.common.property;

import java.text.MessageFormat;
import java.util.Enumeration;
import java.util.Properties;
import java.util.ResourceBundle;

import jp.co.csj.backsys.common.DpsConsts;

public class DpsProperties {

    /** batch version*/
    public static final String BATCH_VERSION = "BATCH_VERSION";

    /** Liquid Header Key*/
    public static final String API_LIQUID_HEADER_API_KEY = "API_LIQUID_HEADER_API_KEY";

    /** 本人確認結果登録API */
    public static final String API_URL_PERSON_CONFIRM_RET_INS = "API_URL_PERSON_CONFIRM_RET_INS";

    /** OCR結果取得API */
    public static final String API_URL_OCR_RET_GET = "API_URL_OCR_RET_GET";

    /** 自動判定結果取得API */
    public static final String API_URL_AUTO_JUDGE_RET_GET = "API_URL_AUTO_JUDGE_RET_GET";

    /** 画像データ取得API */
    public static final String API_URL_IMAGE_DATA_GET = "API_URL_IMAGE_DATA_GET";

    /** 口座開設結果登録API */
    public static final String API_URL_ACCOUNT_OPEN_RET_GET = "API_URL_ACCOUNT_OPEN_RET_GET";

    public static final String Bt004_EXECUDE_DATE = "Bt004_EXECUDE_DATE";
    /** メール配信 VMファイル */
    public static final String Bt001_MAIL_VM_FILE = "Bt001_MAIL_VM_FILE";
    public static final String Bt003_MAIL_VM_FILE = "Bt003_MAIL_VM_FILE";
    public static final String Bt004_MAIL_VM_FILE = "Bt004_MAIL_VM_FILE";
    public static final String Bt005_MAIL_VM_FILE = "Bt005_MAIL_VM_FILE";

    /** リソースバンドル：バッチ */
	public static final String RESOURCE_BUNDLE = "dps-batch";

	/** 共通プロパティ */
	private static Properties commonProperties;

	/** 出力フォルダー */
	public static final String Bt001_OUTPUT_FOLDER = "Bt001_OUTPUT_FOLDER";
	public static final String Bt003_OUTPUT_FOLDER = "Bt003_OUTPUT_FOLDER";
	public static final String Bt004_OUTPUT_FOLDER = "Bt004_OUTPUT_FOLDER";


    /** オファー企業毎同意ファイル作成  出力ファイル*/
    public static final String Bt001_OUTPUT_FILENAME_ENTERPRISE = "Bt001_OUTPUT_FILENAME_ENTERPRISE";

    /** 対価管理データファイル作成 出力ファイル */
    public static final String Bt001_OUTPUT_FILENAME_PERSONAL = "Bt001_OUTPUT_FILENAME_PERSONAL";

    /** S3出力フォルダー */
    public static final String Bt001_S3_FOLDER = "Bt001_S3_FOLDER";
    public static final String Bt003_S3_FOLDER = "Bt003_S3_FOLDER";
    public static final String Bt004_S3_FOLDER = "Bt004_S3_FOLDER";

	/** IF出力フォルダー */
    public static final String Bt001_IF_OUTPUT_FOLDER = "Bt001_IF_OUTPUT_FOLDER";
    /** IF出力フォルダーBK */
    public static final String Bt001_IF_OUTPUT_FOLDER_BK = "Bt001_IF_OUTPUT_FOLDER_BK";

	/**
	 * コンストラクタ
	 */
	private DpsProperties() {
		// ※外部からインスタンス生成不可
	}

	/**
	 * 共通プロパティの取得
	 * @return	共通プロパティ
	 */
	public static Properties getCommonProperties() {

		if (commonProperties == null) {

			// プロパティがnullの場合、プロパティを生成
			createCommonProperties();
		}

		return commonProperties;
	}

	/**
	 * 共通プロパティの生成
	 */
	private static void createCommonProperties() {

		// 共通プロパティ
		commonProperties = new Properties();

		// 共通プロパティファイルから設定
		setCommonPropertiesByPropertiesFile();
	}

	/**
	 * 共通プロパティの設定（共通プロパティファイルから設定）
	 */
	private static void setCommonPropertiesByPropertiesFile() {

		// 共通プロパティファイル
		ResourceBundle resourceBundle = ResourceBundle.getBundle(RESOURCE_BUNDLE,
				new ResourceBundleUtf8Control());

		// 共通プロパティファイルから共通プロパティを設定
		Enumeration<String> enumeration = resourceBundle.getKeys();

		while (enumeration.hasMoreElements()) {
			String key = enumeration.nextElement();
			commonProperties.setProperty(key, resourceBundle.getString(key));
		}
	}

	/**
	 * 共通プロパティの設定
	 * @param key キー
	 * @param value	 値
	 */
	public static void setCommonProperties(String key, String value) {

		if (commonProperties == null) {

			// 共通プロパティがnullの場合、プロパティを生成
			createCommonProperties();
		}

		// 共通プロパティの設定
		commonProperties.setProperty(key, value);
	}

    /**
     * メッセージの作成.
     *
     * @param messageKey メッセージキー
     * @param messageAddInfo メッセージ追加情報
     * @return メッセージ
     *
     * @throws Throwable システムエラー
     */
    public static String getMsg(String messageKey, Object... messageAddInfo) {

        // メッセージの設定
        String messageFromProperty = commonProperties.getProperty(messageKey);
        String msg = MessageFormat.format(messageFromProperty, messageAddInfo);
        return msg;
    }

    /**
     * メッセージの作成.
     *
     * @param messageKey メッセージ値
     * @param messageAddInfo メッセージ追加情報
     * @return メッセージ
     *
     * @throws Throwable システムエラー
     */
    public static String getMsgVal(String messageVal, Object... messageAddInfo) {

        // メッセージの設定
        return MessageFormat.format(messageVal, messageAddInfo);
    }

    /**
     * メッセージログの作成.
     *
     * @param messageKey メッセージキー
     * @param messageAddInfo メッセージ追加情報
     * @return メッセージ
     *
     * @throws Throwable システムエラー
     */
    public static String getMsgLog(String messageKey, Object... messageAddInfo) {

        return DpsConsts.STR_KAKO_LEFT + messageKey + DpsConsts.STR_KAKO_RIGHT + getMsg(messageKey, messageAddInfo);
    }
}
