package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车出场入参
 *
 * @author auto create
 * @since 1.0, 2018-06-21 17:51:48
 */
public class ParkingOutScene extends AlipayObject {

	private static final long serialVersionUID = 6257186624755953533L;

	/**
	 * 车牌号
	 */
	@ApiField("car_number")
	private String carNumber;

	/**
	 * 停车费用
	 */
	@ApiField("fee")
	private String fee;

	/**
	 * 出场时间
	 */
	@ApiField("out_time")
	private String outTime;

	/**
	 * 停车场id
	 */
	@ApiField("parking_id")
	private String parkingId;

	/**
	 * 停车场名称
	 */
	@ApiField("parking_name")
	private String parkingName;

	public String getCarNumber() {
		return this.carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getFee() {
		return this.fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}

	public String getOutTime() {
		return this.outTime;
	}
	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	public String getParkingId() {
		return this.parkingId;
	}
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}

	public String getParkingName() {
		return this.parkingName;
	}
	public void setParkingName(String parkingName) {
		this.parkingName = parkingName;
	}

}
