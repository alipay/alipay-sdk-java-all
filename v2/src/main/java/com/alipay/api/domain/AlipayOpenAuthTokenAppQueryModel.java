package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询某个ISV下的指定app_auth_token的授权信息：授权者、授权接口列表、状态、过期时间等
 *
 * @author auto create
 * @since 1.0, 2022-12-13 16:53:46
 */
public class AlipayOpenAuthTokenAppQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5365267171176818258L;

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
