package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.openbizmock.appid.detect response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-14 11:52:37
 */
public class AlipayOpenOpenbizmockAppidDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 7438634285882263297L;

	/** 
	 * 检测结果
	 */
	@ApiField("detect_response")
	private String detectResponse;

	public void setDetectResponse(String detectResponse) {
		this.detectResponse = detectResponse;
	}
	public String getDetectResponse( ) {
		return this.detectResponse;
	}

}
