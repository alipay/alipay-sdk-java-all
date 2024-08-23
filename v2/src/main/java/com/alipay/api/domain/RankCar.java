package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * RankCar
 *
 * @author auto create
 * @since 1.0, 2024-05-21 16:29:04
 */
public class RankCar extends AlipayObject {

	private static final long serialVersionUID = 6624364851236758429L;

	/**
	 * 车型id
	 */
	@ApiField("car_id")
	private String carId;

	/**
	 * 车型名称
	 */
	@ApiField("car_name")
	private String carName;

	/**
	 * 数据类型
	 */
	@ApiField("data_name")
	private String dataName;

	/**
	 * 数据值
	 */
	@ApiField("data_value")
	private String dataValue;

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

	public String getDataName() {
		return this.dataName;
	}
	public void setDataName(String dataName) {
		this.dataName = dataName;
	}

	public String getDataValue() {
		return this.dataValue;
	}
	public void setDataValue(String dataValue) {
		this.dataValue = dataValue;
	}

}
