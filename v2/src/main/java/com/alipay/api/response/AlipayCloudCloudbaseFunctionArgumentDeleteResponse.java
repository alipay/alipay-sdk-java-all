package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.argument.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:41
 */
public class AlipayCloudCloudbaseFunctionArgumentDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 8787934142859289183L;

	/** 
	 * 删除参数配置结果
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
