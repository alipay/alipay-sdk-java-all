package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.argument.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-08 22:41:38
 */
public class AlipayCloudCloudbaseFunctionArgumentDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 2842223937738755339L;

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
