package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.prodpaas.ttt.detect response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-07 20:49:58
 */
public class AntProdpaasTttDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 1893336557634739276L;

	/** 
	 * 手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/** 
	 * 1
	 */
	@ApiField("oo")
	private String oo;

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile( ) {
		return this.mobile;
	}

	public void setOo(String oo) {
		this.oo = oo;
	}
	public String getOo( ) {
		return this.oo;
	}

}
