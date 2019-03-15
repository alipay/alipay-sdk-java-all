package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车牌代扣状态查询API
 *
 * @author auto create
 * @since 1.0, 2017-08-25 17:10:19
 */
public class AlipayEcoMycarParkingAgreementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7293728113397139313L;

	/**
	 * 车牌，用户车辆进场时ISV设备识别到的车辆牌照
	 */
	@ApiField("car_number")
	private String carNumber;

	public String getCarNumber() {
		return this.carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

}
