package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourcepackage.open.createandpay response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-04 11:09:12
 */
public class AlipayCloudCloudbaseResourcepackageOpenCreateandpayResponse extends AlipayResponse {

	private static final long serialVersionUID = 4159245355568958141L;

	/** 
	 * 外部环境id
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
