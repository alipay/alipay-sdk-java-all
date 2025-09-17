package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.extension.redis.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-08 17:17:26
 */
public class AlipayCloudCloudbaseExtensionRedisApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8551397643917613151L;

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
