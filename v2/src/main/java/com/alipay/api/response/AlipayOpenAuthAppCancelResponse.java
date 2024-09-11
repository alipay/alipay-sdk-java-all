package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.app.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:34
 */
public class AlipayOpenAuthAppCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 2451215665922552661L;

	/** 
	 * 取消授权结果
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
