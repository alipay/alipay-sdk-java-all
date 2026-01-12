package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.familyinfo.plugin.get response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-04 16:47:42
 */
public class AlipayCommerceMedicalFamilyinfoPluginGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6398581283777643199L;

	/** 
	 * 访问令牌，与url中accessToken的值一致
	 */
	@ApiField("access_token")
	private String accessToken;

	/** 
	 * 医疗健康我的家人信息插件地址
	 */
	@ApiField("url")
	private String url;

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getAccessToken( ) {
		return this.accessToken;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
