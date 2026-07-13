package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TrendDataDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.engineering.infrastructure.stock.realtime.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-24 16:25:33
 */
public class AlipayEngineeringInfrastructureStockRealtimeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1812839978461819571L;

	/** 
	 * null
	 */
	@ApiListField("data")
	@ApiField("trend_data_d_t_o")
	private List<TrendDataDTO> data;

	public void setData(List<TrendDataDTO> data) {
		this.data = data;
	}
	public List<TrendDataDTO> getData( ) {
		return this.data;
	}

}
