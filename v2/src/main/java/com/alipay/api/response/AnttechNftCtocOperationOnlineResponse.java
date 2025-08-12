package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.ctoc.operation.online response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 10:17:37
 */
public class AnttechNftCtocOperationOnlineResponse extends AlipayResponse {

	private static final long serialVersionUID = 8788126593613271266L;

	/** 
	 * 认证事件ID
	 */
	@ApiField("verify_event_id")
	private String verifyEventId;

	public void setVerifyEventId(String verifyEventId) {
		this.verifyEventId = verifyEventId;
	}
	public String getVerifyEventId( ) {
		return this.verifyEventId;
	}

}
