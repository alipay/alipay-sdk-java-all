package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.testagain.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-15 09:48:47
 */
public class AlipayOpenAppTestagainCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6352543154629398933L;

	/** 
	 * 1313
	 */
	@ApiField("xxxxxx")
	private String xxxxxx;

	public void setXxxxxx(String xxxxxx) {
		this.xxxxxx = xxxxxx;
	}
	public String getXxxxxx( ) {
		return this.xxxxxx;
	}

}
