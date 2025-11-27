package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.env.destroy response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:32
 */
public class AlipayCloudCloudbaseEnvDestroyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4637954684859877765L;

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
