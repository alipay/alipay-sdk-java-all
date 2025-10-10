package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.hdfaccess.cif.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-06 10:32:36
 */
public class AlipayCommerceHdfaccessCifQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4381123295132615555L;

	/** 
	 * 用户签约手机号
	 */
	@ApiField("mobile")
	private String mobile;

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile( ) {
		return this.mobile;
	}

}
