package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.isv.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-09 14:30:01
 */
public class AlipayEbppCommunityIsvCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1721595235841168888L;

	/** 
	 * ISV短名
	 */
	@ApiField("isv_short_name")
	private String isvShortName;

	public void setIsvShortName(String isvShortName) {
		this.isvShortName = isvShortName;
	}
	public String getIsvShortName( ) {
		return this.isvShortName;
	}

}
