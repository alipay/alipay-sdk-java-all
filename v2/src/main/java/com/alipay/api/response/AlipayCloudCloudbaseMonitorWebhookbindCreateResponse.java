package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.monitor.webhookbind.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-11 09:47:00
 */
public class AlipayCloudCloudbaseMonitorWebhookbindCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2779693173477965811L;

	/** 
	 * 绑定id
	 */
	@ApiField("id")
	private String id;

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

}
