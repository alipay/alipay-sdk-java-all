package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.httpaccess.bind.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:18
 */
public class AlipayCloudCloudbaseHttpaccessBindCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4328753536844163924L;

	/** 
	 * 是否绑定成功
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
