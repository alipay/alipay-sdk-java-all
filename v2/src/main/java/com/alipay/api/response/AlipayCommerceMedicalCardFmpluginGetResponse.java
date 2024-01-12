package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.card.fmplugin.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-19 10:16:43
 */
public class AlipayCommerceMedicalCardFmpluginGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5676838255744119958L;

	/** 
	 * 访问令牌，与url中accessToken的值一致
	 */
	@ApiField("access_token")
	private String accessToken;

	/** 
	 * 亲情账户绑定关系插件地址
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
