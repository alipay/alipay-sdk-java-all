package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.extension.redis.destroy response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:43
 */
public class AlipayCloudCloudbaseExtensionRedisDestroyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3326647467416159632L;

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
