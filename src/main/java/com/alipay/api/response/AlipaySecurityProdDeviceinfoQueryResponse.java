package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.deviceinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-13 19:52:10
 */
public class AlipaySecurityProdDeviceinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8765216434775333578L;

	/** 
	 * device_info，查询返回的设备数据字段JSON字符串
	 */
	@ApiField("device_info")
	private String deviceInfo;

	/** 
	 * risk_info，查询返回的设备风险字段JSON字符串
	 */
	@ApiField("risk_info")
	private String riskInfo;

	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}
	public String getDeviceInfo( ) {
		return this.deviceInfo;
	}

	public void setRiskInfo(String riskInfo) {
		this.riskInfo = riskInfo;
	}
	public String getRiskInfo( ) {
		return this.riskInfo;
	}

}
