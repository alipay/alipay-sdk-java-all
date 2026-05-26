package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EbikeChargeStation;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ebike.chargestationdetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-19 10:57:45
 */
public class AlipayCommerceTransportEbikeChargestationdetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1669182255676911354L;

	/** 
	 * 两轮充电桩详情
	 */
	@ApiField("ebike_charge_station_detail")
	private EbikeChargeStation ebikeChargeStationDetail;

	public void setEbikeChargeStationDetail(EbikeChargeStation ebikeChargeStationDetail) {
		this.ebikeChargeStationDetail = ebikeChargeStationDetail;
	}
	public EbikeChargeStation getEbikeChargeStationDetail( ) {
		return this.ebikeChargeStationDetail;
	}

}
