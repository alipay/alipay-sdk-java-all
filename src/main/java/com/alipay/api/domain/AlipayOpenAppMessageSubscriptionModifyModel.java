package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 变更订阅关系属性
 *
 * @author auto create
 * @since 1.0, 2019-07-18 11:27:00
 */
public class AlipayOpenAppMessageSubscriptionModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6564327699834961825L;

	/**
	 * 授权令牌
	 */
	@ApiField("auth_token")
	private String authToken;

	/**
	 * 授权类型，例如app_auth表示三方应用授权
	 */
	@ApiField("auth_type")
	private String authType;

	/**
	 * 消费该topic消息的通讯协议类型，目前支持HTTP 或者 WebSocket
	 */
	@ApiField("comm_type")
	private String commType;

	/**
	 * 消息主题名称
	 */
	@ApiField("topic")
	private String topic;

	public String getAuthToken() {
		return this.authToken;
	}
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public String getAuthType() {
		return this.authType;
	}
	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public String getCommType() {
		return this.commType;
	}
	public void setCommType(String commType) {
		this.commType = commType;
	}

	public String getTopic() {
		return this.topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}

}
