package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.codec.qrcodecache.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-10 23:08:51
 */
public class AlipayPayCodecQrcodecacheAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 8727727359578695193L;

	/** 
	 * true或者false
	 */
	@ApiField("success")
	private String success;

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
