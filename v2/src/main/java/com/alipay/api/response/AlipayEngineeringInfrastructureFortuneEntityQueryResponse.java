package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FortuneEntityDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.engineering.infrastructure.fortune.entity.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-24 16:27:45
 */
public class AlipayEngineeringInfrastructureFortuneEntityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1282198883241788824L;

	/** 
	 * 实体详细信息
	 */
	@ApiField("content")
	private FortuneEntityDTO content;

	public void setContent(FortuneEntityDTO content) {
		this.content = content;
	}
	public FortuneEntityDTO getContent( ) {
		return this.content;
	}

}
