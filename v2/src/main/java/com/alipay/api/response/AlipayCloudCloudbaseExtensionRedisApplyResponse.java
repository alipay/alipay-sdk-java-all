package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.extension.redis.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-12 16:56:56
 */
public class AlipayCloudCloudbaseExtensionRedisApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1789466535942715754L;

	/** 
	 * 是否已成功开始安装
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
