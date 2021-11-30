package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 变更订阅关系属性
 *
 * @author auto create
 * @since 1.0, 2021-04-09 17:40:21
 */
public class AlipayOpenAppMessageSubscriptionModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1784811178297397351L;

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
	 * 消费该topic消息的通讯协议类型，目前支持HTTP 或者 WebSocket
	 */
	@ApiField("comm_type")
	private String commType;

	/**
	 * 消息标签，用于消息子类型过滤。使用前请确认消息topic是否支持。若topic传入的消息接口中未定义 tag 则不支持传递。
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
