package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.ide.app.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 09:21:36
 */
public class AlipayCloudCloudbaseIdeAppCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4845896575895944694L;

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
