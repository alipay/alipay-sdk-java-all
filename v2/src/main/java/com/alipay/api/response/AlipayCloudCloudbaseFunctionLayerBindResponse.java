package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.layer.bind response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-07 11:37:05
 */
public class AlipayCloudCloudbaseFunctionLayerBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 8735321351835318223L;

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
