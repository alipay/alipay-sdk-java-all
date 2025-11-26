package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.hide.deviceid.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 14:57:40
 */
public class AlipaySecurityRiskHideDeviceidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6595625186514488837L;

	/** 
	 * 设备指纹的apdid
	 */
	@ApiField("deviceid")
	private String deviceid;

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}
	public String getDeviceid( ) {
		return this.deviceid;
	}

}
