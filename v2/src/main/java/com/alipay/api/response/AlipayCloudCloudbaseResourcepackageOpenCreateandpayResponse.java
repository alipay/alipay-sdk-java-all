package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourcepackage.open.createandpay response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-30 17:11:48
 */
public class AlipayCloudCloudbaseResourcepackageOpenCreateandpayResponse extends AlipayResponse {

	private static final long serialVersionUID = 5559113689524783794L;

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
