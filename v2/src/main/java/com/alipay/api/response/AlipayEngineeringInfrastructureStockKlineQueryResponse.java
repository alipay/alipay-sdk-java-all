package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ObjKLineDTOWrapper;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.engineering.infrastructure.stock.kline.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-20 00:05:39
 */
public class AlipayEngineeringInfrastructureStockKlineQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5438774212216783843L;

	/** 
	 * 业务数据，类型为ObjKLineDTOWrapper
	 */
	@ApiField("data")
	private ObjKLineDTOWrapper data;

	public void setData(ObjKLineDTOWrapper data) {
		this.data = data;
	}
	public ObjKLineDTOWrapper getData( ) {
		return this.data;
	}

}
