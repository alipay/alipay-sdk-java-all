package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道列表
 *
 * @author auto create
 * @since 1.0, 2023-05-04 11:31:50
 */
public class ServiceSceneChannelVO extends AlipayObject {

	private static final long serialVersionUID = 1468485825455631523L;

	/**
	 * 渠道code
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
