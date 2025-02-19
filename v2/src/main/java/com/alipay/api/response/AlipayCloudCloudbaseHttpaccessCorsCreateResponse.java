package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.httpaccess.cors.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:15
 */
public class AlipayCloudCloudbaseHttpaccessCorsCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8894945399267133784L;

	/** 
	 * 是否添加成功
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
