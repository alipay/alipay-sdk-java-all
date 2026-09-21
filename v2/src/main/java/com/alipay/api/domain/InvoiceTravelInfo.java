package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 旅客运输行程列表
 *
 * @author auto create
 * @since 1.0, 2026-09-18 19:14:02
 */
public class InvoiceTravelInfo extends AlipayObject {

	private static final long serialVersionUID = 7677751495914142476L;

	/**
	 * 脱敏的有效证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，如 RESIDENT_IDENTITY_CARD
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 到达地/下车站名称
	 */
	@ApiField("destination")
	private String destination;

	/**
	 * 出发地/上车站名称
	 */
	@ApiField("origin")
	private String origin;

	/**
	 * 出行日期，格式 yyyy-MM-dd
	 */
	@ApiField("travel_date")
	private String travelDate;

	/**
	 * 出行人姓名
	 */
	@ApiField("traveller_name")
	private String travellerName;

	/**
	 * 交通工具等级，需与交通工具类型符合通用旅客运输规则
	 */
	@ApiField("vehicle_level")
	private String vehicleLevel;

	/**
	 * 交通工具类型
	 */
	@ApiField("vehicle_type")
	private String vehicleType;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getDestination() {
		return this.destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getOrigin() {
		return this.origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getTravelDate() {
		return this.travelDate;
	}
	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}

	public String getTravellerName() {
		return this.travellerName;
	}
	public void setTravellerName(String travellerName) {
		this.travellerName = travellerName;
	}

	public String getVehicleLevel() {
		return this.vehicleLevel;
	}
	public void setVehicleLevel(String vehicleLevel) {
		this.vehicleLevel = vehicleLevel;
	}

	public String getVehicleType() {
		return this.vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

}
