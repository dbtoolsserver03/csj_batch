/*****************************************************************************
 * プログラム ：CsjMessageKey.java 説明 ：メッセージキークラス.
 *****************************************************************************
 * 変更履歴： 2020.02.12 : 新規作成
 ******************************************************************************/

package jp.co.csj.backsys.common.message;

public class CsjMessageKey {

	public static final String BATCH_VERSION = "BATCH_VERSION";

	/** メッセージキー：E1001_J(ファイル読込失敗しました。（ファイル名：{0}）（バッチID：{1}）) */
	public static final String E1001_J = "ファイル読込失敗しました。（ファイル名：{0}）（バッチID：{1}）";
	// 業務異常(共通)
	/** メッセージキー：E0001(バッチ異常発生しました。（バッチID：{0}）) */
	public static final String E0001 = "E0001";

	/** メッセージキー：E0002(TODO) */
	public static final String E0002 = "E0002";

	/** メッセージキー：E0003({0}取得失敗しました。（バッチID：{1}）) */
	public static final String E0003 = "E0003";

	/** メッセージキー：E0004({0}は失敗しました。time:{1}.jvid:{2}.cid:{3}.（バッチID：{4}）) */
	public static final String E0004 = "E0004";

	/** メッセージキー：E0005(TODO) */
	public static final String E0005 = "E0005";

	/** メッセージキー：E0006(TODO) */
	public static final String E0006 = "E0006";

	/** メッセージキー：E0007({0}は失敗しました。time:{1}.（バッチID：{2}）) */
	public static final String E0007 = "E0007";

	/** メッセージキー：E0008(フォルダー存在していません。（{0}）（{1}）（バッチID：{2}）) */
	public static final String E0008 = "E0008";

	/** メッセージキー：E0009(TODO) */
	public static final String E0009 = "E0009";

	/** メッセージキー：E0010(TODO) */
	public static final String E0010 = "E0010";

	// 業務異常(本人確認・反社照会)
	/** メッセージキー：E0201(TODO) */
	public static final String E0201 = "E0201";

	/** メッセージキー：E0202(TODO) */
	public static final String E0202 = "E0202";

	/** メッセージキー：E0203(API呼出処理が失敗しましたので、各項目の比較処理に続けません。jvid:{0}.cid:{1}.（バッチID：{2}）) */
	public static final String E0203 = "E0203";

	/** メッセージキー：E0204(TODO) */
	public static final String E0204 = "E0204";

	/** メッセージキー：E0205(TODO) */
	public static final String E0205 = "E0205";

	// 環境異常
	/** メッセージキー：E1001(ファイル読込失敗しました。（ファイル名：{0}）（バッチID：{1}）) */
	public static final String E1001 = "E1001";

	/** メッセージキー：E1002(サーバの環境変数は設定されていないです。（{0}）（{1}）（バッチID：{2}）) */
	public static final String E1002 = "E1002";
	/** メッセージキー：E1003(プロパティファイルには設定されていないです。（{0}）（{1}）（バッチID：{2}）) */
	public static final String E1003 = "E1003";

	/** メッセージキー：E1004(TODO) */
	public static final String E1004 = "E1004";

	/** メッセージキー：E1005(データベースのヘルスチェックは通れません。（データベース名前：{0}）（バッチID：{1}）) */
	public static final String E1005 = "E1005";

	/** メッセージキー：E1006(IdToken取得できません。（JS－PDS間のデータ連携用)（バッチID：{0}）） */
	public static final String E1006 = "E1006";

	/** メッセージキー：E1007(TODO) */
	public static final String E1007 = "E1007";

	/** メッセージキー：E1008(TODO) */
	public static final String E1008 = "E1008";

	/** メッセージキー：E1009(TODO) */
	public static final String E1009 = "E1009";

	/** メッセージキー：E1010(TODO) */
	public static final String E1010 = "E1010";

