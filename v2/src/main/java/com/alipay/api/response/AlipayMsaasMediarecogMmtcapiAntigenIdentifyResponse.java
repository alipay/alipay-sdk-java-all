package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.mmtcapi.antigen.identify response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 15:06:53
 */
public class AlipayMsaasMediarecogMmtcapiAntigenIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4257991267832675477L;

	/** 
	 * 算法返回结果，json字符串，无敏感信息
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
