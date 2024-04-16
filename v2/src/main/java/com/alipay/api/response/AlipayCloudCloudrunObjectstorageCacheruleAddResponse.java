package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CacheRule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.objectstorage.cacherule.add response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-14 15:00:45
 */
public class AlipayCloudCloudrunObjectstorageCacheruleAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 8693555929762717469L;

	/** 
	 * 缓存规则
	 */
	@ApiField("cacherule")
	private CacheRule cacherule;

	public void setCacherule(CacheRule cacherule) {
		this.cacherule = cacherule;
	}
	public CacheRule getCacherule( ) {
		return this.cacherule;
	}

}
