package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行驶证信息
 *
 * @author auto create
 * @since 1.0, 2025-09-18 15:56:07
 */
public class DrivingLicenseInfo extends AlipayObject {

	private static final long serialVersionUID = 5788162242534359817L;

	/**
	 * 发动机编号
	 */
	@ApiField("engine_number")
	private String engineNumber;

	/**
	 * 行驶证图片路径
	 */
	@ApiField("file_path")
	private String filePath;

	/**
	 * 发证日期
	 */
	@ApiField("issue_date")
	private String issueDate;

	/**
	 * 车牌号
	 */
	@ApiField("license_plate_number")
	private String licensePlateNumber;

	/**
	 * 注册日期
	 */
	@ApiField("registration_date")
	private String registrationDate;

	/**
	 * 使用性质
	 */
	@ApiField("use_character")
	private String useCharacter;

	/**
	 * 车300品牌Id
	 */
	@ApiField("vehicle_brand_id")
	private String vehicleBrandId;

	/**
	 * 车300品牌名称
	 */
	@ApiField("vehicle_brand_name")
	private String vehicleBrandName;

	/**
	 * 车300型号Id
	 */
	@ApiField("vehicle_model_id")
	private String vehicleModelId;

	/**
	 * 车300型号名称
	 */
	@ApiField("vehicle_model_name")
	private String vehicleModelName;

	/**
	 * 机动车所有人
	 */
	@ApiField("vehicle_owner")
	private String vehicleOwner;

	/**
	 * 车300车系Id
	 */
	@ApiField("vehicle_series_id")
	private String vehicleSeriesId;

	/**
	 * 车300车系名称
	 */
	@ApiField("vehicle_series_name")
	private String vehicleSeriesName;

	/**
	 * 车辆类型
	 */
	@ApiField("vehicle_type")
	private String vehicleType;

	/**
	 * 车辆识别码
	 */
	@ApiField("vin_number")
	private String vinNumber;

	public String getEngineNumber() {
		return this.engineNumber;
	}
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	public String getFilePath() {
		return this.filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getIssueDate() {
		return this.issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getLicensePlateNumber() {
		return this.licensePlateNumber;
	}
	public void setLicensePlateNumber(String licensePlateNumber) {
		this.licensePlateNumber = licensePlateNumber;
	}

	public String getRegistrationDate() {
		return this.registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getUseCharacter() {
		return this.useCharacter;
	}
	public void setUseCharacter(String useCharacter) {
		this.useCharacter = useCharacter;
	}

	public String getVehicleBrandId() {
		return this.vehicleBrandId;
	}
	public void setVehicleBrandId(String vehicleBrandId) {
		this.vehicleBrandId = vehicleBrandId;
	}

	public String getVehicleBrandName() {
		return this.vehicleBrandName;
	}
	public void setVehicleBrandName(String vehicleBrandName) {
		this.vehicleBrandName = vehicleBrandName;
	}

	public String getVehicleModelId() {
		return this.vehicleModelId;
	}
	public void setVehicleModelId(String vehicleModelId) {
		this.vehicleModelId = vehicleModelId;
	}

	public String getVehicleModelName() {
		return this.vehicleModelName;
	}
	public void setVehicleModelName(String vehicleModelName) {
		this.vehicleModelName = vehicleModelName;
	}

	public String getVehicleOwner() {
		return this.vehicleOwner;
	}
	public void setVehicleOwner(String vehicleOwner) {
		this.vehicleOwner = vehicleOwner;
	}

	public String getVehicleSeriesId() {
		return this.vehicleSeriesId;
	}
	public void setVehicleSeriesId(String vehicleSeriesId) {
		this.vehicleSeriesId = vehicleSeriesId;
	}

	public String getVehicleSeriesName() {
		return this.vehicleSeriesName;
	}
	public void setVehicleSeriesName(String vehicleSeriesName) {
		this.vehicleSeriesName = vehicleSeriesName;
	}

	public String getVehicleType() {
		return this.vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVinNumber() {
		return this.vinNumber;
	}
	public void setVinNumber(String vinNumber) {
		this.vinNumber = vinNumber;
	}

}
