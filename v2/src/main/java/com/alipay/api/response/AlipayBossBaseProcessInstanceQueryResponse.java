package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BPOpenApiInstance;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.base.process.instance.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:17:39
 */
public class AlipayBossBaseProcessInstanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6259564156669283594L;

	/** 
	 * 流程实例内容
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
