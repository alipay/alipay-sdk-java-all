package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * bpms平台消息体
 *
 * @author auto create
 * @since 1.0, 2024-06-25 14:22:28
 */
public class AlipmcMetaqMessageOpenMqDTO extends AlipayObject {

	private static final long serialVersionUID = 3788844898952859158L;

	/**
	 * 消息id
	 */
	@ApiField("alipmc_message_id")
	private String alipmcMessageId;

	/**
	 * 应用名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 消息内容
	 */
	@ApiField("body")
	private AlipmcMetaqMessageOpenMqBody body;

	/**
	 * 分组id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 时间戳
	 */
	@ApiField("message_timestamp")
	private String messageTimestamp;

	/**
	 * 消息类型
	 */
	@ApiField("message_type")
	private String messageType;

	public String getAlipmcMessageId() {
		return this.alipmcMessageId;
	}
	public void setAlipmcMessageId(String alipmcMessageId) {
		this.alipmcMessageId = alipmcMessageId;
	}

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public AlipmcMetaqMessageOpenMqBody getBody() {
		return this.body;
	}
	public void setBody(AlipmcMetaqMessageOpenMqBody body) {
		this.body = body;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getMessageTimestamp() {
		return this.messageTimestamp;
	}
	public void setMessageTimestamp(String messageTimestamp) {
		this.messageTimestamp = messageTimestamp;
	}

	public String getMessageType() {
		return this.messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

}
