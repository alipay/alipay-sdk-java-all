package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-13 21:56:39
 */
public class AlipayCloudCloudbaseFunctionApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6854662623279745671L;

	/** 
	 * 执行云函数后返回对应函数执行结果
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
