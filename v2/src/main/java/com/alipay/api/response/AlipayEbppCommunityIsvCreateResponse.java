package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.isv.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 02:27:12
 */
public class AlipayEbppCommunityIsvCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4565733515841377792L;

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
