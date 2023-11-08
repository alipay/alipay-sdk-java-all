package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PoiQueryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.poi.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 21:23:12
 */
public class AlipayOverseasTravelPoiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5217682884123738887L;

	/** 
	 * 支付宝poi查询结果
	 */
	@ApiField("poi_query_result")
	private PoiQueryResult poiQueryResult;

	public void setPoiQueryResult(PoiQueryResult poiQueryResult) {
		this.poiQueryResult = poiQueryResult;
	}
	public PoiQueryResult getPoiQueryResult( ) {
		return this.poiQueryResult;
	}

}
