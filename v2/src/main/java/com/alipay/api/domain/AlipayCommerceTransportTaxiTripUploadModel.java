package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出租车行程信息上报
 *
 * @author auto create
 * @since 1.0, 2026-07-08 15:17:55
 */
public class AlipayCommerceTransportTaxiTripUploadModel extends AlipayObject {

	private static final long serialVersionUID = 7235876582159341796L;

	/**
	 * 车牌号
	 */
	@ApiField("car_no")
	private String carNo;

	/**
	 * 身份证号
	 */
	@ApiField("driver_cert_no")
	private String driverCertNo;

	/**
	 * 司机姓名
	 */
	@ApiField("driver_name")
	private String driverName;

	/**
	 * 当班司机签到时间，hasStandbyDriver=true时建议传入
	 */
	@ApiField("driver_sign_in_time")
	private Date driverSignInTime;

	/**
	 * 行程以外发生金额，单位-元，支持小数点后两位
	 */
	@ApiField("extra_amount")
	private String extraAmount;

	/**
	 * 是否有备班司机，只要本车不止一名司机则为true
	 */
	@ApiField("has_standby_driver")
	private Boolean hasStandbyDriver;

	/**
	 * 低速等候时长 单位-秒
	 */
	@ApiField("low_speed_wait_time")
	private Long lowSpeedWaitTime;

	/**
	 * 机具编号
	 */
	@ApiField("machine_sn")
	private String machineSn;

	/**
	 * 订单总金额，单位-元，支持小数点后两位
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 备注
	 */
	@ApiField("reserve")
	private String reserve;

	/**
	 * 行程发生计费金额，单位-元，支持小数点后两位
	 */
	@ApiField("trip_amount")
	private String tripAmount;

	/**
	 * 行程总时长 单位-秒
	 */
	@ApiField("trip_cost_time")
	private Long tripCostTime;

	/**
	 * 行程结束的位置,逗号分隔，经纬度
	 */
	@ApiField("trip_end_location")
	private String tripEndLocation;

	/**
	 * 本次行程结束时间
	 */
	@ApiField("trip_end_time")
	private Date tripEndTime;

	/**
	 * 行程唯一Id 由服务商保证单渠道唯一性
	 */
	@ApiField("trip_id")
	private String tripId;

	/**
	 * 行程举例 单位-米
	 */
	@ApiField("trip_mileage")
	private String tripMileage;

	/**
	 * 行程开始的位置,逗号分隔，经纬度
	 */
	@ApiField("trip_start_location")
	private String tripStartLocation;

	/**
	 * 本次行程开始时间
	 */
	@ApiField("trip_start_time")
	private Date tripStartTime;

	/**
	 * 行程结束
	 */
	@ApiField("trip_type")
	private String tripType;

	public String getCarNo() {
		return this.carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getDriverCertNo() {
		return this.driverCertNo;
	}
	public void setDriverCertNo(String driverCertNo) {
		this.driverCertNo = driverCertNo;
	}

	public String getDriverName() {
		return this.driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public Date getDriverSignInTime() {
		return this.driverSignInTime;
	}
	public void setDriverSignInTime(Date driverSignInTime) {
		this.driverSignInTime = driverSignInTime;
	}

	public String getExtraAmount() {
		return this.extraAmount;
	}
	public void setExtraAmount(String extraAmount) {
		this.extraAmount = extraAmount;
	}

	public Boolean getHasStandbyDriver() {
		return this.hasStandbyDriver;
	}
	public void setHasStandbyDriver(Boolean hasStandbyDriver) {
		this.hasStandbyDriver = hasStandbyDriver;
	}

	public Long getLowSpeedWaitTime() {
		return this.lowSpeedWaitTime;
	}
	public void setLowSpeedWaitTime(Long lowSpeedWaitTime) {
		this.lowSpeedWaitTime = lowSpeedWaitTime;
	}

	public String getMachineSn() {
		return this.machineSn;
	}
	public void setMachineSn(String machineSn) {
		this.machineSn = machineSn;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getReserve() {
		return this.reserve;
	}
	public void setReserve(String reserve) {
		this.reserve = reserve;
	}

	public String getTripAmount() {
		return this.tripAmount;
	}
	public void setTripAmount(String tripAmount) {
		this.tripAmount = tripAmount;
	}

	public Long getTripCostTime() {
		return this.tripCostTime;
	}
	public void setTripCostTime(Long tripCostTime) {
		this.tripCostTime = tripCostTime;
	}

	public String getTripEndLocation() {
		return this.tripEndLocation;
	}
	public void setTripEndLocation(String tripEndLocation) {
		this.tripEndLocation = tripEndLocation;
	}

	public Date getTripEndTime() {
		return this.tripEndTime;
	}
	public void setTripEndTime(Date tripEndTime) {
		this.tripEndTime = tripEndTime;
	}

	public String getTripId() {
		return this.tripId;
	}
	public void setTripId(String tripId) {
		this.tripId = tripId;
	}

	public String getTripMileage() {
		return this.tripMileage;
	}
	public void setTripMileage(String tripMileage) {
		this.tripMileage = tripMileage;
	}

	public String getTripStartLocation() {
		return this.tripStartLocation;
	}
	public void setTripStartLocation(String tripStartLocation) {
		this.tripStartLocation = tripStartLocation;
	}

	public Date getTripStartTime() {
		return this.tripStartTime;
	}
	public void setTripStartTime(Date tripStartTime) {
		this.tripStartTime = tripStartTime;
	}

	public String getTripType() {
		return this.tripType;
	}
	public void setTripType(String tripType) {
		this.tripType = tripType;
	}

}
