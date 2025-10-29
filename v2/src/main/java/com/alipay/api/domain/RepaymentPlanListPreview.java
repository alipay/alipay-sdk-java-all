package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 还款计划列表预览
 *
 * @author auto create
 * @since 1.0, 2025-09-18 15:56:06
 */
public class RepaymentPlanListPreview extends AlipayObject {

	private static final long serialVersionUID = 4174589597642133387L;

	/**
	 * 还款计划项详情列表
	 */
	@ApiListField("repay_plan_detail_list")
	@ApiField("repaymemt_plan_preview")
	private List<RepaymemtPlanPreview> repayPlanDetailList;

	/**
	 * 总还款金额，单位：元
	 */
	@ApiField("total_amt")
	private String totalAmt;

	/**
	 * 总优惠利息金额，单位：元
	 */
	@ApiField("total_deduct_int_amt")
	private String totalDeductIntAmt;

	/**
	 * 总原始利息金额，单位：元
	 */
	@ApiField("total_initial_int_amt")
	private String totalInitialIntAmt;

	/**
	 * 总利息金额，单位：元；
字段间关系为 总利息金额 = 总原始利息金额 - 总优惠利息金额
	 */
	@ApiField("total_int_amt")
	private String totalIntAmt;

	/**
	 * 总还款本金，单位：元
	 */
	@ApiField("total_prin_amt")
	private String totalPrinAmt;

	/**
	 * 总担保费/服务费，单位：元
	 */
	@ApiField("total_serv_amt")
	private String totalServAmt;

	public List<RepaymemtPlanPreview> getRepayPlanDetailList() {
		return this.repayPlanDetailList;
	}
	public void setRepayPlanDetailList(List<RepaymemtPlanPreview> repayPlanDetailList) {
		this.repayPlanDetailList = repayPlanDetailList;
	}

	public String getTotalAmt() {
		return this.totalAmt;
	}
	public void setTotalAmt(String totalAmt) {
		this.totalAmt = totalAmt;
	}

	public String getTotalDeductIntAmt() {
		return this.totalDeductIntAmt;
	}
	public void setTotalDeductIntAmt(String totalDeductIntAmt) {
		this.totalDeductIntAmt = totalDeductIntAmt;
	}

	public String getTotalInitialIntAmt() {
		return this.totalInitialIntAmt;
	}
	public void setTotalInitialIntAmt(String totalInitialIntAmt) {
		this.totalInitialIntAmt = totalInitialIntAmt;
	}

	public String getTotalIntAmt() {
		return this.totalIntAmt;
	}
	public void setTotalIntAmt(String totalIntAmt) {
		this.totalIntAmt = totalIntAmt;
	}

	public String getTotalPrinAmt() {
		return this.totalPrinAmt;
	}
	public void setTotalPrinAmt(String totalPrinAmt) {
		this.totalPrinAmt = totalPrinAmt;
	}

	public String getTotalServAmt() {
		return this.totalServAmt;
	}
	public void setTotalServAmt(String totalServAmt) {
		this.totalServAmt = totalServAmt;
	}

}
