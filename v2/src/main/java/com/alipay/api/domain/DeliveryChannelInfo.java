package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可投放的渠道信息
 *
 * @author auto create
 * @since 1.0, 2021-08-26 23:08:37
 */
public class DeliveryChannelInfo extends AlipayObject {

	private static final long serialVersionUID = 8124842821954831561L;

	/**
	 * 展位码:boothCode表达的是具体渠道所属的展位码。例如：支付结果页PAY_RESULT
	 */
	@ApiField("booth_code")
	private String boothCode;

	/**
	 * 可投放的渠道标识.

说明：
针对不同的boot_code，channel值各不相同.接口使用者可以认为channel是不同booth_code展位下的渠道的唯一标识。

例如：
booth_code为PAYMENT_RESULT。 channel为某个商户的pid。
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 渠道的名称。

说明：
booth_code：PAYMENT_RESULT，channel_name为商户名称。
	 */
	@ApiField("channel_name")
	private String channelName;

	public String getBoothCode() {
		return this.boothCode;
	}
	public void setBoothCode(String boothCode) {
		this.boothCode = boothCode;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getChannelName() {
		return this.channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

}
