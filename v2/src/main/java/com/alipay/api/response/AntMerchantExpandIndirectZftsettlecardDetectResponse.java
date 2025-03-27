package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.zftsettlecard.detect response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-16 10:52:14
 */
public class AntMerchantExpandIndirectZftsettlecardDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 6395215738183788699L;

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
