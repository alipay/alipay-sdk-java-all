package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.schemaerrorcode.rainy.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-11 20:22:19
 */
public class AlipayDataDataserviceSchemaerrorcodeRainyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6753198331184332645L;

	/** 
	 * 1
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
