/*****************************************************************************
 * プログラム ：OfferSumData.java
 * 説明 ：請求用同意件数配信ファイル作成Bean.
 *****************************************************************************
 * 変更履歴： 2020.04.08 : 新規作成
 ******************************************************************************/

package jp.co.csj.backsys.bean.file;

import jp.co.csj.backsys.common.DpsConsts;
import jp.co.csj.backsys.common.DpsUtils;

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
		sb.append(DpsUtils.addQuotation("JVID", DpsConsts.STR_EMPTY));
		sb.append(DpsConsts.STR_CONMA);
		sb.append(DpsUtils.addQuotation("CID", DpsConsts.STR_EMPTY));
		sb.append(DpsConsts.STR_CONMA);
		sb.append(DpsUtils.addQuotation("オファーID", DpsConsts.STR_EMPTY));
		sb.append(DpsConsts.STR_CONMA);
		sb.append(DpsUtils.addQuotation("提供日", DpsConsts.STR_EMPTY));
		return sb.toString();
	}

	public String toCsvDataString() {

		StringBuffer sb = new StringBuffer();
		sb.append(DpsUtils.addQuotation(jvId, DpsConsts.STR_EMPTY));
		sb.append(DpsConsts.STR_CONMA);
		sb.append(DpsUtils.addQuotation(cid, DpsConsts.STR_EMPTY));
		sb.append(DpsConsts.STR_CONMA);
		sb.append(DpsUtils.addQuotation(offerId, DpsConsts.STR_EMPTY));
		sb.append(DpsConsts.STR_CONMA);
		sb.append(DpsUtils.addQuotation(createAt, DpsConsts.STR_EMPTY));
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
