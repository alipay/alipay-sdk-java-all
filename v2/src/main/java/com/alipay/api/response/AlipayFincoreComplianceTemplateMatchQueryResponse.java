package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.template.match.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 10:05:07
 */
public class AlipayFincoreComplianceTemplateMatchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7114782131419159558L;

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
