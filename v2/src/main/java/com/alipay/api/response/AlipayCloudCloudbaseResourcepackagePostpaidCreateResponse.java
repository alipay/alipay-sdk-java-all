package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourcepackage.postpaid.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-19 10:37:07
 */
public class AlipayCloudCloudbaseResourcepackagePostpaidCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1547577986253821255L;

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
