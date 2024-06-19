package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.env.stop response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-08 14:31:31
 */
public class AlipayCloudCloudbaseEnvStopResponse extends AlipayResponse {

	private static final long serialVersionUID = 2539273477853568214L;

	/** 
	 * 停服结果
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
