package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.argument.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:41
 */
public class AlipayCloudCloudbaseFunctionArgumentModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5663553148397654498L;

	/** 
	 * 修改参数配置结果
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
