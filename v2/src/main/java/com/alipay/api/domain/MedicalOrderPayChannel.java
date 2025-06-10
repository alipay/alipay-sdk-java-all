package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医保码订单支付渠道模型
 *
 * @author auto create
 * @since 1.0, 2024-10-15 19:36:10
 */
public class MedicalOrderPayChannel extends AlipayObject {

	private static final long serialVersionUID = 1787952989341678947L;

	/**
	 * 通过该资产支付的金额；币种：人民币；单位：元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 其他非支付宝支付的金额的支付渠道类型
	 */
	@ApiField("channel_type")
	private String channelType;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getChannelType() {
		return this.channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

}
