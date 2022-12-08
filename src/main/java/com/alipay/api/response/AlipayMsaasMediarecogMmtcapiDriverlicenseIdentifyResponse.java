package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.mmtcapi.driverlicense.identify response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 18:31:32
 */
public class AlipayMsaasMediarecogMmtcapiDriverlicenseIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2896367763698762857L;

	/** 
	 * 识别结果
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
