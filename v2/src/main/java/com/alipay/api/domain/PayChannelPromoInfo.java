package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道信息
 *
 * @author auto create
 * @since 1.0, 2023-03-28 10:39:14
 */
public class PayChannelPromoInfo extends AlipayObject {

	private static final long serialVersionUID = 3691522657849978242L;

	/**
	 * 渠道扩展信息
	 */
	@ApiField("channel_balance")
	private String channelBalance;

	/**
	 * 渠道唯一索引
	 */
	@ApiField("channel_index")
	private String channelIndex;

	/**
	 * 渠道名称
	 */
	@ApiField("channel_name")
	private String channelName;

	public String getChannelBalance() {
		return this.channelBalance;
	}
	public void setChannelBalance(String channelBalance) {
		this.channelBalance = channelBalance;
	}

	public String getChannelIndex() {
		return this.channelIndex;
	}
	public void setChannelIndex(String channelIndex) {
		this.channelIndex = channelIndex;
	}

	public String getChannelName() {
		return this.channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

}
