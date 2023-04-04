package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.vehicle.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 06:41:31
 */
public class AlipayEcoMycarParkingVehicleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5227587332499573624L;

	/** 
	 * 车牌信息（utf-8编码）
	 */
	@ApiField("car_number")
	private String carNumber;

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getCarNumber( ) {
		return this.carNumber;
	}

}
