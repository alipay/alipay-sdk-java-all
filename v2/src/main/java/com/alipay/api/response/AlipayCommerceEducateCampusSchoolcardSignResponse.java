package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.campus.schoolcard.sign response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 11:11:46
 */
public class AlipayCommerceEducateCampusSchoolcardSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 8111373279638664687L;

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
