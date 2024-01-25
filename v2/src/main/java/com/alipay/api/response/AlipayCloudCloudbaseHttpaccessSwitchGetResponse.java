package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.httpaccess.switch.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-08 23:36:41
 */
public class AlipayCloudCloudbaseHttpaccessSwitchGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4222338817789451593L;

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
