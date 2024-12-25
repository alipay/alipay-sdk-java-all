package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.data.dashboard.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 20:52:32
 */
public class AlipayMarketingDataDashboardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1471617421381512454L;

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
