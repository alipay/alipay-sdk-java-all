package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.tcn.openinvoiceapply.submit response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-03 14:32:04
 */
public class AlipayCommerceEcTcnOpeninvoiceapplySubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 5697799369527431911L;

	/** 
	 * 申请ID
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
