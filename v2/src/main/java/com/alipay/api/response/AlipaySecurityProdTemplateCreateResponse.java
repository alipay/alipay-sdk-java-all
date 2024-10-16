package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-16 09:32:43
 */
public class AlipaySecurityProdTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8289814644386992176L;

	/** 
	 * 创建完成后返回模板编码
	 */
	@ApiField("template_code")
	private String templateCode;

	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}
	public String getTemplateCode( ) {
		return this.templateCode;
	}

}
