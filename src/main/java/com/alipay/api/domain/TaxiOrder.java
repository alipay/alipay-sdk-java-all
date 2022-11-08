package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出租车订单
 *
 * @author auto create
 * @since 1.0, 2022-02-17 11:12:43
 */
public class TaxiOrder extends AlipayObject {

	private static final long serialVersionUID = 6275875888261571161L;

	/**
	 * 出租车外部订单号
	 */
	@ApiField("business_order_no")
	private String businessOrderNo;

	/**
	 * 车牌号
	 */
	@ApiField("car_no")
	private String carNo;

	/**
	 * 司机姓名
	 */
	@ApiField("driver_name")
	private String driverName;

	/**
	 * 司机userId
	 */
	@ApiField("driver_user_id")
	private String driverUserId;

	/**
	 * 行程结束时间，如果未关联到行程，使用支付时间
	 */
	@ApiField("end_trip_time")
	private String endTripTime;

	/**
	 * 行程开始时间
	 */
	@ApiField("start_trip_time")
	private String startTripTime;

	/**
	 * 司机手机号
	 */
	@ApiField("tele_no")
	private String teleNo;

	public String getBusinessOrderNo() {
		return this.businessOrderNo;
	}
	public void setBusinessOrderNo(String businessOrderNo) {
		this.businessOrderNo = businessOrderNo;
	}

	public String getCarNo() {
		return this.carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getDriverName() {
		return this.driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverUserId() {
		return this.driverUserId;
	}
	public void setDriverUserId(String driverUserId) {
		this.driverUserId = driverUserId;
	}

	public String getEndTripTime() {
		return this.endTripTime;
	}
	public void setEndTripTime(String endTripTime) {
		this.endTripTime = endTripTime;
	}

	public String getStartTripTime() {
		return this.startTripTime;
	}
	public void setStartTripTime(String startTripTime) {
		this.startTripTime = startTripTime;
	}

	public String getTeleNo() {
		return this.teleNo;
	}
	public void setTeleNo(String teleNo) {
		this.teleNo = teleNo;
	}

}
