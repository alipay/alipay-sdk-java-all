package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Robotaxi记录信息
 *
 * @author auto create
 * @since 1.0, 2026-01-28 17:58:39
 */
public class RoboRecord extends AlipayObject {

	private static final long serialVersionUID = 3382959823899557956L;

	/**
	 * 行程结束时间
2025-11-05 18:30
	 */
	@ApiField("arrive_dest_time")
	private String arriveDestTime;

	/**
	 * 行程开始时间格式 2025-11-05 18:00
	 */
	@ApiField("begin_charge_time")
	private String beginChargeTime;

	/**
	 * 车辆到达时间
	 */
	@ApiField("driver_reach_time")
	private String driverReachTime;

	/**
	 * 车辆出发时间
	 */
	@ApiField("driver_server_time")
	private String driverServerTime;

	public String getArriveDestTime() {
		return this.arriveDestTime;
	}
	public void setArriveDestTime(String arriveDestTime) {
		this.arriveDestTime = arriveDestTime;
	}

	public String getBeginChargeTime() {
		return this.beginChargeTime;
	}
	public void setBeginChargeTime(String beginChargeTime) {
		this.beginChargeTime = beginChargeTime;
	}

	public String getDriverReachTime() {
		return this.driverReachTime;
	}
	public void setDriverReachTime(String driverReachTime) {
		this.driverReachTime = driverReachTime;
	}

	public String getDriverServerTime() {
		return this.driverServerTime;
	}
	public void setDriverServerTime(String driverServerTime) {
		this.driverServerTime = driverServerTime;
	}

}
