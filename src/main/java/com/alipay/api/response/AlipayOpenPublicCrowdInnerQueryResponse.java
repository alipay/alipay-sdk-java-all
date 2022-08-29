package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CrowdSummary;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.crowd.inner.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-01 15:29:59
 */
public class AlipayOpenPublicCrowdInnerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6558688391763574361L;

	/** 
	 * 人群摘要信息
	 */
	@ApiField("crowd_summary")
	private CrowdSummary crowdSummary;

	public void setCrowdSummary(CrowdSummary crowdSummary) {
		this.crowdSummary = crowdSummary;
	}
	public CrowdSummary getCrowdSummary( ) {
		return this.crowdSummary;
	}

}
