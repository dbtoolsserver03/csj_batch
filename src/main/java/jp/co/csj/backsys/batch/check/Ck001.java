/*****************************************************************************
 * プログラム ：Ck001.java
 * 説明 ：チェッククラス.
 *****************************************************************************
 * 変更履歴： 2020.xx.xx : 新規作成
 ******************************************************************************/

package jp.co.csj.backsys.batch.check;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.co.csj.backsys.batch.abs.AbsApiBatch;
import jp.co.csj.backsys.batch.check.common.CkCommon;
import jp.co.csj.backsys.common.CsjUtils;
import jp.co.csj.backsys.common.message.CsjMessageKey;
import jp.co.csj.backsys.common.property.CsjProperties;

public class Ck001 {

    private AbsApiBatch batch;

    /** チェック共通 */
    private CkCommon ckCommon;

    public Ck001(AbsApiBatch batch) {
        this.batch = batch;
        ckCommon = new CkCommon(batch);
    }

    /**
     * 環境変数をチェックする.
     * @throws Throwable
     */
    public void checkSys() throws Throwable {
        Map<String, String> map = new LinkedHashMap<String, String>();

        // JsFrontApp
        ckCommon.setJsFrontApISys(map);

        // BACKOFFICE_DATABASE
        ckCommon.setMydbDbSys(map);

        // J_SCORE_API_DATABASE
        ckCommon.setFrtDbSys(map);

        // SSL_CA
        ckCommon.setSslCa(map);

        // MAIL
        ckCommon.setMailSys(map);

        // Common
        ckCommon.setCommonSys(map);

        if (!CsjUtils.checkSys(map, CsjMessageKey.E1002, batch.getBatchId())) {
            throw new Throwable(CsjProperties.getMsgLog(CsjMessageKey.E0001, batch.getBatchId()));
        }
    }

    /**
     * プロパティ存在チェック処理を行う.
     * @throws Throwable
     */
    public void checkProperties() throws Throwable {

//        ckCommon.checkMailVmFileProperties(CsjProperties.Bt005_MAIL_VM_FILE);

    }
}
