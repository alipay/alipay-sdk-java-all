package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.data.dashboard.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-01-18 22:20:39
 */
public class AlipayMarketingDataDashboardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3157317219181473189L;

	/** 
	 * 仪表盘访问地址
	 */
	@ApiField("url")
	private String url;

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
