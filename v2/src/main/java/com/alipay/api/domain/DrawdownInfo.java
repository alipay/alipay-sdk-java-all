package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 借据信息
 *
 * @author auto create
 * @since 1.0, 2026-08-31 10:59:14
 */
public class DrawdownInfo extends AlipayObject {

	private static final long serialVersionUID = 4319725375779219125L;

	/**
	 * 实际还款日期
	 */
	@ApiField("act_repay_date")
	private String actRepayDate;

	/**
	 * 实还利息，单位：元
	 */
	@ApiField("actual_inte")
	private String actualInte;

	/**
	 * 实还利息罚息（即实还复利），单位：元
	 */
	@ApiField("actual_intefine")
	private String actualIntefine;

	/**
	 * 实还本金，单位：元
	 */
	@ApiField("actual_overdue_corp")
	private String actualOverdueCorp;

	/**
	 * 实还本金罚息，单位：元
	 */
	@ApiField("actual_overdue_corp_inte")
	private String actualOverdueCorpInte;

	/**
	 * 实还违约罚息，单位：元
	 */
	@ApiField("actual_poundage_inte")
	private String actualPoundageInte;

	/**
	 * 实还服务费（含融担费、保费等），单位：元
	 */
	@ApiField("actual_service_fee")
	private String actualServiceFee;

	/**
	 * 优惠的金额，单位：元
	 */
	@ApiField("exempt_amt")
	private String exemptAmt;

	/**
	 * 车牌号
	 */
	@ApiField("license_no")
	private String licenseNo;

	/**
	 * 机构侧借据单号
	 */
	@ApiField("org_drawdown_no")
	private String orgDrawdownNo;

	/**
	 * 机构侧外部还款单号
	 */
	@ApiField("out_repayment_no")
	private String outRepaymentNo;

	/**
	 * 提前结清实还违约金，单位：元
	 */
	@ApiField("poundage")
	private String poundage;

	/**
	 * 总金额，单位：元。= 实还本金 +  实还利息 + 实还服务费 + 提前结清实还违约金 + 实还本金罚息 + 实还利息罚息 + 实还违约罚息- 优惠金额
	 */
	@ApiField("total_amt")
	private String totalAmt;

	public String getActRepayDate() {
		return this.actRepayDate;
	}
	public void setActRepayDate(String actRepayDate) {
		this.actRepayDate = actRepayDate;
	}

	public String getActualInte() {
		return this.actualInte;
	}
	public void setActualInte(String actualInte) {
		this.actualInte = actualInte;
	}

	public String getActualIntefine() {
		return this.actualIntefine;
	}
	public void setActualIntefine(String actualIntefine) {
		this.actualIntefine = actualIntefine;
	}

	public String getActualOverdueCorp() {
		return this.actualOverdueCorp;
	}
	public void setActualOverdueCorp(String actualOverdueCorp) {
		this.actualOverdueCorp = actualOverdueCorp;
	}

	public String getActualOverdueCorpInte() {
		return this.actualOverdueCorpInte;
	}
	public void setActualOverdueCorpInte(String actualOverdueCorpInte) {
		this.actualOverdueCorpInte = actualOverdueCorpInte;
	}

	public String getActualPoundageInte() {
		return this.actualPoundageInte;
	}
	public void setActualPoundageInte(String actualPoundageInte) {
		this.actualPoundageInte = actualPoundageInte;
	}

	public String getActualServiceFee() {
		return this.actualServiceFee;
	}
	public void setActualServiceFee(String actualServiceFee) {
		this.actualServiceFee = actualServiceFee;
	}

	public String getExemptAmt() {
		return this.exemptAmt;
	}
	public void setExemptAmt(String exemptAmt) {
		this.exemptAmt = exemptAmt;
	}

	public String getLicenseNo() {
		return this.licenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getOrgDrawdownNo() {
		return this.orgDrawdownNo;
	}
	public void setOrgDrawdownNo(String orgDrawdownNo) {
		this.orgDrawdownNo = orgDrawdownNo;
	}

	public String getOutRepaymentNo() {
		return this.outRepaymentNo;
	}
	public void setOutRepaymentNo(String outRepaymentNo) {
		this.outRepaymentNo = outRepaymentNo;
	}

	public String getPoundage() {
		return this.poundage;
	}
	public void setPoundage(String poundage) {
		this.poundage = poundage;
	}

	public String getTotalAmt() {
		return this.totalAmt;
	}
	public void setTotalAmt(String totalAmt) {
		this.totalAmt = totalAmt;
	}

}
