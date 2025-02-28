package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.env.createandpay response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:28
 */
public class AlipayCloudCloudbaseEnvCreateandpayResponse extends AlipayResponse {

	private static final long serialVersionUID = 2739783592468874128L;

	/** 
	 * 全局环境变量ID
	 */
	@ApiField("env_id")
	private String envId;

	public void setEnvId(String envId) {
		this.envId = envId;
	}
	public String getEnvId( ) {
		return this.envId;
	}

}
