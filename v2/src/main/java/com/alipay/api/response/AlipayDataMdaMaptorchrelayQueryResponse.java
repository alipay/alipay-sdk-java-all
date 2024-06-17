package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.maptorchrelay.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:16:44
 */
public class AlipayDataMdaMaptorchrelayQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1651727523334193855L;

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
