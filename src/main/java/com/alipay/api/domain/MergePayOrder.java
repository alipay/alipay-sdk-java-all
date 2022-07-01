package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合并支付明细单据
 *
 * @author auto create
 * @since 1.0, 2021-02-23 14:24:02
 */
public class MergePayOrder extends AlipayObject {

	private static final long serialVersionUID = 7869338754462834694L;

	/**
	 * 订单金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 失败原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 费用
	 */
	@ApiField("fee")
	private String fee;

	/**
	 * 资金单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 收款方账号
	 */
	@ApiField("payee_display_account")
	private String payeeDisplayAccount;

	/**
	 * 收款方姓名
	 */
	@ApiField("payee_display_name")
	private String payeeDisplayName;

	/**
	 * 收款方机构号
	 */
	@ApiField("payee_inst_id")
	private String payeeInstId;

	/**
	 * 收款方机构名
	 */
	@ApiField("payee_inst_name")
	private String payeeInstName;

	/**
	 * 收款方头像
	 */
	@ApiField("payee_portrait_id")
	private String payeePortraitId;

	/**
	 * 收款方类型
	 */
	@ApiField("payee_type")
	private String payeeType;

	/**
	 * 转账备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 资金单状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 到账时间
	 */
	@ApiField("withdraw_delay")
	private Date withdrawDelay;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getFee() {
		return this.fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPayeeDisplayAccount() {
		return this.payeeDisplayAccount;
	}
	public void setPayeeDisplayAccount(String payeeDisplayAccount) {
		this.payeeDisplayAccount = payeeDisplayAccount;
	}

	public String getPayeeDisplayName() {
		return this.payeeDisplayName;
	}
	public void setPayeeDisplayName(String payeeDisplayName) {
		this.payeeDisplayName = payeeDisplayName;
	}

	public String getPayeeInstId() {
		return this.payeeInstId;
	}
	public void setPayeeInstId(String payeeInstId) {
		this.payeeInstId = payeeInstId;
	}

	public String getPayeeInstName() {
		return this.payeeInstName;
	}
	public void setPayeeInstName(String payeeInstName) {
		this.payeeInstName = payeeInstName;
	}

	public String getPayeePortraitId() {
		return this.payeePortraitId;
	}
	public void setPayeePortraitId(String payeePortraitId) {
		this.payeePortraitId = payeePortraitId;
	}

	public String getPayeeType() {
		return this.payeeType;
	}
	public void setPayeeType(String payeeType) {
		this.payeeType = payeeType;
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

	public Date getWithdrawDelay() {
		return this.withdrawDelay;
	}
	public void setWithdrawDelay(Date withdrawDelay) {
		this.withdrawDelay = withdrawDelay;
	}

}
