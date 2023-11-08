package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.scene.token.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 00:52:42
 */
public class AlipayCommerceEducateSceneTokenApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1448694998526635913L;

	/** 
	 * 唤起采集组件令牌
	 */
	@ApiField("app_token")
	private String appToken;

	public void setAppToken(String appToken) {
		this.appToken = appToken;
	}
	public String getAppToken( ) {
		return this.appToken;
	}

}
