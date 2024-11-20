package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能语音呼叫用户信息
 *
 * @author auto create
 * @since 1.0, 2024-11-13 11:35:26
 */
public class CallUserInfo extends AlipayObject {

	private static final long serialVersionUID = 5526383529282479747L;

	/**
	 * 触达类型为AI_CALL时，逾期金额为必填项
	 */
	@ApiField("amount_overdue")
	private String amountOverdue;

	/**
	 * 触达用户名称
	 */
	@ApiField("customer_name")
	private String customerName;

	/**
	 * 触达用户电话号
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	public String getAmountOverdue() {
		return this.amountOverdue;
	}
	public void setAmountOverdue(String amountOverdue) {
		this.amountOverdue = amountOverdue;
	}

	public String getCustomerName() {
		return this.customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
