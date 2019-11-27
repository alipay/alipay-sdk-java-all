package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: aft.aifin.newtest.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-13 10:21:33
 */
public class AftAifinNewtestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2531819969329432174L;

	/** 
	 * 1
	 */
	@ApiField("des")
	private String des;

	public void setDes(String des) {
		this.des = des;
	}
	public String getDes( ) {
		return this.des;
	}

}