	/** メッセージキー：E1011(メール配信失敗しました。{0}.（バッチID：{1}）) */
	public static final String E1011 = "E1011";

	/** メッセージキー：E1012(該当レコード見つかりませんでした。jvid:{0}.cid:{1}.テーブル{2}.（バッチID：{3}）) */
	public static final String E1012 = "E1012";

	/** メッセージキー：E1013(TODO) */
	public static final String E1013 = "E1013";

	/** メッセージキー：E1014(TODO) */
	public static final String E1014 = "E1014";

	/** メッセージキー：E1015(TODO) */
	public static final String E1015 = "E1015";

	// 情報ログ(共通)
	/** メッセージキー：I0001(バッチ実行{0}。（バッチID：{1}）) */
	public static final String I0001 = "I0001";

	/** メッセージキー：I0002(環境変数チェック{0}。（バッチID：{1}）) */
	public static final String I0002 = "I0002";

	/** メッセージキー：I0003(プロパティ存在チェック{0}。（バッチID：{1}）) */
	public static final String I0003 = "I0003";

	/** メッセージキー：I0004(データベースのヘルスチェック{0}。（バッチID：{1}）) */
	public static final String I0004 = "I0004";

	/** メッセージキー：I0005(メール配信しました。{0}.（バッチID：{1}）) */
	public static final String I0005 = "I0005";

	/** メッセージキー：I0006(データベースのヘルスチェックは正常です。（データベース名前：{0}）（バッチID：{1}）) */
	public static final String I0006 = "I0006";

	/** メッセージキー：I0007({0}{1}完了しました。処理件数:{2}.{3}.（バッチID：{4}）) */
	public static final String I0007 = "I0007";

	/** メッセージキー：I0008(ファイル作成{0}。[{1}]（バッチID：{2}）) */
	public static final String I0008 = "I0008";

	/** メッセージキー：I0009({0}にファイルアップロード{1}。from:[{2}]to:[{3}]（バッチID：{4}）) */
	public static final String I0009 = "I0009";

	/** メッセージキー：I0010({0}からファイルダウンロード{1}。from:[{2}]to:[{3}]（バッチID：{4}）) */
	public static final String I0010 = "I0010";

	// 情報ログ(API)
	/** メッセージキー：I0011(API呼出時間間隔：{0}秒。（バッチID：{1}）) */
	public static final String I0011 = "I0011";

	/** メッセージキー：I0012(API再呼出最大回数：{0}回。（バッチID：{1}）) */
	public static final String I0012 = "I0012";

	/** メッセージキー：I0013(API接続タイムアウト：{0}秒。（バッチID：{1}）) */
	public static final String I0013 = "I0013";

	/** メッセージキー：I0014(APIのURL：{0}。（method：{1}）（type：{2}）（API名称：{3}）（バッチID：{4}）) */
	public static final String I0014 = "I0014";

	/** メッセージキー：I0015(APIのProxyIp：{0}。（type：{1}）（バッチID：{2}）) */
	public static final String I0015 = "I0015";

	/** メッセージキー：I0016(APIのProxyPort：{0}。（type：{1}）（バッチID：{2}）) */
	public static final String I0016 = "I0016";

	/** メッセージキー：I0017(APIのRequestBody：{0}。（type：{1}）（バッチID：{2}）) */
	public static final String I0017 = "I0017";

	/** メッセージキー：I0018(APIの戻り値：{0}。（type：{1}）（バッチID：{2}）) */
	public static final String I0018 = "I0018";

	/** メッセージキー：I0019(マスタの{0}を取得する。（値{1}）（コード区分{2}）（コード{3}）（値番{4}）。（バッチID：{5}）) */
	public static final String I0019 = "I0019";

	/** メッセージキー：I0020(TODO) */
	public static final String I0020 = "I0020";

	/** メッセージキー：I0021({0}バックアップしました。from:[{1}]to:[{2}]（バッチID：{3}）) */
	public static final String I0021 = "I0021";

