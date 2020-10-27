/*****************************************************************************
 * プログラム ：Ck001.java
 * 説明 ：チェッククラス.
 *****************************************************************************
 * 変更履歴： 2020.02.12 : 新規作成
 ******************************************************************************/

package jp.co.csj.backsys.batch.check;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.co.csj.backsys.batch.abs.AbsApiBatch;
import jp.co.csj.backsys.batch.check.common.CkCommon;
import jp.co.csj.backsys.common.DpsUtils;
import jp.co.csj.backsys.common.message.DpsMessageKey;
import jp.co.csj.backsys.common.property.DpsProperties;

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
        ckCommon.setDpsDbSys(map);

        // J_SCORE_API_DATABASE
        ckCommon.setFrontDbSys(map);

        // SSL_CA
        ckCommon.setSslCa(map);

        // MAIL
        ckCommon.setMailSys(map);

        // Common
        ckCommon.setCommonSys(map);

        if (!DpsUtils.checkSys(map, DpsMessageKey.E1002, batch.getBatchId())) {
            throw new Throwable(DpsProperties.getMsgLog(DpsMessageKey.E0001, batch.getBatchId()));
        }
    }

    /**
     * プロパティ存在チェック処理を行う.
     * @throws Throwable
     */
    public void checkProperties() throws Throwable {

        // vmFile check
        ckCommon.checkMailVmFileProperties(DpsProperties.Bt005_MAIL_VM_FILE);

    }
}
