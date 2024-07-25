package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.promoter.relation.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 00:36:46
 */
public class AlipayCommercePromoterRelationCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8539263786952249776L;

	/** 
	 * 结果
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
