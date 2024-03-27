package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-03 17:51:49
 */
public class AlipayCloudCloudbaseFunctionModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8359529878145473261L;

	/** 
	 * 修改函数结果
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
