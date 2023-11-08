package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.layer.bind response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-08 22:46:42
 */
public class AlipayCloudCloudbaseFunctionLayerBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 2365949249991142254L;

	/** 
	 * 层绑定结果
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
