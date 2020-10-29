/*****************************************************************************
 * プログラム ：Bt001.java
 * 説明 ：XXXXバッチ.
 *****************************************************************************
 * 変更履歴： 2020.xx.xx : 新規作成
 ******************************************************************************/

package jp.co.csj.backsys.batch;

import jp.co.csj.backsys.batch.abs.AbsApiBatch;
import jp.co.csj.backsys.batch.check.Ck001;
import jp.co.csj.backsys.batch.service.sv005.Sv00101;
import jp.co.csj.backsys.common.message.CsjMessageKey;
import jp.co.csj.backsys.common.property.CsjProperties;

public class Bt001 extends AbsApiBatch {

    // チェッククラス
    private Ck001 ck001;
    private Sv00101 sv00101;


    /**
     * バッチ入口.
     * @param args 引数
     */
    public static void main(String[] args) {
        // 処理を行う。
        new Bt001().produce();
    }

    /**
     * 主処理.
     */
    @Override
    public void run() throws Throwable {

        // 1 本人確認中の顧客情報取得
        log.info(CsjProperties.getMsgLog(CsjMessageKey.I0201, 55,getBatchId()));

        sv00101.transfer("aa");
    }

    /**
     * プロパティファイルを読み込み.
     */
    @Override
    public void setup() throws Throwable {

        // バッチIDの設定
        setBatchId(Bt001.class.getSimpleName());

        ck001 = new Ck001(this);

        super.setup();

    }

    /**
     * 環境変数をチェックする.
     */
    @Override
    public void checkSys() throws Throwable {
    	ck001.checkSys();
    }

    /**
     * プロパティ存在チェック処理を行う.
     */
    @Override
    public void checkProperties() throws Throwable {
    	ck001.checkProperties();
    }

    @Override
    public void init() throws Throwable {

        // システム結果確認情報(MYDB)
        sv00101 = new Sv00101(this);
    }

}
