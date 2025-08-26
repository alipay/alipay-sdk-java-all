package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 旅客运输服务信息，旅客运输服务的数电票有本信息
 *
 * @author auto create
 * @since 1.0, 2023-09-14 18:39:30
 */
public class OpenInvoiceTravelInfo extends AlipayObject {

	private static final long serialVersionUID = 1682726911122644171L;

	/**
	 * 有效证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 到达地
	 */
	@ApiField("destination")
	private String destination;

	/**
	 * 出发地
	 */
	@ApiField("origin")
	private String origin;

	/**
	 * 出行日期
	 */
	@ApiField("travel_date")
	private Date travelDate;

	/**
	 * 出行人
	 */
	@ApiField("traveller_name")
	private String travellerName;

	/**
	 * 交通工具等级
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

	public Date getTravelDate() {
		return this.travelDate;
	}
	public void setTravelDate(Date travelDate) {
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
