package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.version.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:39
 */
public class AlipayCloudCloudbaseFunctionVersionDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 6776849877228979532L;

	/** 
	 * 版本删除结果
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
