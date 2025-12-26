package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-19 10:27:41
 */
public class HmPayInfo extends AlipayObject {

	private static final long serialVersionUID = 1369384325435876923L;

	/**
	 * 支付金额，单位：分
	 */
	@ApiField("pay_amount")
	private Long payAmount;

	/**
	 * 支付方式
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 支付时间（yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("pay_time")
	private String payTime;

	public Long getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayChannel() {
		return this.payChannel;
	}
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public String getPayTime() {
		return this.payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

}
