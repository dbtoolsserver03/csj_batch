/*****************************************************************************
 * プログラム ：OfferSumData.java
 * 説明 ：請求用同意件数配信ファイル作成Bean.
 *****************************************************************************
 * 変更履歴： 2020.04.08 : 新規作成
 ******************************************************************************/

package jp.co.csj.backsys.bean.file;

import jp.co.csj.backsys.common.CsjConsts;
import jp.co.csj.backsys.common.CsjUtils;

public class OfferSumData {

	/** JVID */
	private String jvId;

	/** CID */
	private String cid;

	/** オファーID */
	private String offerId;

	/** 提供日(YYYYMMDD形式) */
	private String createAt;

	public String toCsvHeaderString() {

		StringBuffer sb = new StringBuffer();
		sb.append(CsjUtils.addQuotation("JVID", CsjConsts.STR_EMPTY));
		sb.append(CsjConsts.STR_CONMA);
		sb.append(CsjUtils.addQuotation("CID", CsjConsts.STR_EMPTY));
		sb.append(CsjConsts.STR_CONMA);
		sb.append(CsjUtils.addQuotation("オファーID", CsjConsts.STR_EMPTY));
		sb.append(CsjConsts.STR_CONMA);
		sb.append(CsjUtils.addQuotation("提供日", CsjConsts.STR_EMPTY));
		return sb.toString();
	}

	public String toCsvDataString() {

		StringBuffer sb = new StringBuffer();
		sb.append(CsjUtils.addQuotation(jvId, CsjConsts.STR_EMPTY));
		sb.append(CsjConsts.STR_CONMA);
		sb.append(CsjUtils.addQuotation(cid, CsjConsts.STR_EMPTY));
		sb.append(CsjConsts.STR_CONMA);
		sb.append(CsjUtils.addQuotation(offerId, CsjConsts.STR_EMPTY));
		sb.append(CsjConsts.STR_CONMA);
		sb.append(CsjUtils.addQuotation(createAt, CsjConsts.STR_EMPTY));
		return sb.toString();
	}


	public OfferSumData() {}

	@Override
	public String toString() {
		return "OfferSumData [jvId=" + jvId + ", cid=" + cid + ", offerId=" + offerId + ", createAt=" + createAt + "]";
	}

	public String getJvId() {
		return jvId;
	}


	public void setJvId(String jvId) {
		this.jvId = jvId;
	}


	public String getCid() {
		return cid;
	}


	public void setCid(String cid) {
		this.cid = cid;
	}


	public String getOfferId() {
		return offerId;
	}


	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}


	public String getCreateAt() {
		return createAt;
	}


	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}

}
