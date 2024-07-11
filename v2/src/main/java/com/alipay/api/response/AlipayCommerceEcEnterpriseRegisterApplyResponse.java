package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.enterprise.register.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-30 17:54:39
 */
public class AlipayCommerceEcEnterpriseRegisterApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7147316232443617424L;

	/** 
	 * 申请id
	 */
	@ApiField("apply_id")
	private String applyId;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId( ) {
		return this.applyId;
	}

}
