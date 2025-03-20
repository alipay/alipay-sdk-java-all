package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.device.trace.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:25:24
 */
public class AlipayCommerceIotDeviceTraceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4617329467987453179L;

	/** 
	 * 返回了这段时间内设备的轨迹
	 */
	@ApiField("trace")
	private String trace;

	public void setTrace(String trace) {
		this.trace = trace;
	}
	public String getTrace( ) {
		return this.trace;
	}

}
