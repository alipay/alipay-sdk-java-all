package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单支付单
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:37:37
 */
public class OrderPayment extends AlipayObject {

	private static final long serialVersionUID = 4759555964469994968L;

	/**
	 * 企业资金账户ID
	 */
	@ApiField("company_account_id")
	private String companyAccountId;

	/**
	 * 支付金额（元，两位小数）
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 支付宝账单号
	 */
	@ApiField("pay_no")
	private String payNo;

	/**
	 * 支付状态
	 */
	@ApiField("pay_status")
	private String payStatus;

	/**
	 * 支付状态信息
	 */
	@ApiField("pay_status_message")
	private String payStatusMessage;

	/**
	 * 用于标记收款人支付宝用户在应用下的唯一标识
	 */
	@ApiField("payee_open_id")
	private String payeeOpenId;

	/**
	 * 收款人用户ID
	 */
	@ApiField("payee_user_id")
	private String payeeUserId;

	public String getCompanyAccountId() {
		return this.companyAccountId;
	}
	public void setCompanyAccountId(String companyAccountId) {
		this.companyAccountId = companyAccountId;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayNo() {
		return this.payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

	public String getPayStatus() {
		return this.payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getPayStatusMessage() {
		return this.payStatusMessage;
	}
	public void setPayStatusMessage(String payStatusMessage) {
		this.payStatusMessage = payStatusMessage;
	}

	public String getPayeeOpenId() {
		return this.payeeOpenId;
	}
	public void setPayeeOpenId(String payeeOpenId) {
		this.payeeOpenId = payeeOpenId;
	}

	public String getPayeeUserId() {
		return this.payeeUserId;
	}
	public void setPayeeUserId(String payeeUserId) {
		this.payeeUserId = payeeUserId;
	}

}
