package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.offlinelabor.project.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-29 13:42:37
 */
public class AlipayEbppIndustryOfflinelaborProjectModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7219254688179254894L;

	/** 
	 * 用户登记认证跳转地址
例如：alipay://XXXXAPPID=XXXXX/XX?XXX 
后续商户跳转时，需要在后面拼接outRegisterNo 与callbackUrl参数。
 outRegisterNo=${本次登记请求Id}&callbackUrl=${回跳地址} 「前端确认是否需要 base64编码，还是URLEncode就行」
	 */
	@ApiField("register_url")
	private String registerUrl;

	public void setRegisterUrl(String registerUrl) {
		this.registerUrl = registerUrl;
	}
	public String getRegisterUrl( ) {
		return this.registerUrl;
	}

}
