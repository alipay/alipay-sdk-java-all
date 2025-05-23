package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.version.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:19
 */
public class AlipayCloudCloudbaseFunctionVersionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3381992945159144151L;

	/** 
	 * 创建版本结果
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
