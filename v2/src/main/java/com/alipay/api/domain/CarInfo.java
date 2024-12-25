package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆信息
 *
 * @author auto create
 * @since 1.0, 2024-09-23 14:45:54
 */
public class CarInfo extends AlipayObject {

	private static final long serialVersionUID = 5177643157689476786L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 车辆品牌
	 */
	@ApiField("car_brand")
	private String carBrand;

	/**
	 * 车牌号
	 */
	@ApiField("car_license")
	private String carLicense;

	/**
	 * 车辆车系
	 */
	@ApiField("car_series")
	private String carSeries;

	/**
	 * 车辆型号
	 */
	@ApiField("car_type")
	private String carType;

	/**
	 * 车架号（车辆识别代码）
	 */
	@ApiField("car_vin")
	private String carVin;

	/**
	 * 发动机号码
	 */
	@ApiField("engine_no")
	private String engineNo;

	/**
	 * 首次注册日期，格式：yyyy-MM-dd
	 */
	@ApiField("first_register_date")
	private String firstRegisterDate;

	/**
	 * 发证日期，格式：yyyy-MM-dd
	 */
	@ApiField("issue_date")
	private String issueDate;

	/**
	 * 车辆所有人
	 */
	@ApiField("owner")
	private String owner;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCarBrand() {
		return this.carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getCarLicense() {
		return this.carLicense;
	}
	public void setCarLicense(String carLicense) {
		this.carLicense = carLicense;
	}

	public String getCarSeries() {
		return this.carSeries;
	}
	public void setCarSeries(String carSeries) {
		this.carSeries = carSeries;
	}

	public String getCarType() {
		return this.carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getCarVin() {
		return this.carVin;
	}
	public void setCarVin(String carVin) {
		this.carVin = carVin;
	}

	public String getEngineNo() {
		return this.engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getFirstRegisterDate() {
		return this.firstRegisterDate;
	}
	public void setFirstRegisterDate(String firstRegisterDate) {
		this.firstRegisterDate = firstRegisterDate;
	}

	public String getIssueDate() {
		return this.issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

}
