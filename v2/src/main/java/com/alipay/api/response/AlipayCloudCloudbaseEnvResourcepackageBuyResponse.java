package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.env.resourcepackage.buy response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:34
 */
public class AlipayCloudCloudbaseEnvResourcepackageBuyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6457368668211774672L;

	/** 
	 * 购买结果
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
