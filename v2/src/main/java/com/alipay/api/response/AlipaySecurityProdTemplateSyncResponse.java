package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.template.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-16 09:32:55
 */
public class AlipaySecurityProdTemplateSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3127634473374452531L;

	/** 
	 * 模板模板编码
	 */
	@ApiField("tgt_template_code")
	private String tgtTemplateCode;

	public void setTgtTemplateCode(String tgtTemplateCode) {
		this.tgtTemplateCode = tgtTemplateCode;
	}
	public String getTgtTemplateCode( ) {
		return this.tgtTemplateCode;
	}

}
