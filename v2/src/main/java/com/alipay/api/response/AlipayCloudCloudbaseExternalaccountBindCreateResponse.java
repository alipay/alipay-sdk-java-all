package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.externalaccount.bind.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 09:21:45
 */
public class AlipayCloudCloudbaseExternalaccountBindCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2357739637173386621L;

	/** 
	 * 生成的小程序ID
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}
	public String getBizAppId( ) {
		return this.bizAppId;
	}

}
