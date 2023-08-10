package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-08 18:41:42
 */
public class AlipayCloudCloudbaseFunctionApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2643242659563675139L;

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
