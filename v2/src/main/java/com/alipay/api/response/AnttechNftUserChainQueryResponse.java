package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.user.chain.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-11 15:46:26
 */
public class AnttechNftUserChainQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3542328754573635278L;

	/** 
	 * 账户链上地址
	 */
	@ApiField("chain_address")
	private String chainAddress;

	public void setChainAddress(String chainAddress) {
		this.chainAddress = chainAddress;
	}
	public String getChainAddress( ) {
		return this.chainAddress;
	}

}
