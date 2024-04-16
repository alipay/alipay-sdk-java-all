package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.sms.code.verify response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-03 14:10:09
 */
public class DatadigitalFincloudFinsaasSmsCodeVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4335835526538971838L;

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
