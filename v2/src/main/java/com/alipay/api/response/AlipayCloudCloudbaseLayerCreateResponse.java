package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.layer.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:24
 */
public class AlipayCloudCloudbaseLayerCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4277138872367565424L;

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
