package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.externalaccount.bind.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-08 16:21:59
 */
public class AlipayCloudCloudbaseExternalaccountBindInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 6122852781863985164L;

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
