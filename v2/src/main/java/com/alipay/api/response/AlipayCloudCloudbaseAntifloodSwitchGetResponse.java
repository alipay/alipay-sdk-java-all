package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.antiflood.switch.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:36
 */
public class AlipayCloudCloudbaseAntifloodSwitchGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2347273958774557368L;

	/** 
	 * 防刷开关状态
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
