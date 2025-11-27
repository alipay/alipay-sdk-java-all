package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-08-29 14:32:38
 */
public class EduOrderPaymentDetail extends AlipayObject {

	private static final long serialVersionUID = 1124999964785373215L;

	/**
	 * 支付金额，单位：元。
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 支付时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 支付方式
	 */
	@ApiField("pay_way")
	private String payWay;

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getPayWay() {
		return this.payWay;
	}
	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}

}
