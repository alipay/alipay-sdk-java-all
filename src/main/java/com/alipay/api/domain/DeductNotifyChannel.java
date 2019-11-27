package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通知渠道描述
 *
 * @author auto create
 * @since 1.0, 2014-10-29 14:56:08
 */
public class DeductNotifyChannel extends AlipayObject {

	private static final long serialVersionUID = 3197471817897277262L;

	/**
	 * 渠道ID。取值：
sms：短信
push：PUSH通知
todo：待办事项
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 渠道名称。取值：短信/PUSH通知/待办事项
	 */
	@ApiField("channel_name")
	private String channelName;

	public String getChannelId() {
		return this.channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getChannelName() {
		return this.channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

}
