package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.env.resourcepackage.buy response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-10 20:01:39
 */
public class AlipayCloudCloudbaseEnvResourcepackageBuyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3386118156194886611L;

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
