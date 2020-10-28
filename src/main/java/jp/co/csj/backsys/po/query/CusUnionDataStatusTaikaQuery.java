/*****************************************************************************
 * プログラム ：CusUnionDataStatus.java
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
public class CusUnionDataStatusTaikaQuery{


	private List<Integer> finishedIdentityVerificationLst;
	private String jvId;
	private String businessDatePreMonthLastDayYmd;

	private Integer status;
	private List<Integer> statusLstTmp1;
	private Integer statusTmp2;

	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getBusinessDatePreMonthLastDayYmd() {
		return businessDatePreMonthLastDayYmd;
	}
	public void setBusinessDatePreMonthLastDayYmd(String businessDatePreMonthLastDayYmd) {
		this.businessDatePreMonthLastDayYmd = businessDatePreMonthLastDayYmd;
	}
	public String getJvId() {
		return jvId;
	}
	public void setJvId(String jvId) {
		this.jvId = jvId;
	}
	public List<Integer> getFinishedIdentityVerificationLst() {
		return finishedIdentityVerificationLst;
	}
	public void setFinishedIdentityVerificationLst(List<Integer> finishedIdentityVerificationLst) {
		this.finishedIdentityVerificationLst = finishedIdentityVerificationLst;
	}
	public Integer getStatusTmp2() {
		return statusTmp2;
	}
	public void setStatusTmp2(Integer statusTmp2) {
		this.statusTmp2 = statusTmp2;
	}
	public List<Integer> getStatusLstTmp1() {
		return statusLstTmp1;
	}
	public void setStatusLstTmp1(List<Integer> statusLstTmp1) {
		this.statusLstTmp1 = statusLstTmp1;
	}
	@Override
	public String toString() {
		return "CusUnionDataStatusTaikaQuery [finishedIdentityVerificationLst=" + finishedIdentityVerificationLst
				+ ", jvId=" + jvId + ", businessDatePreMonthLastDayYmd=" + businessDatePreMonthLastDayYmd + ", status="
				+ status + ", statusLstTmp1=" + statusLstTmp1 + ", statusTmp2=" + statusTmp2 + "]";
	}
}
