package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.planetsolutioncenter.isv.bind response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 05:49:20
 */
public class AlipayCommerceOperationPlanetsolutioncenterIsvBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 2136166791994496357L;

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
