package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BPOpenApiInstance;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.base.process.instance.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-06 15:00:11
 */
public class AlipayBossBaseProcessInstanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5875896971839666613L;

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
