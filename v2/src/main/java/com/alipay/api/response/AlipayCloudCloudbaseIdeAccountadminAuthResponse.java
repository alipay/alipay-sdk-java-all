package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.ide.accountadmin.auth response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-28 10:16:54
 */
public class AlipayCloudCloudbaseIdeAccountadminAuthResponse extends AlipayResponse {

	private static final long serialVersionUID = 5737422695419459651L;

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
