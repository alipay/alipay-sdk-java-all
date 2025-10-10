package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.trigger.set response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:20
 */
public class AlipayCloudCloudbaseFunctionTriggerSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3336784157197122654L;

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
