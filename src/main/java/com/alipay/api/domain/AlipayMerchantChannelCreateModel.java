package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建渠道
 *
 * @author auto create
 * @since 1.0, 2022-04-06 11:01:30
 */
public class AlipayMerchantChannelCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8874942551495325678L;

	/**
	 * 渠道唯一标识
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 渠道名称
	 */
	@ApiField("channel_name")
	private String channelName;

	public String getChannelCode() {
		return this.channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getChannelName() {
		return this.channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

}
