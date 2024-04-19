package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.antiflood.switch.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-14 17:41:45
 */
public class AlipayCloudCloudbaseAntifloodSwitchGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5486654693688378317L;

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
