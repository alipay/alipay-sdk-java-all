package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CarinfosQuery;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etcenterprise.registercar.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-19 14:03:08
 */
public class AlipayCommerceTransportEtcenterpriseRegistercarQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4699617416271445234L;

	/** 
	 * 备案车辆列表
	 */
	@ApiField("car_infos")
	private CarinfosQuery carInfos;

	public void setCarInfos(CarinfosQuery carInfos) {
		this.carInfos = carInfos;
	}
	public CarinfosQuery getCarInfos( ) {
		return this.carInfos;
	}

}
