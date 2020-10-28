/*****************************************************************************
 * プログラム ：CusUnionDataStatusQuery.java
 * CusUnionDataStatus検索用 Bean.
 *****************************************************************************
 * 変更履歴： 2020.02.12 : 新規作成
 ******************************************************************************/

package jp.co.csj.backsys.po.query;

import java.util.List;

/**
 * CusUnionDataStatus検索用
 *
 * @author cui.shuangjia
 */
public class CusUnionDataStatusQuery{

	/** 同意済の場合*/
	private Integer statusAgree;
	/** 提供済、受領済*/
	private List<Integer> statusProvidedLst;
	/** 「提供停止依頼中」または「利用停止依頼中」（コード値：10/20/30/40）*/
	private List<Integer> statusStopLst;
	private List<Integer> finishedIdentityVerificationLst;
	/** 定期更新日 */
	private String regularUpdateDate;
	private String businessDateYmd;
	private String businessDateDd;
	private boolean isForUpdate;
	public Integer getStatusAgree() {
		return statusAgree;
	}
	public void setStatusAgree(Integer statusAgree) {
		this.statusAgree = statusAgree;
	}
	public List<Integer> getStatusProvidedLst() {
		return statusProvidedLst;
	}
	public void setStatusProvidedLst(List<Integer> statusProvidedLst) {
		this.statusProvidedLst = statusProvidedLst;
	}
	public List<Integer> getStatusStopLst() {
		return statusStopLst;
	}
	public void setStatusStopLst(List<Integer> statusStopLst) {
		this.statusStopLst = statusStopLst;
	}
	public List<Integer> getFinishedIdentityVerificationLst() {
		return finishedIdentityVerificationLst;
	}
	public void setFinishedIdentityVerificationLst(List<Integer> finishedIdentityVerificationLst) {
		this.finishedIdentityVerificationLst = finishedIdentityVerificationLst;
	}
	public String getRegularUpdateDate() {
		return regularUpdateDate;
	}
	public void setRegularUpdateDate(String regularUpdateDate) {
		this.regularUpdateDate = regularUpdateDate;
	}
	public String getBusinessDateYmd() {
		return businessDateYmd;
	}
	public void setBusinessDateYmd(String businessDateYmd) {
		this.businessDateYmd = businessDateYmd;
	}
	public String getBusinessDateDd() {
		return businessDateDd;
	}
	public void setBusinessDateDd(String businessDateDd) {
		this.businessDateDd = businessDateDd;
	}
	public boolean isForUpdate() {
		return isForUpdate;
	}
	public void setForUpdate(boolean isForUpdate) {
		this.isForUpdate = isForUpdate;
	}
	@Override
	public String toString() {
		return "CusUnionDataStatusQuery [statusAgree=" + statusAgree + ", statusProvidedLst=" + statusProvidedLst
				+ ", statusStopLst=" + statusStopLst + ", finishedIdentityVerificationLst="
				+ finishedIdentityVerificationLst + ", regularUpdateDate=" + regularUpdateDate + ", businessDateYmd="
				+ businessDateYmd + ", businessDateDd=" + businessDateDd + ", isForUpdate=" + isForUpdate + "]";
	}
}