package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.sss.eeee response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayDataDataserviceSssEeeeResponse extends AlipayResponse {

	private static final long serialVersionUID = 7351632354623682159L;

	/** 
	 * 12
	 */
	@ApiField("dddd")
	private String dddd;

	public void setDddd(String dddd) {
		this.dddd = dddd;
	}
	public String getDddd( ) {
		return this.dddd;
	}

}
