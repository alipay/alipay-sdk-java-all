package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.version.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-08 22:41:39
 */
public class AlipayCloudCloudbaseFunctionVersionDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 5481423929475716866L;

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
