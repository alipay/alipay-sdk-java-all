package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EtcDeviceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.devicestatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-12 15:47:31
 */
public class AlipayCommerceTransportEtcDevicestatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5398331552631877925L;

	/** 
	 * 设备信息详情
	 */
	@ApiField("device_info")
	private EtcDeviceInfo deviceInfo;

	public void setDeviceInfo(EtcDeviceInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
	}
	public EtcDeviceInfo getDeviceInfo( ) {
		return this.deviceInfo;
	}

}
