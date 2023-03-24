package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.enterprise.auth.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 01:31:41
 */
public class AlipayCommerceEcEnterpriseAuthApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3181196443768938234L;

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
