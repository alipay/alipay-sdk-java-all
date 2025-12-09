package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.redis.capacity.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-09 11:22:29
 */
public class AlipayCloudCloudbaseRedisCapacityModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8489667742587512582L;

	/** 
	 * 扩缩容结果
	 */
	@ApiField("data")
	private Boolean data;

	public void setData(Boolean data) {
		this.data = data;
	}
	public Boolean getData( ) {
		return this.data;
	}

}
