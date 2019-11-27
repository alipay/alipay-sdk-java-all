package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OverseaSampleResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.acquire.order.sample.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOverseasAcquireOrderSampleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5686697786324941379L;

	/** 
	 * 结果
	 */
	@ApiField("sample_result")
	private OverseaSampleResult sampleResult;

	public void setSampleResult(OverseaSampleResult sampleResult) {
		this.sampleResult = sampleResult;
	}
	public OverseaSampleResult getSampleResult( ) {
		return this.sampleResult;
	}

}
