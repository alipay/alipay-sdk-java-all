package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.trigger.set response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-25 11:21:58
 */
public class AlipayCloudCloudbaseFunctionTriggerSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7175132545885311925L;

	/** 
	 * 设置触发器结果
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
