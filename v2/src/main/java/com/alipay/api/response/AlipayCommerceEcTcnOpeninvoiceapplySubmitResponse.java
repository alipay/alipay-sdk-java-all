package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.tcn.openinvoiceapply.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-02 19:21:51
 */
public class AlipayCommerceEcTcnOpeninvoiceapplySubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 1174319818788123651L;

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
