package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nordertag.position.bind response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-18 13:12:47
 */
public class AlipayOpenSpNordertagPositionBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 1148514853458999748L;

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
