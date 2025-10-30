package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.promoter.relation.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-13 21:17:09
 */
public class AlipayCommercePromoterRelationDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 4742851265938134785L;

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
