package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.monitor.webhookbind.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-08 14:34:43
 */
public class AlipayCloudCloudbaseMonitorWebhookbindCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4337898673751442161L;

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
