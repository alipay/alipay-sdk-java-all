package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.promoter.relation.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 18:16:40
 */
public class AlipayCommercePromoterRelationCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6132559293394322212L;

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
