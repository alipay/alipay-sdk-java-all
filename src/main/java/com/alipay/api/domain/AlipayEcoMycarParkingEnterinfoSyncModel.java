package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆驶入上送接口
 *
 * @author auto create
 * @since 1.0, 2019-08-29 11:19:16
 */
public class AlipayEcoMycarParkingEnterinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1351691454397653819L;

	/**
	 * 车牌号
	 */
	@ApiField("car_number")
	private String carNumber;

	/**
	 * 车辆入场的时间，格式"YYYY-MM-DD HH:mm:ss"，24小时制，请保证服务器时间准确，入场时间不应晚于当前网络时间
	 */
	@ApiField("in_time")
	private String inTime;

	/**
	 * 支付宝停车场ID ，系统唯一
	 */
	@ApiField("parking_id")
	private String parkingId;

	public String getCarNumber() {
		return this.carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getInTime() {
		return this.inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	public String getParkingId() {
		return this.parkingId;
	}
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}

}
