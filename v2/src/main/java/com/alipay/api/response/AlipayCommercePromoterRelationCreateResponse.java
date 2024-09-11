package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.promoter.relation.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-10 11:52:10
 */
public class AlipayCommercePromoterRelationCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6229439578465469652L;

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
