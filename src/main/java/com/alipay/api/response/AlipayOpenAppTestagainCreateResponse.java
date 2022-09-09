package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.testagain.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-22 16:49:02
 */
public class AlipayOpenAppTestagainCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5265144446995596499L;

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
