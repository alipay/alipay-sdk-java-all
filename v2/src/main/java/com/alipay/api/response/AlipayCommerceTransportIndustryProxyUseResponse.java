package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.industry.proxy.use response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:33
 */
public class AlipayCommerceTransportIndustryProxyUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 5248926831473674781L;

	/** 
	 * 行业代理响应，根据行业场景、行业事件的变化而不同
	 */
	@ApiField("industry_response")
	private String industryResponse;

	public void setIndustryResponse(String industryResponse) {
		this.industryResponse = industryResponse;
	}
	public String getIndustryResponse( ) {
		return this.industryResponse;
	}

}
