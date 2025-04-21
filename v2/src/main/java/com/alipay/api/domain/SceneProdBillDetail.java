package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融账单信息
 *
 * @author auto create
 * @since 1.0, 2023-01-05 14:20:28
 */
public class SceneProdBillDetail extends AlipayObject {

	private static final long serialVersionUID = 5471755289437262356L;

	/**
	 * 账单类型，包括：正常，手续费，保证金 等类型，根据机构需求可以进行扩展。非必填，不填默认为正常。
	 */
	@ApiField("bill_type")
	private String billType;

	/**
	 * 结清日，时间格式为yyyy-MM-dd，如果为空，系统默认会以将账单改为已结清或者已处置状态的日期作为结清日
	 */
	@ApiField("clear_date")
	private String clearDate;

	/**
	 * 货币类型， 不填写默认是人民币（156）
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 贴息金额，单位：分
	 */
	@ApiField("discount_amt")
	private String discountAmt;

	/**
	 * 到期日，时间格式为yyyy-MM-dd
	 */
	@ApiField("due_date")
	private String dueDate;

	/**
	 * 应还利息，单位分
	 */
	@ApiField("int_amt")
	private String intAmt;

	/**
	 * 其它收费项，单位分
	 */
	@ApiField("other_amt")
	private String otherAmt;

	/**
	 * 逾期天数，只能为数字，无逾期传0
	 */
	@ApiField("overdue_days")
	private String overdueDays;

	/**
	 * 已还的利息金额，单位：分
	 */
	@ApiField("paid_int_amt")
	private String paidIntAmt;

	/**
	 * 已还的其他收费项，单位：分
	 */
	@ApiField("paid_other_amt")
	private String paidOtherAmt;

	/**
	 * 已还的罚息金额，单位：分
	 */
	@ApiField("paid_pen_amt")
	private String paidPenAmt;

	/**
	 * 已还的本金金额，单位：分
	 */
	@ApiField("paid_prin_amt")
	private String paidPrinAmt;

	/**
	 * 已还的总金额，单位：分
	 */
	@ApiField("paid_total_amt")
	private String paidTotalAmt;

	/**
	 * 应还罚息，单位：分
	 */
	@ApiField("pen_amt")
	private String penAmt;

	/**
	 * 应还本金，单位分
	 */
	@ApiField("prin_amt")
	private String prinAmt;

	/**
	 * 实际还款日（仅修复数据时使用）
	 */
	@ApiField("real_repay_date")
	private String realRepayDate;

	/**
	 * 账单备注信息
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 当期账单状态，可以选择的枚举值为：正常(NORMAL)，已结清(CLEAR)，逾期(OVERDUE), 已处置（DISPOSAL）
	 */
	@ApiField("status")
	private String status;

	/**
	 * 期数，只能填写大于0的数字
	 */
	@ApiField("term")
	private String term;

	/**
	 * 期次结束日
	 */
	@ApiField("term_end_date")
	private String termEndDate;

	/**
	 * 期次开始日
	 */
	@ApiField("term_start_date")
	private String termStartDate;

	/**
	 * 应还总金额，单位分
	 */
	@ApiField("total_amt")
	private String totalAmt;

	public String getBillType() {
		return this.billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}

	public String getClearDate() {
		return this.clearDate;
	}
	public void setClearDate(String clearDate) {
		this.clearDate = clearDate;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDiscountAmt() {
		return this.discountAmt;
	}
	public void setDiscountAmt(String discountAmt) {
		this.discountAmt = discountAmt;
	}

	public String getDueDate() {
		return this.dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getIntAmt() {
		return this.intAmt;
	}
	public void setIntAmt(String intAmt) {
		this.intAmt = intAmt;
	}

	public String getOtherAmt() {
		return this.otherAmt;
	}
	public void setOtherAmt(String otherAmt) {
		this.otherAmt = otherAmt;
	}

	public String getOverdueDays() {
		return this.overdueDays;
	}
	public void setOverdueDays(String overdueDays) {
		this.overdueDays = overdueDays;
	}

	public String getPaidIntAmt() {
		return this.paidIntAmt;
	}
	public void setPaidIntAmt(String paidIntAmt) {
		this.paidIntAmt = paidIntAmt;
	}

	public String getPaidOtherAmt() {
		return this.paidOtherAmt;
	}
	public void setPaidOtherAmt(String paidOtherAmt) {
		this.paidOtherAmt = paidOtherAmt;
	}

	public String getPaidPenAmt() {
		return this.paidPenAmt;
	}
	public void setPaidPenAmt(String paidPenAmt) {
		this.paidPenAmt = paidPenAmt;
	}

	public String getPaidPrinAmt() {
		return this.paidPrinAmt;
	}
	public void setPaidPrinAmt(String paidPrinAmt) {
		this.paidPrinAmt = paidPrinAmt;
	}

	public String getPaidTotalAmt() {
		return this.paidTotalAmt;
	}
	public void setPaidTotalAmt(String paidTotalAmt) {
		this.paidTotalAmt = paidTotalAmt;
	}

	public String getPenAmt() {
		return this.penAmt;
	}
	public void setPenAmt(String penAmt) {
		this.penAmt = penAmt;
	}

	public String getPrinAmt() {
		return this.prinAmt;
	}
	public void setPrinAmt(String prinAmt) {
		this.prinAmt = prinAmt;
	}

	public String getRealRepayDate() {
		return this.realRepayDate;
	}
	public void setRealRepayDate(String realRepayDate) {
		this.realRepayDate = realRepayDate;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTerm() {
		return this.term;
	}
	public void setTerm(String term) {
		this.term = term;
	}

	public String getTermEndDate() {
		return this.termEndDate;
	}
	public void setTermEndDate(String termEndDate) {
		this.termEndDate = termEndDate;
	}

	public String getTermStartDate() {
		return this.termStartDate;
	}
	public void setTermStartDate(String termStartDate) {
		this.termStartDate = termStartDate;
	}

	public String getTotalAmt() {
		return this.totalAmt;
	}
	public void setTotalAmt(String totalAmt) {
		this.totalAmt = totalAmt;
	}

}
