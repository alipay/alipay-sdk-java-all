package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hm.userskip.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-28 11:02:41
 */
public class AlipayCommerceMedicalHmUserskipQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2694471768768345673L;

	/** 
	 * 用户跳转履约中间页url
	 */
	@ApiField("skip_url")
	private String skipUrl;

	public void setSkipUrl(String skipUrl) {
		this.skipUrl = skipUrl;
	}
	public String getSkipUrl( ) {
		return this.skipUrl;
	}

}
