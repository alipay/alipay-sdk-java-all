package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.miniapp.app.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-17 14:42:04
 */
public class AlipayCloudCloudbaseMiniappAppCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5737625182218996223L;

	/** 
	 * 生成的应用ID
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
