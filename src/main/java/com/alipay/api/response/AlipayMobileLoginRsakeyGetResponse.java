package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.login.rsakey.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMobileLoginRsakeyGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8566426813465375859L;

	/** 
	 * rsa公钥
	 */
	@ApiField("rsapk")
	private String rsapk;

	/** 
	 * 时间戳
	 */
	@ApiField("rsats")
	private String rsats;

	public void setRsapk(String rsapk) {
		this.rsapk = rsapk;
	}
	public String getRsapk( ) {
		return this.rsapk;
	}

	public void setRsats(String rsats) {
		this.rsats = rsats;
	}
	public String getRsats( ) {
		return this.rsats;
	}

}
