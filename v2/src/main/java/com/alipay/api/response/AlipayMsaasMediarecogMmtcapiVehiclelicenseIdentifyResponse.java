package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.mmtcapi.vehiclelicense.identify response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-31 18:29:56
 */
public class AlipayMsaasMediarecogMmtcapiVehiclelicenseIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2391437997442211925L;

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
