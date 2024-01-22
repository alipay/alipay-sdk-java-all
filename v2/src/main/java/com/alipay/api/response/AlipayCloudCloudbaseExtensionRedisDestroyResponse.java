package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.extension.redis.destroy response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-17 19:01:45
 */
public class AlipayCloudCloudbaseExtensionRedisDestroyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8263992825531815293L;

	/** 
	 * 是否卸载成功
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
