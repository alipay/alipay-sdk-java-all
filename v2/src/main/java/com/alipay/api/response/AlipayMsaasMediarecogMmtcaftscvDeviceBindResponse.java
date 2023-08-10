package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.mmtcaftscv.device.bind response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 22:55:37
 */
public class AlipayMsaasMediarecogMmtcaftscvDeviceBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 7154974918729725847L;

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
