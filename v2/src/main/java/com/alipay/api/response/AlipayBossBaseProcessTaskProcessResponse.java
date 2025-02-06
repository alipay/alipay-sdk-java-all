package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BPOpenApiInstance;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.base.process.task.process response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-27 11:12:24
 */
public class AlipayBossBaseProcessTaskProcessResponse extends AlipayResponse {

	private static final long serialVersionUID = 6276146458171311675L;

	/** 
	 * 流程实例数据
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
