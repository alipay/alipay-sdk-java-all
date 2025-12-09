package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.zftsettlecard.detect response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-21 10:32:29
 */
public class AntMerchantExpandIndirectZftsettlecardDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 6231635462125331236L;

	/** 
	 * 是否一致，一致："true", 不一致："false"
	 */
	@ApiField("consistent")
	private Boolean consistent;

	public void setConsistent(Boolean consistent) {
		this.consistent = consistent;
	}
	public Boolean getConsistent( ) {
		return this.consistent;
	}

}
