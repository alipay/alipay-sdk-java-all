package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.HeatMapData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.taxi.heatmap.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-12 16:34:11
 */
public class AlipayCommerceTransportTaxiHeatmapQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5655944785228284478L;

	/** 
	 * 热力图数据	参见HeatMapData
	 */
	@ApiField("heatmap_data")
	private HeatMapData heatmapData;

	public void setHeatmapData(HeatMapData heatmapData) {
		this.heatmapData = heatmapData;
	}
	public HeatMapData getHeatmapData( ) {
		return this.heatmapData;
	}

}
