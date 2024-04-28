package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.env.recover response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-16 10:02:00
 */
public class AlipayCloudCloudbaseEnvRecoverResponse extends AlipayResponse {

	private static final long serialVersionUID = 1394353139594411211L;

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
