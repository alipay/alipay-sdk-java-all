package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.envvars.set response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-09 11:06:39
 */
public class AlipayCloudCloudbaseFunctionEnvvarsSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6741787413716923322L;

	/** 
	 * 设置环境变量结果
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
