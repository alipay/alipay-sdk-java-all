package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.approval.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:51:44
 */
public class AlipayCommerceEcApprovalCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 1346982575158132145L;

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
