/*****************************************************************************
 * プログラム ：OfferEnterpriseAgree.java
 * 説明 ：オファー企業毎同意ファイル作成Bean.
 *****************************************************************************
 * 変更履歴： 2020.04.08 : 新規作成
 ******************************************************************************/

package jp.co.csj.backsys.bean.file;

import jp.co.csj.backsys.common.CsjConsts;
import jp.co.csj.backsys.common.CsjUtils;

public class OfferEnterpriseAgree {

	/** オファーID */
	private String offerId;

	/** Pナンバー（CID） */
	private String cid;

	/** 企業公開用Pナンバー（CID） */
	private String hashCid;

	/** 公開フラグ */
	private String openFLg;

	public OfferEnterpriseAgree() {}

	public OfferEnterpriseAgree(String offerId, String cid, String hashCid, String openFLg) {
		this.offerId = offerId;
		this.cid = cid;
		this.hashCid = hashCid;
		this.openFLg = openFLg;
	}

	public String getOfferId() {
		return offerId;
	}

	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getHashCid() {
		return hashCid;
	}

	public void setHashCid(String hashCid) {
		this.hashCid = hashCid;
	}

	public String getOpenFLg() {
		return openFLg;
	}

	public void setOpenFLg(String openFLg) {
		this.openFLg = openFLg;
	}

	@Override
	public String toString() {
		return "OfferEnterpriseAgree [offerId=" + offerId + ", cid=" + cid + ", hashCid=" + hashCid + ", openFLg="
				+ openFLg + "]";
	}

	public String toCsvHeaderString() {

		StringBuffer sb = new StringBuffer();
		sb.append(CsjUtils.addQuotation("offer_id", CsjConsts.STR_DOUBLE_QUOTATION));
		sb.append(CsjConsts.STR_CONMA);
		sb.append(CsjUtils.addQuotation("cid", CsjConsts.STR_DOUBLE_QUOTATION));
		sb.append(CsjConsts.STR_CONMA);
		sb.append(CsjUtils.addQuotation("cid_by_offer", CsjConsts.STR_DOUBLE_QUOTATION));
		sb.append(CsjConsts.STR_CONMA);
		sb.append(CsjUtils.addQuotation("open_flg", CsjConsts.STR_DOUBLE_QUOTATION));
		return sb.toString();
	}

	public String toCsvDataString() {

		StringBuffer sb = new StringBuffer();
		sb.append(CsjUtils.addQuotation(offerId, CsjConsts.STR_DOUBLE_QUOTATION));
		sb.append(CsjConsts.STR_CONMA);
		sb.append(CsjUtils.addQuotation(cid, CsjConsts.STR_DOUBLE_QUOTATION));
		sb.append(CsjConsts.STR_CONMA);
		sb.append(CsjUtils.addQuotation(hashCid, CsjConsts.STR_DOUBLE_QUOTATION));
		sb.append(CsjConsts.STR_CONMA);
		sb.append(CsjUtils.addQuotation(openFLg, CsjConsts.STR_DOUBLE_QUOTATION));
		return sb.toString();
	}
}
