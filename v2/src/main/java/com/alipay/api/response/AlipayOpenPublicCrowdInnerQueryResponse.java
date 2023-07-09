package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CrowdSummary;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.crowd.inner.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 22:29:16
 */
public class AlipayOpenPublicCrowdInnerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1327546179621739759L;

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
