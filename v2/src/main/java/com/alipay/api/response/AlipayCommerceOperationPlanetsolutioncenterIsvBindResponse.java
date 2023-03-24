package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.planetsolutioncenter.isv.bind response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 01:50:55
 */
public class AlipayCommerceOperationPlanetsolutioncenterIsvBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 7846397184429343462L;

	/** 
	 * 是否成功
	 */
	@ApiField("response")
	private String response;

	public void setResponse(String response) {
		this.response = response;
	}
	public String getResponse( ) {
		return this.response;
	}

}
