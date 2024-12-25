package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.httpaccess.switch.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:25
 */
public class AlipayCloudCloudbaseHttpaccessSwitchGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3571536582962796884L;

	/** 
	 * HTTP访问开关状态
	 */
	@ApiField("enabled")
	private Boolean enabled;

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public Boolean getEnabled( ) {
		return this.enabled;
	}

}
