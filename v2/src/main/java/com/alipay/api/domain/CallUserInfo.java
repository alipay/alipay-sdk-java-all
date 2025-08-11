package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能语音呼叫用户信息
 *
 * @author auto create
 * @since 1.0, 2024-11-25 17:40:41
 */
public class CallUserInfo extends AlipayObject {

	private static final long serialVersionUID = 1345685418633242774L;

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
	 * 订单编号
	 */
	@ApiField("order_code")
	private String orderCode;

	/**
	 * 触达用户电话号
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	/**
	 * 短信信息中嵌入的链接
	 */
	@ApiField("sign_url")
	private String signUrl;

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

	public String getOrderCode() {
		return this.orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSignUrl() {
		return this.signUrl;
	}
	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}

}
