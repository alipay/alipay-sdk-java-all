package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.miniapp.serviceurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-31 15:52:03
 */
public class AlipayIserviceCcmMiniappServiceurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8225415478522749648L;

	/** 
	 * alipayScheme链接
	 */
	@ApiField("service_url")
	private String serviceUrl;

	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}
	public String getServiceUrl( ) {
		return this.serviceUrl;
	}

}
