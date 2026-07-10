package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-06 16:17:56
 */
public class VehOpenModelDTO extends AlipayObject {

	private static final long serialVersionUID = 4552888226872912995L;

	/**
	 * 4门5座三厢车
	 */
	@ApiField("body_type")
	private String bodyType;

	/**
	 * 品牌ID
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * ["-", "H", "L", "R", "V", "W"]
	 */
	@ApiField("cylinder_arrangement")
	private String cylinderArrangement;

	/**
	 * 气缸数
	 */
	@ApiField("cylinders")
	private String cylinders;

	/**
	 * displacement, unit: T or L, e.g. 1.5T/2.0T/3.0L
	 */
	@ApiField("displacement")
	private String displacement;

	/**
	 * 车门数
	 */
	@ApiField("doors")
	private String doors;

	/**
	 * 驱动方式
	 */
	@ApiField("drive_mode")
	private String driveMode;

	/**
	 * 排放标准
	 */
	@ApiField("emission_standard")
	private String emissionStandard;

	/**
	 * 供油方式
	 */
	@ApiField("fuel_injection")
	private String fuelInjection;

	/**
	 * 燃料类型
	 */
	@ApiField("fuel_type")
	private String fuelType;

	/**
	 * 官方指导价，单位：元
	 */
	@ApiField("guide_price")
	private String guidePrice;

	/**
	 * 马力（Ps）
	 */
	@ApiField("horsepower")
	private String horsepower;

	/**
	 * 进气形式
	 */
	@ApiField("intake")
	private String intake;

	/**
	 * 上市时间，格式 yyyy-MM-dd
	 */
	@ApiField("launch_date")
	private String launchDate;

	/**
	 * 厂商
	 */
	@ApiField("manufacturer")
	private String manufacturer;

	/**
	 * 车型id
	 */
	@ApiField("model_id")
	private String modelId;

	/**
	 * 车型图片地址
	 */
	@ApiField("model_img")
	private String modelImg;

	/**
	 * 车型名称
	 */
	@ApiField("model_name")
	private String modelName;

	/**
	 * 功率（kW）
	 */
	@ApiField("power_kw")
	private String powerKw;

	/**
	 * 功率对应转速（rpm）
	 */
	@ApiField("power_rpm")
	private String powerRpm;

	/**
	 * 销售状态
	 */
	@ApiField("sale_status")
	private String saleStatus;

	/**
	 * 年款
	 */
	@ApiField("sale_years")
	private String saleYears;

	/**
	 * 座位数
	 */
	@ApiField("seat_num")
	private String seatNum;

	/**
	 * 车系ID
	 */
	@ApiField("series_id")
	private String seriesId;

	/**
	 * 车系名称
	 */
	@ApiField("series_name")
	private String seriesName;

	/**
	 * 扭矩（N·m）
	 */
	@ApiField("torque_nm")
	private String torqueNm;

	/**
	 * 扭矩对应转速（rpm）
	 */
	@ApiField("torque_rpm")
	private String torqueRpm;

	/**
	 * 变速箱
	 */
	@ApiField("transmission")
	private String transmission;

	/**
	 * 变速箱类型
	 */
	@ApiField("transmission_type")
	private String transmissionType;

	/**
	 * 微型车
中大型SUV
紧凑型车
紧凑型SUV
小型车
中型车
跑车
大型车
中型MPV
中型SUV
紧凑型MPV
中大型MPV
小型SUV
中大型车
大型MPV
大型SUV
微面
皮卡
微卡
轻客
轻卡
飞行汽车
紧凑型MPV,MPV
MPV
低端皮卡
高端皮卡
	 */
	@ApiField("vehicle_size")
	private String vehicleSize;

	/**
	 * 车辆类型
	 */
	@ApiField("vehicle_type")
	private String vehicleType;

	public String getBodyType() {
		return this.bodyType;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCylinderArrangement() {
		return this.cylinderArrangement;
	}
	public void setCylinderArrangement(String cylinderArrangement) {
		this.cylinderArrangement = cylinderArrangement;
	}

	public String getCylinders() {
		return this.cylinders;
	}
	public void setCylinders(String cylinders) {
		this.cylinders = cylinders;
	}

	public String getDisplacement() {
		return this.displacement;
	}
	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}

	public String getDoors() {
		return this.doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getDriveMode() {
		return this.driveMode;
	}
	public void setDriveMode(String driveMode) {
		this.driveMode = driveMode;
	}

	public String getEmissionStandard() {
		return this.emissionStandard;
	}
	public void setEmissionStandard(String emissionStandard) {
		this.emissionStandard = emissionStandard;
	}

	public String getFuelInjection() {
		return this.fuelInjection;
	}
	public void setFuelInjection(String fuelInjection) {
		this.fuelInjection = fuelInjection;
	}

	public String getFuelType() {
		return this.fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getGuidePrice() {
		return this.guidePrice;
	}
	public void setGuidePrice(String guidePrice) {
		this.guidePrice = guidePrice;
	}

	public String getHorsepower() {
		return this.horsepower;
	}
	public void setHorsepower(String horsepower) {
		this.horsepower = horsepower;
	}

	public String getIntake() {
		return this.intake;
	}
	public void setIntake(String intake) {
		this.intake = intake;
	}

	public String getLaunchDate() {
		return this.launchDate;
	}
	public void setLaunchDate(String launchDate) {
		this.launchDate = launchDate;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModelId() {
		return this.modelId;
	}
	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	public String getModelImg() {
		return this.modelImg;
	}
	public void setModelImg(String modelImg) {
		this.modelImg = modelImg;
	}

	public String getModelName() {
		return this.modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getPowerKw() {
		return this.powerKw;
	}
	public void setPowerKw(String powerKw) {
		this.powerKw = powerKw;
	}

	public String getPowerRpm() {
		return this.powerRpm;
	}
	public void setPowerRpm(String powerRpm) {
		this.powerRpm = powerRpm;
	}

	public String getSaleStatus() {
		return this.saleStatus;
	}
	public void setSaleStatus(String saleStatus) {
		this.saleStatus = saleStatus;
	}

	public String getSaleYears() {
		return this.saleYears;
	}
	public void setSaleYears(String saleYears) {
		this.saleYears = saleYears;
	}

	public String getSeatNum() {
		return this.seatNum;
	}
	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
	}

	public String getSeriesId() {
		return this.seriesId;
	}
	public void setSeriesId(String seriesId) {
		this.seriesId = seriesId;
	}

	public String getSeriesName() {
		return this.seriesName;
	}
	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public String getTorqueNm() {
		return this.torqueNm;
	}
	public void setTorqueNm(String torqueNm) {
		this.torqueNm = torqueNm;
	}

	public String getTorqueRpm() {
		return this.torqueRpm;
	}
	public void setTorqueRpm(String torqueRpm) {
		this.torqueRpm = torqueRpm;
	}

	public String getTransmission() {
		return this.transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getTransmissionType() {
		return this.transmissionType;
	}
	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}

	public String getVehicleSize() {
		return this.vehicleSize;
	}
	public void setVehicleSize(String vehicleSize) {
		this.vehicleSize = vehicleSize;
	}

	public String getVehicleType() {
		return this.vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

}
