package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询某个ISV下的指定app_auth_token的授权信息：授权者、授权接口列表、状态、过期时间等
 *
 * @author auto create
 * @since 1.0, 2024-07-30 20:07:16
 */
public class AlipayOpenAuthTokenAppQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4276149632626123127L;

	/**
	 * 应用授权令牌
	 */
	@ApiField("app_auth_token")
	private String appAuthToken;

	public String getAppAuthToken() {
		return this.appAuthToken;
	}
	public void setAppAuthToken(String appAuthToken) {
		this.appAuthToken = appAuthToken;
	}

}
