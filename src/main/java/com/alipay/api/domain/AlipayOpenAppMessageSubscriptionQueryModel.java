package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询消息订阅关系
 *
 * @author auto create
 * @since 1.0, 2019-10-12 14:00:18
 */
public class AlipayOpenAppMessageSubscriptionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1395236528824719626L;

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
	 * 消息标签，用于消息子类型过滤。使用前请确认消息topic是否支持
	 */
	@ApiField("tag")
	private String tag;

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
