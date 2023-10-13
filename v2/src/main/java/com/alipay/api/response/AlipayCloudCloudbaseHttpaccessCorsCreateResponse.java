package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.httpaccess.cors.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-09 11:11:42
 */
public class AlipayCloudCloudbaseHttpaccessCorsCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3158468799618769133L;

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
