package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BPOpenApiInstance;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.base.process.instance.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-14 09:54:59
 */
public class AlipayBossBaseProcessInstanceCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5863474314376174869L;

	/** 
	 * 创建的实例
	 */
	@ApiField("instance")
	private BPOpenApiInstance instance;

	public void setInstance(BPOpenApiInstance instance) {
		this.instance = instance;
	}
	public BPOpenApiInstance getInstance( ) {
		return this.instance;
	}

}
