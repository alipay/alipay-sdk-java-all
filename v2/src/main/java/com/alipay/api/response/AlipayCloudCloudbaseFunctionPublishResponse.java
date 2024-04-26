package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.publish response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-13 21:46:39
 */
public class AlipayCloudCloudbaseFunctionPublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 8129745564692484212L;

	/** 
	 * 发布结果
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
