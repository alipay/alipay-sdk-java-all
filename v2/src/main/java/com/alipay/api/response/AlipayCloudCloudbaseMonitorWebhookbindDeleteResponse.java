package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.monitor.webhookbind.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-08 14:34:21
 */
public class AlipayCloudCloudbaseMonitorWebhookbindDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 6879219152532978231L;

	/** 
	 * 删除结果
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
