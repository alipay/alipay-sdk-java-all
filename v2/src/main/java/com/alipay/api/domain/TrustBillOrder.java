package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可信账单订单信息
 *
 * @author auto create
 * @since 1.0, 2025-02-08 11:16:54
 */
public class TrustBillOrder extends AlipayObject {

	private static final long serialVersionUID = 3396381914137648557L;

	/**
	 * 账单支付总金额	，单位元
	 */
	@ApiField("actual_total_amount")
	private String actualTotalAmount;

	/**
	 * 账单调整金额	，单位元
	 */
	@ApiField("adjusted_amount")
	private String adjustedAmount;

	/**
	 * 账单名称
	 */
	@ApiField("bill_name")
	private String billName;

	/**
	 * 账单ID,数科唯一
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 状态说明
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 账单初始总金额，单位元
	 */
	@ApiField("original_total_amount")
	private String originalTotalAmount;

	/**
	 * 外部账单ID，商户唯一
	 */
	@ApiField("out_bill_no")
	private String outBillNo;

	/**
	 * 交易备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 账单状态
	 */
	@ApiField("status")
	private String status;

	public String getActualTotalAmount() {
		return this.actualTotalAmount;
	}
	public void setActualTotalAmount(String actualTotalAmount) {
		this.actualTotalAmount = actualTotalAmount;
	}

	public String getAdjustedAmount() {
		return this.adjustedAmount;
	}
	public void setAdjustedAmount(String adjustedAmount) {
		this.adjustedAmount = adjustedAmount;
	}

	public String getBillName() {
		return this.billName;
	}
	public void setBillName(String billName) {
		this.billName = billName;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getOriginalTotalAmount() {
		return this.originalTotalAmount;
	}
	public void setOriginalTotalAmount(String originalTotalAmount) {
		this.originalTotalAmount = originalTotalAmount;
	}

	public String getOutBillNo() {
		return this.outBillNo;
	}
	public void setOutBillNo(String outBillNo) {
		this.outBillNo = outBillNo;
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

}
