package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.ctoc.operation.online response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-28 11:33:15
 */
public class AnttechNftCtocOperationOnlineResponse extends AlipayResponse {

	private static final long serialVersionUID = 4749589854458618955L;

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
