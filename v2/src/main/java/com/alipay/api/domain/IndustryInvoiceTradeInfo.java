package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单交易信息
 *
 * @author auto create
 * @since 1.0, 2025-12-09 10:16:38
 */
public class IndustryInvoiceTradeInfo extends AlipayObject {

	private static final long serialVersionUID = 6172778418314219174L;

	/**
	 * 交易渠道
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * 订单交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getChannelType() {
		return this.channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
