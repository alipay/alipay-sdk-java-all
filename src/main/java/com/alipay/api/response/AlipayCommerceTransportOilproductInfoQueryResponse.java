package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OilStationDetails;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.oilproduct.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-25 16:22:41
 */
public class AlipayCommerceTransportOilproductInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4662192736613447296L;

	/** 
	 * 油站列表
	 */
	@ApiField("oil_station_models")
	private OilStationDetails oilStationModels;

	public void setOilStationModels(OilStationDetails oilStationModels) {
		this.oilStationModels = oilStationModels;
	}
	public OilStationDetails getOilStationModels( ) {
		return this.oilStationModels;
	}

}
