package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.layer.version.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:23
 */
public class AlipayCloudCloudbaseLayerVersionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3129979742977727448L;

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
