package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.aaa.adfa.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-20 10:03:44
 */
public class AlipaySecurityAaaAdfaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1122279393912526871L;

	/** 
	 * 区
	 */
	@ApiField("area_code")
	private String areaCode;

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getAreaCode( ) {
		return this.areaCode;
	}

}
