package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.httpscerthosting.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-05 14:07:43
 */
public class AlipayCloudCloudbaseHttpscerthostingCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5391175829937649224L;

	/** 
	 * 是否创建成功
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
