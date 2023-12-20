package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.discovery.taxi.order.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 20:12:27
 */
public class AlipayDiscoveryTaxiOrderConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 7663595274834322521L;

	/** 
	 * 返回结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
