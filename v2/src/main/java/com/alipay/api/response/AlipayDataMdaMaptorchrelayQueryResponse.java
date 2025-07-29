package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.maptorchrelay.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 22:12:29
 */
public class AlipayDataMdaMaptorchrelayQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6559362373537687917L;

	/** 
	 * 累计火炬传递人数,json格式
	 */
	@ApiField("site_uv")
	private String siteUv;

	public void setSiteUv(String siteUv) {
		this.siteUv = siteUv;
	}
	public String getSiteUv( ) {
		return this.siteUv;
	}

}
