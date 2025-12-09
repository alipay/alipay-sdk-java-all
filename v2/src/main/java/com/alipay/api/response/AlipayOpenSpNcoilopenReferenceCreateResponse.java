package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.ncoilopen.reference.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-26 11:03:28
 */
public class AlipayOpenSpNcoilopenReferenceCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6714557867295248886L;

	/** 
	 * 流水id，整个订单处理过程中串联整个链路的id
	 */
	@ApiField("reference_id")
	private String referenceId;

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}
	public String getReferenceId( ) {
		return this.referenceId;
	}

}
