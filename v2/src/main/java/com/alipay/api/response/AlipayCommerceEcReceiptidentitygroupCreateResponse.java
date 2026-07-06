package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.receiptidentitygroup.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-11 16:17:55
 */
public class AlipayCommerceEcReceiptidentitygroupCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1674926894468577464L;

	/** 
	 * 收单身份组id
	 */
	@ApiField("identity_group_id")
	private String identityGroupId;

	public void setIdentityGroupId(String identityGroupId) {
		this.identityGroupId = identityGroupId;
	}
	public String getIdentityGroupId( ) {
		return this.identityGroupId;
	}

}
