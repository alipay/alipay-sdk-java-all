package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户确认消息体
 *
 * @author auto create
 * @since 1.0, 2020-01-09 10:59:59
 */
public class UserConfirmPayload extends AlipayObject {

	private static final long serialVersionUID = 4779863999964955583L;

	/**
	 * 业务场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 用户校验token
	 */
	@ApiField("user_token")
	private String userToken;

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getUserToken() {
		return this.userToken;
	}
	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

}
