package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.content.count.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:21
 */
public class AlipayOverseasTravelContentCountSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6187189114236429497L;

	/** 
	 * 详细错误码。可选，当code=40004，sub_code=BUSINESS_ERROR，不为为空
	 */
	@ApiField("results")
	private String results;

	public void setResults(String results) {
		this.results = results;
	}
	public String getResults( ) {
		return this.results;
	}

}
