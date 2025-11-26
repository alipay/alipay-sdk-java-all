package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.ctoc.transferprecheck.checkavailable response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-28 11:33:20
 */
public class AnttechNftCtocTransferprecheckCheckavailableResponse extends AlipayResponse {

	private static final long serialVersionUID = 4418316775548856215L;

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
