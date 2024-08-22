package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 余额提醒中被提醒人信息
 *
 * @author auto create
 * @since 1.0, 2024-07-18 15:57:21
 */
public class RemindPersonInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 3418759453956217882L;

	/**
	 * 通知渠道，包括邮件，短信，站内信，开放消息；开放消息不能与其他类型同处一个余额提醒中
	 */
	@ApiListField("channel_list")
	@ApiField("string")
	private List<String> channelList;

	/**
	 * 邮件提醒的接收邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 被提醒人电话
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 提醒人的姓名
	 */
	@ApiField("name")
	private String name;

	public List<String> getChannelList() {
		return this.channelList;
	}
	public void setChannelList(List<String> channelList) {
		this.channelList = channelList;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
