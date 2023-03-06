package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.mmtcapi.vehicleplate.identify response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 19:41:27
 */
public class AlipayMsaasMediarecogMmtcapiVehicleplateIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3331419391713864872L;

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
