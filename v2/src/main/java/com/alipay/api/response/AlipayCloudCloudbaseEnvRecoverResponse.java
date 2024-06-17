package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.env.recover response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-08 14:31:49
 */
public class AlipayCloudCloudbaseEnvRecoverResponse extends AlipayResponse {

	private static final long serialVersionUID = 8117211827948116751L;

	/** 
	 * 复机结果
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
