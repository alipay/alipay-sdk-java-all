package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.env.envvars.set response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-28 15:47:50
 */
public class AlipayCloudCloudbaseEnvEnvvarsSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6632837919723881163L;

	/** 
	 * 设置全局环境变量结果
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
