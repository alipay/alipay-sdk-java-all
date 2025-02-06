package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.env.ak.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:27
 */
public class AlipayCloudCloudbaseEnvAkCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1366616844213372314L;

	/** 
	 * 创建ak结果
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
