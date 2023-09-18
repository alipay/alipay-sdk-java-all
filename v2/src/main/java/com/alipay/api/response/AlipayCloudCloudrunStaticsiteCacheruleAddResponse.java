package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CacheRule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.staticsite.cacherule.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-03 16:06:54
 */
public class AlipayCloudCloudrunStaticsiteCacheruleAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 7775358583416329948L;

	/** 
	 * 缓存配置
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
