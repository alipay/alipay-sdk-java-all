package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.StrategyPageQueryData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.aics.devin.strategy.page.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-13 19:22:54
 */
public class DatadigitalAicsDevinStrategyPageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3516384911361858923L;

	/** 
	 * 策略列表分页结果与页结构
	 */
	@ApiField("data")
	private StrategyPageQueryData data;

	public void setData(StrategyPageQueryData data) {
		this.data = data;
	}
	public StrategyPageQueryData getData( ) {
		return this.data;
	}

}
