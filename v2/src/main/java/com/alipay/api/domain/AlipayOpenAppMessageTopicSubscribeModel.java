package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订阅消息topic
 *
 * @author auto create
 * @since 1.0, 2024-05-30 11:21:43
 */
public class AlipayOpenAppMessageTopicSubscribeModel extends AlipayObject {

	private static final long serialVersionUID = 3439896646925884897L;

	/**
	 * 授权令牌
	 */
	@ApiField("auth_token")
	private String authToken;

	/**
	 * 授权类型。枚举如下：
* app_auth：表示第三方应用授权。
* user_auth：表示用户授权。
	 */
	@ApiField("auth_type")
	private String authType;

	/**
	 * 消费该topic消息的通讯协议类型，目前支持 HTTP 或 WebSocket
	 */
	@ApiField("comm_type")
	private String commType;

	/**
	 * 消息标签，用于消息子类型过滤。使用前请确认消息topic是否支持。若消息接口中未定义 tag 则不支持传递。
	 */
	@ApiField("tag")
	private String tag;

	/**
	 * 消息主题名称，即消息接口英文名。
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

	public String getTag() {
		return this.tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getTopic() {
		return this.topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}

}
