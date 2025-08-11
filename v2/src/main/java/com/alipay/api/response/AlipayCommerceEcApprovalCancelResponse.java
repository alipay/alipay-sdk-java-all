package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.approval.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-25 10:54:51
 */
public class AlipayCommerceEcApprovalCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 4816412889297283725L;

	/** 
	 * 操作结果
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
