package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.mmtcapi.vehiclelicense.identify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 22:09:58
 */
public class AlipayMsaasMediarecogMmtcapiVehiclelicenseIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4592386355593577998L;

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
