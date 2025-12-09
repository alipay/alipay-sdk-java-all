package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.httpscerthosting.delete response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-04 11:09:31
 */
public class AlipayCloudCloudbaseHttpscerthostingDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 2121279566813317946L;

	/** 
	 * 是否删除成功
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
