package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:30
 */
public class AlipayCloudCloudbaseFunctionDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 6482489851464249455L;

	/** 
	 * 删除结果
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
