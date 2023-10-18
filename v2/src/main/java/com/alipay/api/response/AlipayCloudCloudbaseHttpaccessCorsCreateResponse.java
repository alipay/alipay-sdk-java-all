package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.httpaccess.cors.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-17 15:40:58
 */
public class AlipayCloudCloudbaseHttpaccessCorsCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3662721438644643263L;

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
