package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.afsrc.vul.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 04:42:14
 */
public class AlipaySecurityProdAfsrcVulCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7791141236494784746L;

	/** 
	 * 漏洞创建结果描述
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 漏洞创建是否成功标识
	 */
	@ApiField("result")
	private Boolean result;

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
