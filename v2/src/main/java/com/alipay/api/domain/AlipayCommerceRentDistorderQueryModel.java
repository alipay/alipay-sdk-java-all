package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分销订单查询
 *
 * @author auto create
 * @since 1.0, 2026-09-11 10:43:06
 */
public class AlipayCommerceRentDistorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8578581413243416378L;

	/**
	 * 分销订单号
	 */
	@ApiField("biz_order_id")
	private String bizOrderId;

	/**
	 * 渠道买家ID
	 */
	@ApiField("channel_buyer_id")
	private String channelBuyerId;

	/**
	 * 渠道订单号
	 */
	@ApiField("channel_order_id")
	private String channelOrderId;

	/**
	 * 分销渠道
	 */
	@ApiField("distribution_channel")
	private String distributionChannel;

	public String getBizOrderId() {
		return this.bizOrderId;
	}
	public void setBizOrderId(String bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public String getChannelBuyerId() {
		return this.channelBuyerId;
	}
	public void setChannelBuyerId(String channelBuyerId) {
		this.channelBuyerId = channelBuyerId;
	}

	public String getChannelOrderId() {
		return this.channelOrderId;
	}
	public void setChannelOrderId(String channelOrderId) {
		this.channelOrderId = channelOrderId;
	}

	public String getDistributionChannel() {
		return this.distributionChannel;
	}
	public void setDistributionChannel(String distributionChannel) {
		this.distributionChannel = distributionChannel;
	}

}
