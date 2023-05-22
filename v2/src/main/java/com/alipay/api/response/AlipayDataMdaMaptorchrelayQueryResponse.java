package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.maptorchrelay.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-12 13:51:53
 */
public class AlipayDataMdaMaptorchrelayQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4421174438322346557L;

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
