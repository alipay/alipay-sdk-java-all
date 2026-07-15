package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.mmtcaftscv.device.bind response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-30 14:57:44
 */
public class AlipayMsaasMediarecogMmtcaftscvDeviceBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 4191936358753546936L;

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
