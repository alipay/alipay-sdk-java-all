package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.mmtcapi.driverlicense.identify response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 00:58:22
 */
public class AlipayMsaasMediarecogMmtcapiDriverlicenseIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8214745146593164215L;

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
