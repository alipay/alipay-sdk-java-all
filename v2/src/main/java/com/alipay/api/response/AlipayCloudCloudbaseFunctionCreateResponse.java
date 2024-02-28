package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-02 21:41:49
 */
public class AlipayCloudCloudbaseFunctionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3153883368129592184L;

	/** 
	 * 函数创建结果
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
