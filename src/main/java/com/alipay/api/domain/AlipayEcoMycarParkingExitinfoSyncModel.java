package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆驶出上送接口
 *
 * @author auto create
 * @since 1.0, 2020-03-16 10:31:19
 */
public class AlipayEcoMycarParkingExitinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4163461283917441177L;

	/**
	 * 车牌号
	 */
	@ApiField("car_number")
	private String carNumber;

	/**
	 * 车辆离场时间，格式"YYYY-MM-DD HH:mm:ss"，24小时制
	 */
	@ApiField("out_time")
	private String outTime;

	/**
	 * 支付宝停车场ID，系统唯一
	 */
	@ApiField("parking_id")
	private String parkingId;

	public String getCarNumber() {
		return this.carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
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

}
