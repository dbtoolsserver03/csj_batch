package jp.co.csj.backsys.sample;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import jp.co.csj.backsys.common.CsjConsts;
import jp.co.csj.backsys.common.CsjUtils;
import jp.co.csj.backsys.common.CsjUtilsFile;

public class CreateData {

	public static String S_KEY_STG = "'OcABRz4Jstr8qUUxLEVkSchg+En7DSEI5juJy50Rc6s='";
//	public static String S_KEY_DEV = "'q1JOOryC5YsTGP3yFUasuoJkfEBTJw5diM4fh8BG7tY='";


	public static String JVID_HEAD_STR = "FFF";
	public static int S_NUM = 55000;

	public static int picSliptCnt = 100;

	public static BufferedWriter writer;

	public static void main(String[] args) throws Throwable {

		writer = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("" + "all.sql"), "utf-8"));

		createFront();

//		System.out.println("hello".replaceAll("l", "aaa"));


		writer.close();
	}
	private static void createFront() throws Throwable {
		createDataProvisionHistories();
		createDataProvisionUserStatuses();
	}
	private static void createDataProvisionUserStatuses() throws Throwable {

		writer.write("START TRANSACTION ;");
		writer.newLine();
		writer.write("delete from `data_provision_user_statuses`;");// where `jv_id` like '"+JVID_HEAD_STR + "%';");
		writer.newLine();

		for (int i = 1; i <= S_NUM; i++) {
			StringBuffer sb = new StringBuffer();

			String tJvid = JVID_HEAD_STR + String.format("%07d", i);
			String tCid = JVID_HEAD_STR + String.format("%010d", i);

			sb.append("INSERT  ");
			sb.append("INTO data_provision_user_statuses(  ");
			sb.append("  jv_id ");
			sb.append("  , cid ");
			sb.append("  , agree ");
			sb.append("  , finished_identity_verification ");
			sb.append("  , company_statuses ");
			sb.append("  , search_conditions ");
			sb.append("  , pds_status ");
			sb.append("  , transfer_kinds ");
			sb.append("  , bank_accounts_updated_at ");
			sb.append("  , transfer_kinds_updated_at ");
			sb.append("  , created_at ");
			sb.append("  , updated_at ");
			sb.append(")  ");
			sb.append("VALUES (  ");
			sb.append("  '"+tJvid+"' ");
			sb.append("  , '"+tCid+"' ");
			sb.append("  , '1' ");
			sb.append("  , '2' ");
			sb.append("  , null ");
			sb.append("  , null ");
			sb.append("  , 1 ");
			sb.append("  , '{\"transfer_kind_id\": 1}' ");
			sb.append("  , null ");
			sb.append("  , null ");
			sb.append("  , '2020-07-02 00:00:00' ");
			sb.append("  , '2020-07-02 00:00:00' ");
			sb.append("); ");


			writer.write(sb.toString());
			writer.newLine();
		}
		writer.write("COMMIT;");
		writer.newLine();
	}


	private static void createDataProvisionHistories()  throws Throwable {

		writer.write("START TRANSACTION ;");
		writer.newLine();
		writer.write("delete from `data_provision_histories`;");// where `jv_id` like '"+JVID_HEAD_STR + "%';");
		writer.newLine();


		for (int i = 1; i <= 10000; i++) {
			StringBuffer sb = new StringBuffer();

			String tJvid = JVID_HEAD_STR + String.format("%07d", i);
			String tCid = JVID_HEAD_STR + String.format("%010d", i);

			sb.append("INSERT  ");
			sb.append("INTO data_provision_histories(  ");
			sb.append("  jv_id ");
			sb.append("  , company_id ");
			sb.append("  , offer_id ");
			sb.append("  , status_id ");
			sb.append("  , reward_amount ");
			sb.append("  , paid_status_id ");
			sb.append("  , provide_answer_count ");
			sb.append("  , created_at ");
			sb.append("  , updated_at ");
			sb.append(")  ");
			sb.append("VALUES (  ");
			sb.append("  '"+tJvid+"' ");
			sb.append("  , '3' ");// company_id
			sb.append("  , '99900101' ");// offer_id
			if (i<=5000) {
				sb.append("  , '4' ");// status_id
			} else {
				sb.append("  , '5' ");// status_id
			}

			sb.append("  , '500' ");// reward_amount
			sb.append("  , '0' ");// paid_status_id
			sb.append("  , null ");
			sb.append("  , '2020-06-02 00:00:00' ");
			sb.append("  , '2020-06-02 00:00:00' ");
			sb.append("); ");

			writer.write(sb.toString());
			writer.newLine();
		}
		for (int i = 10001; i <= 20000; i++) {
			StringBuffer sb = new StringBuffer();

			String tJvid = JVID_HEAD_STR + String.format("%07d", i);
			String tCid = JVID_HEAD_STR + String.format("%010d", i);

			sb.append("INSERT  ");
			sb.append("INTO data_provision_histories(  ");
			sb.append("  jv_id ");
			sb.append("  , company_id ");
			sb.append("  , offer_id ");
			sb.append("  , status_id ");
			sb.append("  , reward_amount ");
			sb.append("  , paid_status_id ");
			sb.append("  , provide_answer_count ");
			sb.append("  , created_at ");
			sb.append("  , updated_at ");
			sb.append(")  ");
			sb.append("VALUES (  ");
			sb.append("  '"+tJvid+"' ");
			sb.append("  , '3' ");// company_id
			sb.append("  , '99900101' ");// offer_id
			if (i<=12500) {
				sb.append("  , '10' ");// status_id
			} else if (i<=15000){
				sb.append("  , '20' ");// status_id
			} else if (i<=17500){
				sb.append("  , '30' ");// status_id
			} else {
				sb.append("  , '40' ");// status_id
			}

			sb.append("  , '500' ");// reward_amount
			sb.append("  , '0' ");// paid_status_id
			sb.append("  , null ");
			sb.append("  , '2020-06-02 00:00:00' ");
			sb.append("  , '2020-06-02 00:00:00' ");
			sb.append("); ");

			writer.write(sb.toString());
			writer.newLine();
		}

		for (int i = 20001; i <= 40000; i++) {
			StringBuffer sb = new StringBuffer();

			String tJvid = JVID_HEAD_STR + String.format("%07d", i);
			String tCid = JVID_HEAD_STR + String.format("%010d", i);

			sb.append("INSERT  ");
			sb.append("INTO data_provision_histories(  ");
			sb.append("  jv_id ");
			sb.append("  , company_id ");
			sb.append("  , offer_id ");
			sb.append("  , status_id ");
			sb.append("  , reward_amount ");
			sb.append("  , paid_status_id ");
			sb.append("  , provide_answer_count ");
			sb.append("  , created_at ");
			sb.append("  , updated_at ");
			sb.append(")  ");
			sb.append("VALUES (  ");
			sb.append("  '"+tJvid+"' ");
			sb.append("  , '3' ");// company_id
			sb.append("  , '99900101' ");// offer_id
			sb.append("  , '3' ");// status_id

			sb.append("  , '500' ");// reward_amount
			sb.append("  , '0' ");// paid_status_id
			sb.append("  , null ");
			sb.append("  , '2020-06-02 00:00:00' ");
			sb.append("  , '2020-06-02 00:00:00' ");
			sb.append("); ");

			writer.write(sb.toString());
			writer.newLine();
		}
		for (int i = 40001; i <= 120000; i++) {
			StringBuffer sb = new StringBuffer();

			String tJvid = JVID_HEAD_STR + String.format("%07d", i);
			String tCid = JVID_HEAD_STR + String.format("%010d", i);

			sb.append("INSERT  ");
			sb.append("INTO data_provision_histories(  ");
			sb.append("  jv_id ");
			sb.append("  , company_id ");
			sb.append("  , offer_id ");
			sb.append("  , status_id ");
			sb.append("  , reward_amount ");
			sb.append("  , paid_status_id ");
			sb.append("  , provide_answer_count ");
			sb.append("  , created_at ");
			sb.append("  , updated_at ");
			sb.append(")  ");
			sb.append("VALUES (  ");
			sb.append("  '"+tJvid+"' ");
			sb.append("  , '3' ");// company_id
			sb.append("  , '99900101' ");// offer_id
			sb.append("  , '1' ");// status_id
			sb.append("  , '500' ");// reward_amount
			sb.append("  , '0' ");// paid_status_id
			sb.append("  , null ");
			sb.append("  , '2020-06-02 00:00:00' ");
			sb.append("  , '2020-06-02 00:00:00' ");
			sb.append("); ");

			writer.write(sb.toString());
			writer.newLine();
		}
		writer.write("COMMIT;");
		writer.newLine();
}
	private static void createCsj() throws Throwable {
		createEnterpriseOpenCid();
		createTOcrReadRet();
		createSysCheckRet();
		createIidentityVerification();
		createImageJudgmentRet();
	}

