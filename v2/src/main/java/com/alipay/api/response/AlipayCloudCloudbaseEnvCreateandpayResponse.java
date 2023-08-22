package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.env.createandpay response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-08 22:46:41
 */
public class AlipayCloudCloudbaseEnvCreateandpayResponse extends AlipayResponse {

	private static final long serialVersionUID = 4556814491325833552L;

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
