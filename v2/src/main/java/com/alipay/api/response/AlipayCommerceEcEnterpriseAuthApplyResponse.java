package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.enterprise.auth.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-30 17:53:40
 */
public class AlipayCommerceEcEnterpriseAuthApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6785559274982222492L;

	/** 
	 * 企业认证申请记录ID
	 */
	@ApiField("auth_apply_id")
	private String authApplyId;

	public void setAuthApplyId(String authApplyId) {
		this.authApplyId = authApplyId;
	}
	public String getAuthApplyId( ) {
		return this.authApplyId;
	}

}
