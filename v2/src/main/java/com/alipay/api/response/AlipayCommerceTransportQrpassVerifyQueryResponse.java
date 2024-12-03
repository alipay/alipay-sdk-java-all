package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.qrpass.verify.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-12 16:35:19
 */
public class AlipayCommerceTransportQrpassVerifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3295533245652343431L;

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
