package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.comptest.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-11 14:21:13
 */
public class AlipayOpenPublicComptestCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2367344119449574311L;

	/** 
	 * 1
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 2
	 */
	@ApiField("resulttwo")
	private String resulttwo;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setResulttwo(String resulttwo) {
		this.resulttwo = resulttwo;
	}
	public String getResulttwo( ) {
		return this.resulttwo;
	}

}
