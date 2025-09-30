package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.env.resourcepackage.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:31
 */
public class AlipayCloudCloudbaseEnvResourcepackageModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8798832777889252977L;

	/** 
	 * 升降配结果
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
