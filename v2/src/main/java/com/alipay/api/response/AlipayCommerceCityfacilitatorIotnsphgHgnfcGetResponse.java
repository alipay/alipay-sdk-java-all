package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.iotnsphg.hgnfc.get response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-02 15:42:26
 */
public class AlipayCommerceCityfacilitatorIotnsphgHgnfcGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3753995435167535133L;

	/** 
	 * 业务内容
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
