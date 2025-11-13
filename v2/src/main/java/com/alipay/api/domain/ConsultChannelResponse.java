package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 咨询请求渠道响应
 *
 * @author auto create
 * @since 1.0, 2024-03-28 09:47:04
 */
public class ConsultChannelResponse extends AlipayObject {

	private static final long serialVersionUID = 4196568525634625264L;

	/**
	 * 渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 可用额度，单位元
	 */
	@ApiField("channel_amount")
	private String channelAmount;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getChannelAmount() {
		return this.channelAmount;
	}
	public void setChannelAmount(String channelAmount) {
		this.channelAmount = channelAmount;
	}

}
