package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.bless.bodhileaf.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-15 22:08:10
 */
public class AnttechNftBlessBodhileafQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4634331839773247374L;

	/** 
	 * 当前菩提叶余额
	 */
	@ApiField("bodhi_leaf_balance")
	private Long bodhiLeafBalance;

	public void setBodhiLeafBalance(Long bodhiLeafBalance) {
		this.bodhiLeafBalance = bodhiLeafBalance;
	}
	public Long getBodhiLeafBalance( ) {
		return this.bodhiLeafBalance;
	}

}
