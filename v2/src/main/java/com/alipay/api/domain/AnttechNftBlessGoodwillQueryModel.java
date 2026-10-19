package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 祈福善念值查询接口
 *
 * @author auto create
 * @since 1.0, 2026-10-15 22:08:14
 */
public class AnttechNftBlessGoodwillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5614842374271889368L;

	/**
	 * 通过 OAuth 授权流程获取，用于解析用户 信息
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
