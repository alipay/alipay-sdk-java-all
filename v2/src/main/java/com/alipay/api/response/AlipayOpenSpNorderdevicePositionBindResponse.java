package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.norderdevice.position.bind response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-23 14:17:45
 */
public class AlipayOpenSpNorderdevicePositionBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 5164499959461111546L;

	/** 
	 * 绑定结果
	 */
	@ApiField("bind_result")
	private String bindResult;

	public void setBindResult(String bindResult) {
		this.bindResult = bindResult;
	}
	public String getBindResult( ) {
		return this.bindResult;
	}

}
