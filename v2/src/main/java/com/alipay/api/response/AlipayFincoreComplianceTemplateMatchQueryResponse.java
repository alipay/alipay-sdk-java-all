package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.template.match.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 03:06:26
 */
public class AlipayFincoreComplianceTemplateMatchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8433916457254523927L;

	/** 
	 * 模版编码列表
	 */
	@ApiField("template_codes")
	private String templateCodes;

	public void setTemplateCodes(String templateCodes) {
		this.templateCodes = templateCodes;
	}
	public String getTemplateCodes( ) {
		return this.templateCodes;
	}

}
