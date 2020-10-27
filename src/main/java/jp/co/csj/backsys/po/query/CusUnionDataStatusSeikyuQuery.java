/*****************************************************************************
 * プログラム ：CusUnionDataStatusSeikyuQuery.java
 * CusUnionDataStatusSeikyuQuery検索用 Bean.
 *****************************************************************************
 * 変更履歴： 2020.02.12 : 新規作成
 ******************************************************************************/

package jp.co.csj.backsys.po.query;

import java.util.List;

/**
 * CusUnionDataStatusSeikyuQuery検索用
 *
 * @author systena
 */
public class CusUnionDataStatusSeikyuQuery{

	private Integer status;
	private List<Integer> finishedIdentityVerificationLst;
	private String businessDatePreMonthFirstDayYmd;
	private String businessDatePreMonthLastDayYmd;

	public String getBusinessDatePreMonthFirstDayYmd() {
		return businessDatePreMonthFirstDayYmd;
	}
	public void setBusinessDatePreMonthFirstDayYmd(String businessDatePreMonthFirstDayYmd) {
		this.businessDatePreMonthFirstDayYmd = businessDatePreMonthFirstDayYmd;
	}
	public String getBusinessDatePreMonthLastDayYmd() {
		return businessDatePreMonthLastDayYmd;
	}
	public void setBusinessDatePreMonthLastDayYmd(String businessDatePreMonthLastDayYmd) {
		this.businessDatePreMonthLastDayYmd = businessDatePreMonthLastDayYmd;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public List<Integer> getFinishedIdentityVerificationLst() {
		return finishedIdentityVerificationLst;
	}
	public void setFinishedIdentityVerificationLst(List<Integer> finishedIdentityVerificationLst) {
		this.finishedIdentityVerificationLst = finishedIdentityVerificationLst;
	}
	@Override
	public String toString() {
		return "CusUnionDataStatusSeikyuQuery [status=" + status + ", finishedIdentityVerificationLst="
				+ finishedIdentityVerificationLst + ", businessDatePreMonthFirstDayYmd="
				+ businessDatePreMonthFirstDayYmd + ", businessDatePreMonthLastDayYmd=" + businessDatePreMonthLastDayYmd
				+ "]";
	}
}
