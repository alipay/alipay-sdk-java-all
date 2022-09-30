package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.car.save response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-16 17:41:02
 */
public class AlipayInsAutoCarSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 1784652582424721281L;

	/** 
	 * 车牌号
	 */
	@ApiField("car_no")
	private String carNo;

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public String getCarNo( ) {
		return this.carNo;
	}

}
