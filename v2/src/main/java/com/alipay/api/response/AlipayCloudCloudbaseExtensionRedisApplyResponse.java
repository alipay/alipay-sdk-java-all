package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.extension.redis.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:43
 */
public class AlipayCloudCloudbaseExtensionRedisApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6898662939753772732L;

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
