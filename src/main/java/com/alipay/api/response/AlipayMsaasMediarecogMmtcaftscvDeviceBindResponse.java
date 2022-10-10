package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.mmtcaftscv.device.bind response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-26 11:18:16
 */
public class AlipayMsaasMediarecogMmtcaftscvDeviceBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 2154496495583645846L;

	/** 
	 * 设备注册是否成功
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
