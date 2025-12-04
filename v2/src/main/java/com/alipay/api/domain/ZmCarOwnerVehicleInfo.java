package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻车主名片车辆信息
 *
 * @author auto create
 * @since 1.0, 2025-10-22 10:04:32
 */
public class ZmCarOwnerVehicleInfo extends AlipayObject {

	private static final long serialVersionUID = 6621666675369259913L;

	/**
	 * 车牌号
	 */
	@ApiField("license_plate_number")
	private String licensePlateNumber;

	/**
	 * 车辆所有人姓名
	 */
	@ApiField("vehicle_belong_owner")
	private String vehicleBelongOwner;

	/**
	 * 车辆品牌
	 */
	@ApiField("vehicle_brand")
	private String vehicleBrand;

	/**
	 * 发动机号码
	 */
	@ApiField("vehicle_engine_no")
	private String vehicleEngineNo;

	/**
	 * 车辆注册日期
	 */
	@ApiField("vehicle_register_date")
	private String vehicleRegisterDate;

	/**
	 * 车辆类型
	 */
	@ApiField("vehicle_type")
	private String vehicleType;

	/**
	 * 车辆使用性质
	 */
	@ApiField("vehicle_usage")
	private String vehicleUsage;

	/**
	 * 车架号，即vin码
	 */
	@ApiField("vehicle_vin")
	private String vehicleVin;

	/**
	 * 验证等级，目前只有官方验证
	 */
	@ApiField("verification_level")
	private String verificationLevel;

	public String getLicensePlateNumber() {
		return this.licensePlateNumber;
	}
	public void setLicensePlateNumber(String licensePlateNumber) {
		this.licensePlateNumber = licensePlateNumber;
	}

	public String getVehicleBelongOwner() {
		return this.vehicleBelongOwner;
	}
	public void setVehicleBelongOwner(String vehicleBelongOwner) {
		this.vehicleBelongOwner = vehicleBelongOwner;
	}

	public String getVehicleBrand() {
		return this.vehicleBrand;
	}
	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}

	public String getVehicleEngineNo() {
		return this.vehicleEngineNo;
	}
	public void setVehicleEngineNo(String vehicleEngineNo) {
		this.vehicleEngineNo = vehicleEngineNo;
	}

	public String getVehicleRegisterDate() {
		return this.vehicleRegisterDate;
	}
	public void setVehicleRegisterDate(String vehicleRegisterDate) {
		this.vehicleRegisterDate = vehicleRegisterDate;
	}

	public String getVehicleType() {
		return this.vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleUsage() {
		return this.vehicleUsage;
	}
	public void setVehicleUsage(String vehicleUsage) {
		this.vehicleUsage = vehicleUsage;
	}

	public String getVehicleVin() {
		return this.vehicleVin;
	}
	public void setVehicleVin(String vehicleVin) {
		this.vehicleVin = vehicleVin;
	}

	public String getVerificationLevel() {
		return this.verificationLevel;
	}
	public void setVerificationLevel(String verificationLevel) {
		this.verificationLevel = verificationLevel;
	}

}
