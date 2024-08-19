package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.httpscerthosting.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-09 14:57:04
 */
public class AlipayCloudCloudbaseHttpscerthostingCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4694156713912326356L;

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
