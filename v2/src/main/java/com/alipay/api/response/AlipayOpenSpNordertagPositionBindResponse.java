package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nordertag.position.bind response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-09 10:22:24
 */
public class AlipayOpenSpNordertagPositionBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 5898145531416738483L;

	/** 
	 * 绑定操作结果
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
