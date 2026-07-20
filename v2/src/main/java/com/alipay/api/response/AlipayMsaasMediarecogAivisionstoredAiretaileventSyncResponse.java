package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.aivisionstored.airetailevent.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-09 17:27:56
 */
public class AlipayMsaasMediarecogAivisionstoredAiretaileventSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3534738267386145621L;

	/** 
	 * 返回数据信息
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
