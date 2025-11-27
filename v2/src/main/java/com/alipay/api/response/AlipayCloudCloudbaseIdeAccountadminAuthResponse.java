package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.ide.accountadmin.auth response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 09:21:37
 */
public class AlipayCloudCloudbaseIdeAccountadminAuthResponse extends AlipayResponse {

	private static final long serialVersionUID = 8662523511538688836L;

	/** 
	 * 授权结果
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
