package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.layer.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-27 15:12:05
 */
public class AlipayCloudCloudbaseFunctionLayerModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7842718892594221157L;

	/** 
	 * 调整绑定层优先级结果
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
