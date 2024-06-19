package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.enterprise.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-30 17:52:35
 */
public class AlipayCommerceEcEnterpriseDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 6718942466242889775L;

	/** 
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
	public String getEnterpriseId( ) {
		return this.enterpriseId;
	}

}
