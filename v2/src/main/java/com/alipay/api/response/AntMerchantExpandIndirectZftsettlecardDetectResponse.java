package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.zftsettlecard.detect response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-22 17:07:42
 */
public class AntMerchantExpandIndirectZftsettlecardDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 7375667633538135582L;

	/** 
	 * 是否一致，一致："true", 不一致："false"
	 */
	@ApiField("consistent")
	private Boolean consistent;

	/** 
	 * 结算信息核对不一致的原因
	 */
	@ApiField("inconsistency_reason")
	private String inconsistencyReason;

	public void setConsistent(Boolean consistent) {
		this.consistent = consistent;
	}
	public Boolean getConsistent( ) {
		return this.consistent;
	}

	public void setInconsistencyReason(String inconsistencyReason) {
		this.inconsistencyReason = inconsistencyReason;
	}
	public String getInconsistencyReason( ) {
		return this.inconsistencyReason;
	}

}
