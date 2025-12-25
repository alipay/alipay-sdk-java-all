package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.externalaccount.bind.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:42
 */
public class AlipayCloudCloudbaseExternalaccountBindDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 1344919594553494749L;

	/** 
	 * 解绑结果
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
