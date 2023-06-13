package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.promoter.relation.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 21:16:58
 */
public class AlipayCommercePromoterRelationCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3435536854746181844L;

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
