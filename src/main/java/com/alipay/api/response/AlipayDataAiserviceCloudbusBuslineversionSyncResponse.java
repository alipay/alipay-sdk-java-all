package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.buslineversion.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-13 13:03:38
 */
public class AlipayDataAiserviceCloudbusBuslineversionSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7775251216641196928L;

	/** 
	 * 同步结果
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
