package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 团体资金用户参与流水模型
 *
 * @author auto create
 * @since 1.0, 2019-06-05 15:10:22
 */
public class GroupFundUserBill extends AlipayObject {

	private static final long serialVersionUID = 7192296927182282665L;

	/**
	 * 实际待收待付金额，两位小数点的整数，单位元
	 */
	@ApiField("actual_amount")
	private String actualAmount;

	/**
	 * 待收或待付金额，两位小数点的正数，单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 团体资金批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 批次状态,包括: INIT:收款中, COLLECT_SUC: 全部收款完成, PAYMENT_SUC: 全部付款完成, CLOSE: 超时收款未完成已关闭，REFUND：付款部分未成功,部分退款
	 */
	@ApiField("batch_status")
	private String batchStatus;

	/**
	 * 资金单据号，唯一标识一次资金流入/流出
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 单据类型, "R"为收款单，"P"为付款单
	 */
	@ApiField("bill_type")
	private String billType;

	/**
	 * 单据状态，包括"INIT": 初始化(发起预结算尚未预付款)，"PRE_PAY": 预付款阶段，"PAY_SUC"：预付款成功，"CLOSE"：已关闭，"REFUND"：已退款
	 */
	@ApiField("status")
	private String status;

	/**
	 * 批次是否过期
	 */
	@ApiField("timeout")
	private Boolean timeout;

	/**
	 * 单据所属的支付宝账户ID，对于收款单表示待付款用户ID，对于付款单标识待收款用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getActualAmount() {
		return this.actualAmount;
	}
	public void setActualAmount(String actualAmount) {
		this.actualAmount = actualAmount;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getBatchStatus() {
		return this.batchStatus;
	}
	public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getBillType() {
		return this.billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getTimeout() {
		return this.timeout;
	}
	public void setTimeout(Boolean timeout) {
		this.timeout = timeout;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
