package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.device.trace.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-01-13 19:15:22
 */
public class AlipayCommerceIotDeviceTraceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3799886126571587838L;

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
