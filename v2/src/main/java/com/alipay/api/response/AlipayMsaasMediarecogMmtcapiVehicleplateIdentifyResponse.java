package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.mmtcapi.vehicleplate.identify response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 00:45:06
 */
public class AlipayMsaasMediarecogMmtcapiVehicleplateIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5328283313649651177L;

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
