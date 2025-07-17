package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.ctoc.transferprecheck.checkavailable response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-08 15:27:31
 */
public class AnttechNftCtocTransferprecheckCheckavailableResponse extends AlipayResponse {

	private static final long serialVersionUID = 5837667556253932575L;

	/** 
	 * 前置校验id
	 */
	@ApiField("pre_check_id")
	private String preCheckId;

	public void setPreCheckId(String preCheckId) {
		this.preCheckId = preCheckId;
	}
	public String getPreCheckId( ) {
		return this.preCheckId;
	}

}
