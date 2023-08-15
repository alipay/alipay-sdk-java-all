package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.httpaccess.bind.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-09 10:41:38
 */
public class AlipayCloudCloudbaseHttpaccessBindCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6156239418352887884L;

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
