package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OilStationDetails;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.oilproduct.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:40:38
 */
public class AlipayCommerceTransportOilproductInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3434432433913848382L;

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
