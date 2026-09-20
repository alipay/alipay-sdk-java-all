package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.aics.devin.strategy.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-10 15:45:13
 */
public class DatadigitalAicsDevinStrategyCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6264192336181137678L;

	/** 
	 * 新增数据主键ID（与 data.value 同值）
	 */
	@ApiField("id")
	private Long id;

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId( ) {
		return this.id;
	}

}