private static void createIidentityVerification() throws Throwable {

	writer.write("START TRANSACTION ;");
	writer.newLine();
	writer.write("delete from `t_identity_verification`;");//  where `jv_id` like '"+JVID_HEAD_STR + "%';");
	writer.newLine();

	for (int i = 1; i <= S_NUM; i++) {
		StringBuffer sb = new StringBuffer();

		String tJvid = JVID_HEAD_STR + String.format("%07d", i);
		String tCid = JVID_HEAD_STR + String.format("%010d", i);

		sb.append("insert");
		sb.append(" into `t_identity_verification` (");
		sb.append("  `jv_id`");
		sb.append(" , `cid`");
		sb.append(" , `name_check_ret`");
		sb.append(" , `address_check_ret`");
		sb.append(" , `birthday_check_ret`");
		sb.append(" , `account_register_ret`");
		sb.append(" , `face_verification`");
		sb.append(" , `face_photo_verification`");
		sb.append(" , `inquiry_req_flg`");
		sb.append(" , `api_number`");
		sb.append(" , `delete_flg`");
		sb.append(" , `create_time`");
		sb.append(" , `create_user_id`");
		sb.append(" , `update_time`");
		sb.append(" , `update_user_id`");
		sb.append(")");
		sb.append("values (");
		sb.append("'" + tJvid + "'");
		sb.append(", '" + tCid + "'");
		sb.append(" , '1'");
		sb.append(" , '1'");
		sb.append(" , '1'");
		sb.append(" , '1'");
		sb.append(" , '1'");
		sb.append(" , '0'");
		sb.append(" , NULL");
		sb.append(" , "+1);
		sb.append(" , '0'");
		sb.append(" , '2020/07/06 18:01:28'");
		sb.append(" , 'Bt002'");
		sb.append(" , '2020/07/06 18:01:57'");
		sb.append(" , 'Bt002'");
		sb.append(");");


		writer.write(sb.toString());
		writer.newLine();
	}
	writer.write("COMMIT;");
	writer.newLine();
}

	private static void createImageJudgmentRet() throws Throwable {

		writer.write("START TRANSACTION ;");
		writer.newLine();
		writer.write("delete from `t_image_judgment_ret`;");//  where `jv_id` like '"+JVID_HEAD_STR+"%';");
		writer.newLine();

		List<String> strLst = CsjUtilsFile.getFileContent("res/stub/photoTestData.txt", "utf-8");
		for (int i = 1; i <= S_NUM; i++) {

			System.out.println(i);

			String tJvid = JVID_HEAD_STR + String.format("%07d", i);
			String tCid = JVID_HEAD_STR + String.format("%010d", i);

            int len = strLst.get(0).length();

            StringBuffer bytePre = new StringBuffer();
            StringBuffer byteAfter = new StringBuffer();

			for (int index = 0; index < len; index++) {
				if (index < picSliptCnt) {
					bytePre.append(strLst.get(0).charAt(index));
				} else {
					byteAfter.append(strLst.get(0).charAt(index));
				}
			}

				StringBuffer sb01 = new StringBuffer();
				sb01.append("insert into `t_image_judgment_ret` ( ");
				sb01.append("`jv_id`, ");
				sb01.append("`cid`, ");
				sb01.append("`face_image_file_name`, ");
				sb01.append("`face_image_data`, ");
				sb01.append("`license_image_file_name`, ");
				sb01.append("`id_document_type`, ");
				sb01.append("`photo_type`, ");
				sb01.append("`is_masked`, ");
				sb01.append("`license_image_data`, ");
				sb01.append("`license_image_data_encrypt`, ");
				sb01.append("`api_number`, ");
				sb01.append("`delete_flg`, ");
				sb01.append("`create_time`, ");
				sb01.append("`create_user_id`, ");
				sb01.append("`update_time`, ");
				sb01.append("`update_user_id`) ");
				sb01.append("values (");
				sb01.append("'" + tJvid + "'");
				sb01.append(", '" + tCid + "'");
				sb01.append(", '" + tJvid + "_face.jpg"+"'");
				sb01.append(", null");
				sb01.append(", '" + tJvid + "_driverslicense_front.jpg"+"'");
				sb01.append(", '" + "01" + "'");
				sb01.append(", '" + "01" + "'");
				sb01.append(", '" + "1" + "'");
				sb01.append(", '" + byteAfter.toString() + "'");
				sb01.append(", " + "AES_ENCRYPT(CONVERT(cast('"+bytePre.toString()+"' as char) USING utf8), "+S_KEY_STG +")" + "");
				sb01.append(" , "+1);
				sb01.append(" , '0'");
				sb01.append(" , '2020/07/06 18:01:28'");
				sb01.append(" , 'Bt002'");
				sb01.append(" , '2020/07/06 18:01:57'");
				sb01.append(" , 'Bt002'");
				sb01.append(");");

				writer.write(sb01.toString());
				writer.newLine();


	            len = strLst.get(1).getBytes().length;

	            bytePre = new StringBuffer();
	            byteAfter = new StringBuffer();

				for (int index = 0; index < len; index++) {
					if (index < picSliptCnt) {
						bytePre.append(strLst.get(1).charAt(index));
					} else {
						byteAfter.append(strLst.get(1).charAt(index));
					}
				}

				StringBuffer sb02 = new StringBuffer();
				sb02.append("insert into `t_image_judgment_ret` ( ");
				sb02.append("`jv_id`, ");
				sb02.append("`cid`, ");
				sb02.append("`face_image_file_name`, ");
				sb02.append("`face_image_data`, ");
				sb02.append("`license_image_file_name`, ");
				sb02.append("`id_document_type`, ");
				sb02.append("`photo_type`, ");
				sb02.append("`is_masked`, ");
				sb02.append("`license_image_data`, ");
				sb02.append("`license_image_data_encrypt`, ");
				sb02.append("`api_number`, ");
				sb02.append("`delete_flg`, ");
				sb02.append("`create_time`, ");
				sb02.append("`create_user_id`, ");
				sb02.append("`update_time`, ");
				sb02.append("`update_user_id`) ");
				sb02.append("values (");
				sb02.append("'" + tJvid + "'");
				sb02.append(", '" + tCid + "'");
				sb02.append(", '" + tJvid + "_face.jpg"+"'");
				sb02.append(", null");
				sb02.append(", '" + tJvid + "_driverslicense_front.jpg"+"'");
				sb02.append(", '" + "01" + "'");
				sb02.append(", '" + "02" + "'");
				sb02.append(", '" + "0" + "'");
				sb02.append(", '" + byteAfter.toString() + "'");
				sb02.append(", " + "AES_ENCRYPT(CONVERT(cast('"+bytePre.toString()+"' as char) USING utf8), "+S_KEY_STG +")" + "");
				sb02.append(" , "+1);
				sb02.append(" , '0'");
				sb02.append(" , '2020/07/06 18:01:28'");
				sb02.append(" , 'Bt002'");
				sb02.append(" , '2020/07/06 18:01:57'");
				sb02.append(" , 'Bt002'");
				sb02.append(");");

				writer.write(sb02.toString());
				writer.newLine();

		}
		writer.write("COMMIT;");
		writer.newLine();

	}

	private static void createSysCheckRet() throws Throwable {

		writer.write("START TRANSACTION ;");
		writer.newLine();
		writer.write("delete from `t_sys_check_ret`;");//  where `jv_id` like '"+JVID_HEAD_STR+"%';");
		writer.newLine();

		for (int i = 1; i <= S_NUM; i++) {
			StringBuffer sb = new StringBuffer();

			String tJvid = JVID_HEAD_STR + String.format("%07d", i);
			String tCid = JVID_HEAD_STR + String.format("%010d", i);

			sb.append("insert");
			sb.append(" into `t_sys_check_ret` (");
			sb.append("  `jv_id`");
			sb.append(" , `cid`");
			sb.append(" , `name_check_ret`");
			sb.append(" , `address_check_ret`");
			sb.append(" , `birthday_check_ret`");
			sb.append(" , `account_register_ret`");
			sb.append(" , `face_verification`");
			sb.append(" , `face_photo_verification`");
			sb.append(" , `inquiry_req_flg`");
			sb.append(" , `api_number`");
			sb.append(" , `delete_flg`");
			sb.append(" , `create_time`");
			sb.append(" , `create_user_id`");
			sb.append(" , `update_time`");
			sb.append(" , `update_user_id`");
			sb.append(")");
			sb.append("values (");
			sb.append("'" + tJvid + "'");
			sb.append(", '" + tCid + "'");
			sb.append(" , '1'");
			sb.append(" , '1'");
			sb.append(" , '1'");
			sb.append(" , '1'");
			sb.append(" , '1'");
			sb.append(" , '0'");
			sb.append(" , NULL");
			sb.append(" , "+1);
			sb.append(" , '0'");
			sb.append(" , '2020/07/06 18:01:28'");
			sb.append(" , 'Bt002'");
			sb.append(" , '2020/07/06 18:01:57'");
			sb.append(" , 'Bt002'");
			sb.append(");");


			writer.write(sb.toString());
			writer.newLine();
		}
		writer.write("COMMIT;");
		writer.newLine();
	}

	private static void createTOcrReadRet() throws Throwable {

		writer.write("START TRANSACTION ;");
		writer.newLine();
		writer.write("delete from `t_ocr_read_ret`;");//  where `jv_id` like '"+JVID_HEAD_STR+"%';");
		writer.newLine();

		for (int i = 1; i <= S_NUM; i++) {
			StringBuffer sb = new StringBuffer();

			String tJvid = JVID_HEAD_STR + String.format("%07d", i);
			String tCid = JVID_HEAD_STR + String.format("%010d", i);
			String name = "name" + String.format("%010d", i);
			String birthday = getFormatDate(getDateDiff("1981/01/01 00:00:00", CsjConsts.YYYY_MM_DD_HH_MM_SS_SLASH_24, i),CsjConsts.YYYY_MM_DD_HH_MM_SS_SLASH_24);
			String address =  "address" + String.format("%010d", i);
			String id_number = String.format("%07d", i);
			String expire_date = getFormatDate(getDateDiff("1991/01/01 00:00:00", CsjConsts.YYYY_MM_DD_HH_MM_SS_SLASH_24, i),CsjConsts.YYYY_MM_DD_HH_MM_SS_SLASH_24);

			sb.append("insert");
			sb.append(" into `t_ocr_read_ret` (");
			sb.append("`jv_id` ");
			sb.append(", `cid` ");
			sb.append(", `finished_identity_verification` ");
			sb.append(", `id_document_type` ");
			sb.append(", `name` ");
			sb.append(", `birthday` ");
			sb.append(", `address` ");
			sb.append(", `id_number` ");
			sb.append(", `expire_date` ");
			sb.append(" , `api_number`");
			sb.append(", `delete_flg` ");
			sb.append(", `create_time` ");
			sb.append(", `create_user_id` ");
			sb.append(", `update_time` ");
			sb.append(", `update_user_id` ");
			sb.append(")");
			sb.append("values (");
			sb.append("'" + tJvid + "'");
			sb.append(", '" + tCid + "'");
			sb.append(", NULL ");
			sb.append(", '01' ");
			sb.append(", " + "AES_ENCRYPT(CONVERT(cast('"+name+"' as char) USING utf8), "+S_KEY_STG +")" + "");
			sb.append(", " + "AES_ENCRYPT(CONVERT(cast('"+birthday+"' as char) USING utf8), "+S_KEY_STG +")" + "");
			sb.append(", " + "AES_ENCRYPT(CONVERT(cast('"+address+"' as char) USING utf8), "+S_KEY_STG +")" + "");
			sb.append(", " + "AES_ENCRYPT(CONVERT(cast('"+id_number+"' as char) USING utf8), "+S_KEY_STG +")" + "");
			sb.append(", " + "AES_ENCRYPT(CONVERT(cast('"+expire_date+"' as char) USING utf8), "+S_KEY_STG +")" + "");
			sb.append(" , "+1);
			sb.append(", '0' ");
			sb.append(", '2020/07/06 17:59:37' ");
			sb.append(", 'Bt002' ");
			sb.append(", '2020/07/06 18:00:09' ");
			sb.append(", 'Bt002' ");
			sb.append("); ");

			writer.write(sb.toString());
			writer.newLine();
		}
		writer.write("COMMIT;");
		writer.newLine();
	}
	private static void createEnterpriseOpenCid() throws Throwable {

		writer.write("START TRANSACTION ;");
		writer.newLine();
		writer.write("delete from `t_enterprise_open_use_cid`;");//  where `jv_id` like '"+JVID_HEAD_STR+"%';");
		writer.newLine();

		for (int i = 1; i <= S_NUM; i++) {
			StringBuffer sb = new StringBuffer();

			String tJvid =JVID_HEAD_STR + String.format("%07d", i);
			String tCid = JVID_HEAD_STR + String.format("%010d", i);
			String offerId = "10100011";

			sb.append("insert ");
			sb.append("into `t_enterprise_open_use_cid` ( ");
			sb.append("`jv_id`");
			sb.append(", `cid`");
			sb.append(", `offer_id`");
			sb.append(", `hash_cid`");
			sb.append(", `delete_flg`");
			sb.append(", `create_time`");
			sb.append(", `create_user_id`");
			sb.append(", `update_time`");
			sb.append(", `update_user_id`");
			sb.append(") ");
			sb.append("values ( ");
			sb.append("'" + tJvid + "'");
			sb.append(", '" + tCid + "'");
			sb.append(", '" + offerId + "'");
			sb.append(", '" + CsjUtils.getHashCodeSha256(tCid + offerId) + "'");
			sb.append(", '0'");
			sb.append(", '2020/06/08 19:15:04'");
			sb.append(", 'Bt00101'");
			sb.append(", '2020/06/08 19:15:04'");
			sb.append(", 'Bt00101'");
			sb.append(");");
			writer.write(sb.toString());
			writer.newLine();
		}
		writer.write("COMMIT;");
		writer.newLine();
	}

    /**
     * 日付文字列から指定フォマードで日付文字列に転換する.
     *
     * @param dateStr 日付文字列
     * @param format フォマード形式
     * @return
     */
    public static Date getDate(String dateStr, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.parse(dateStr);
    }
	public static Date getDateDiff(String date, String patten, int diff) throws Exception {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getDate(date, patten));
        calendar.add(Calendar.DATE,diff);
		return calendar.getTime();
	}
    public static String getFormatDate(Date date, String format) {

        String ret = "";
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            ret = sdf.format(date);
        return ret;
    }

}
