/*****************************************************************************
 * プログラム ：AbsLogger.java バッチの親クラス(ログ用).
 *****************************************************************************
 * 変更履歴： 2020.02.12 : 新規作成
 ******************************************************************************/
package jp.co.csj.backsys.batch.abs;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;

import jp.co.csj.backsys.common.CsjConsts;

public class AbsLogger extends FileAppender{

	public static Logger log  = null;

	public AbsLogger() {

		super();
		System.setProperty(CsjConsts.SYS_CSJ_APP_LOG, System.getenv(CsjConsts.SYS_CSJ_APP_LOG));
		log = Logger.getLogger(AbsLogger.class);
	}

}
