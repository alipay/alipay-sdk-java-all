package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.httpscerthosting.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-06 16:22:02
 */
public class AlipayCloudCloudbaseHttpscerthostingCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1272138922761969364L;

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
