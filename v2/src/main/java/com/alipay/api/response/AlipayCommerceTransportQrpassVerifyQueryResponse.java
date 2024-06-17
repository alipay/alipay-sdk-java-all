package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.qrpass.verify.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-21 14:02:03
 */
public class AlipayCommerceTransportQrpassVerifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4827299759744439233L;

	/** 
	 * 是否校验成功
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
