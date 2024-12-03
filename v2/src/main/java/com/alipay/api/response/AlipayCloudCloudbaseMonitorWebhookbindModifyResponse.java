package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.monitor.webhookbind.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 09:20:14
 */
public class AlipayCloudCloudbaseMonitorWebhookbindModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5613447743472581465L;

	/** 
	 * 更新结果
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
