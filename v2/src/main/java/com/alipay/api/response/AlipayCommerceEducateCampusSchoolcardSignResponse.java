package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.campus.schoolcard.sign response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-20 19:27:55
 */
public class AlipayCommerceEducateCampusSchoolcardSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 7487943977157779316L;

	/** 
	 * 开通成功，返回的schema
	 */
	@ApiField("schema_url")
	private String schemaUrl;

	public void setSchemaUrl(String schemaUrl) {
		this.schemaUrl = schemaUrl;
	}
	public String getSchemaUrl( ) {
		return this.schemaUrl;
	}

}
