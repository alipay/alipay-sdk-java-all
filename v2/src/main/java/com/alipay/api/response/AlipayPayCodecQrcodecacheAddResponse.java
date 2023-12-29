package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.codec.qrcodecache.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:25:04
 */
public class AlipayPayCodecQrcodecacheAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 7397425398175338911L;

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