	/** メッセージキー：I0022({0}ファイル削除した。{1}（バッチID：{2}）) */
	public static final String I0022 = "I0022";

	/** メッセージキー：I0022(信用情報照会依頼は2ではありません。jvid:{0}.cid:{1}.（バッチID：{2}）) */
	public static final String I0023 = "I0023";
	/** メッセージキー：I0022(反社照会結果ステータスは1:反社非該当（OK） ではありません。jvid:{0}.cid:{1}.（バッチID：{2}）) */
	public static final String I0024 = "I0024";

	// 情報ログ(業務)
	/** メッセージキー：I0201(顧客情報件数：{0}。（バッチID：{1}）) */
	public static final String I0201 = "I0201";

	/** メッセージキー：I0202({0}/{1}件目の取込み処理を開始します。jvid:{2}.cid:{3}.（バッチID：{4}）) */
	public static final String I0202 = "I0202";

	/** メッセージキー：I0203({0}:{1}[{2}]。{3}[{4}]。判定結果[{5}]jvid:{6}.cid:{7}.（バッチID：{8}）) */
	public static final String I0203 = "I0203";

	/** メッセージキー：I0204({0}{1}。値[{2}]。jvid:{3}.cid:{4}.（バッチID：{5}）) */
	public static final String I0204 = "I0204";

	/** メッセージキー：I0205(画像データ取得異常、正面画像はマスキング済みではありません。jvid:{0}.cid:{1}.（バッチID：{2}）) */
	public static final String I0205 = "I0205";

	/** メッセージキー：I0206({0}の場合、{1}は不可です。jvid:{2}.cid:{3}.（バッチID：{4}）) */
	public static final String I0206 = "I0206";

	/** メッセージキー：I0207(再提出依頼のため、各テーブルのデータをロジック削除してから、各APIの再呼出処理が必要です。jvid:{0}.cid:{1}.（バッチID：{2}）) */
	public static final String I0207 = "I0207";

	/** メッセージキー：I0208(TODO) */
	public static final String I0208 = "I0208";

	/** メッセージキー：I0209(TODO) */
	public static final String I0209 = "I0209";

	/** メッセージキー：I0210(TODO) */
	public static final String I0210 = "I0210";

	/** メッセージキー：I0501(メール正しく配信しました、再配信処理は必要ありません。jvid:{0}.cid:{1}.（バッチID：{2}）) */
	public static final String I0501 = "I0501";

	// 警告ログ(共通)
	/** メッセージキー：W0001(該当レコードが存在しています。{0}処理は不要です。jvid:{1}.cid:{2}.（バッチID：{3}）) */
	public static final String W0001 = "W0001";

	/** メッセージキー：W0002(TODO) */
	public static final String W0002 = "W0002";

	/** メッセージキー：W0003(TODO) */
	public static final String W0003 = "W0003";

	/** メッセージキー：W0004(TODO) */
	public static final String W0004 = "W0004";

	/** メッセージキー：W0005(TODO) */
	public static final String W0005 = "W0005";



	// ログ(定期登録・更新)
	/** メッセージキー：I0101(公開用CID(MYDB)テーブルに、該当データがありません。jvid:{0}.cid:{1}.offer_id:{2}.（バッチID：{3}）) */
	public static final String I0101 = "I0101";

	// 警告ログ(本人照会)
	/** メッセージキー：W0202(既に実行済みのため、比較処理は不要です。jvid:{0}.cid:{1}.（バッチID：{2}）) */
	public static final String W0202 = "W0202";
	// 警告ログ(本人確認完了配信 )
	/** メッセージキー：W0501(TODO) */
	public static final String W0501 = "W0501";

	/** メッセージキー：W0502(TODO) */
	public static final String W0502 = "W0502";

	/** メッセージキー：W0503(TODO) */
	public static final String W0503 = "W0503";

	/** メッセージキー：W0504(TODO) */
	public static final String W0504 = "W0504";

}
