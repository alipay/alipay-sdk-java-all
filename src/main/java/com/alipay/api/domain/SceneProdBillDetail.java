package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融账单信息
 *
 * @author auto create
 * @since 1.0, 2018-01-23 11:53:48
 */
public class SceneProdBillDetail extends AlipayObject {

	private static final long serialVersionUID = 7277563684923832847L;

	/**
	 * 账单类型，包括：正常，手续费，保证金 等类型，根据机构需求可以进行扩展。非必填，不填默认为正常。
	 */
	@ApiField("bill_type")
	private String billType;

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
	 * 逾期天数，只能为数字，无逾期传0
	 */
	@ApiField("overdue_days")
	private String overdueDays;

	/**
	 * 应还罚息
	 */
	@ApiField("pen_amt")
	private String penAmt;

	/**
	 * 应还本金，单位分
	 */
	@ApiField("prin_amt")
	private String prinAmt;

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

	public String getOverdueDays() {
		return this.overdueDays;
	}
	public void setOverdueDays(String overdueDays) {
		this.overdueDays = overdueDays;
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

	public String getTotalAmt() {
		return this.totalAmt;
	}
	public void setTotalAmt(String totalAmt) {
		this.totalAmt = totalAmt;
	}

}
