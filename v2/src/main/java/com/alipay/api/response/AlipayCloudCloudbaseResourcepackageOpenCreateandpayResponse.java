package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourcepackage.open.createandpay response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-17 11:12:03
 */
public class AlipayCloudCloudbaseResourcepackageOpenCreateandpayResponse extends AlipayResponse {

	private static final long serialVersionUID = 3711226736734287872L;

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
