package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.teeeeeeeest.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-10-24 17:31:24
 */
public class AlipaySecurityTeeeeeeeestBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8484629248418962287L;

	/** 
	 * test
	 */
	@ApiField("code")
	private String code;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

}
