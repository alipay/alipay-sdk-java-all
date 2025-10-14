package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.config.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:30
 */
public class AlipayCloudCloudbaseFunctionConfigModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4137134135824134863L;

	/** 
	 * 修改结果
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
