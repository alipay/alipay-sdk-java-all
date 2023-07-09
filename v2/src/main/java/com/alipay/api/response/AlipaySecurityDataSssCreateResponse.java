package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.data.sss.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 03:16:54
 */
public class AlipaySecurityDataSssCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4574994457534552245L;

	/** 
	 * 区
	 */
	@ApiField("c")
	private String c;

	/** 
	 * 区
	 */
	@ApiField("c_open_id")
	private String cOpenId;

	public void setC(String c) {
		this.c = c;
	}
	public String getC( ) {
		return this.c;
	}

	public void setcOpenId(String cOpenId) {
		this.cOpenId = cOpenId;
	}
	public String getcOpenId( ) {
		return this.cOpenId;
	}

}
