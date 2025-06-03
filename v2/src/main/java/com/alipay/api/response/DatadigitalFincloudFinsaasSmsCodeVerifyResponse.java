package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.sms.code.verify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:38:05
 */
public class DatadigitalFincloudFinsaasSmsCodeVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4471832893361545328L;

	/** 
	 * 发送结果
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
