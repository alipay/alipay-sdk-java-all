package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.layer.unbind response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-31 14:46:08
 */
public class AlipayCloudCloudbaseFunctionLayerUnbindResponse extends AlipayResponse {

	private static final long serialVersionUID = 3395612265757544896L;

	/** 
	 * 层解除绑定结果
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
