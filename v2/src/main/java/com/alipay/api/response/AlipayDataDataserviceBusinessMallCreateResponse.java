package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.business.mall.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-07 18:07:13
 */
public class AlipayDataDataserviceBusinessMallCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6527812747347612835L;

	/** 
	 * 商圈ID
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
