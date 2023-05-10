package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权令牌换取用户授权身份信息
 *
 * @author auto create
 * @since 1.0, 2022-12-30 12:02:19
 */
public class MybankCreditUserInfoShareQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3266765524741297538L;

	/**
	 * 访问令牌。通过该令牌调用需要授权类接口.
mybank.credit.user.system.oauth.query接口返回
	 */
	@ApiField("access_token")
	private String accessToken;

	public String getAccessToken() {
		return this.accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

}
