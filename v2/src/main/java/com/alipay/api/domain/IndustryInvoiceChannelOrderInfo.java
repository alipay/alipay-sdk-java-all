package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道订单信息列表
 *
 * @author auto create
 * @since 1.0, 2026-08-03 14:07:19
 */
public class IndustryInvoiceChannelOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 3784466979271768175L;

	/**
	 * 渠道订单金额，总位数20位，最多16位整数，最多2位小数，单位：元
	 */
	@ApiField("channel_order_amount")
	private String channelOrderAmount;

	/**
	 * 渠道订单号
	 */
	@ApiField("channel_order_no")
	private String channelOrderNo;

	public String getChannelOrderAmount() {
		return this.channelOrderAmount;
	}
	public void setChannelOrderAmount(String channelOrderAmount) {
		this.channelOrderAmount = channelOrderAmount;
	}

	public String getChannelOrderNo() {
		return this.channelOrderNo;
	}
	public void setChannelOrderNo(String channelOrderNo) {
		this.channelOrderNo = channelOrderNo;
	}

}
