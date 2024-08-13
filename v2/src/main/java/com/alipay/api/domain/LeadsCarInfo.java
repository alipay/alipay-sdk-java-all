package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线索车信息
 *
 * @author auto create
 * @since 1.0, 2024-07-26 18:07:21
 */
public class LeadsCarInfo extends AlipayObject {

	private static final long serialVersionUID = 6729433413866613834L;

	/**
	 * 车id
	 */
	@ApiField("car_id")
	private String carId;

	/**
	 * 数据文本
	 */
	@ApiField("car_name")
	private String carName;

	/**
	 * 车类型
	 */
	@ApiField("car_type")
	private String carType;

	public String getCarId() {
		return this.carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return this.carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarType() {
		return this.carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}

}
