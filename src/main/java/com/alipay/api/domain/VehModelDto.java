package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝基础车型DTO
 *
 * @author auto create
 * @since 1.0, 2022-05-12 14:21:28
 */
public class VehModelDto extends AlipayObject {

	private static final long serialVersionUID = 1371159696114281876L;

	/**
	 * 车型ID
	 */
	@ApiField("acid")
	private String acid;

	/**
	 * 车身形式
	 */
	@ApiField("body_type")
	private String bodyType;

	/**
	 * 品牌ID
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 品牌LOGO
	 */
	@ApiField("brand_logo_url")
	private String brandLogoUrl;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 厢型
	 */
	@ApiField("car_type")
	private String carType;

	/**
	 * 气缸排列形式
	 */
	@ApiField("cylinder_arrangement")
	private String cylinderArrangement;

	/**
	 * 气缸数
	 */
	@ApiField("cylinders_num")
	private Long cylindersNum;

	/**
	 * 排量
	 */
	@ApiField("displacement")
	private String displacement;

	/**
	 * 车门数
	 */
	@ApiField("doors_num")
	private Long doorsNum;

	/**
	 * 驱动形式
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
	 * 燃油类型
	 */
	@ApiField("fuel_type")
	private String fuelType;

	/**
	 * 最大马力
	 */
	@ApiField("horsepower")
	private String horsepower;

	/**
	 * 进气形式
	 */
	@ApiField("intake")
	private String intake;

	/**
	 * 厂商ID
	 */
	@ApiField("manufacturer_id")
	private String manufacturerId;

	/**
	 * 厂商名称
	 */
	@ApiField("manufacturer_name")
	private String manufacturerName;

	/**
	 * 最大功率
	 */
	@ApiField("power_kw")
	private String powerKw;

	/**
	 * 最大功率转速（rpm）
	 */
	@ApiField("power_rpm")
	private String powerRpm;

	/**
	 * 厂商指导价（单位：万元）
	 */
	@ApiField("price")
	private String price;

	/**
	 * 销售名称
	 */
	@ApiField("sale_name")
	private String saleName;

	/**
	 * 销售年款
	 */
	@ApiField("sale_years")
	private String saleYears;

	/**
	 * 座位数
	 */
	@ApiField("seat_num")
	private Long seatNum;

	/**
	 * 车系ID
	 */
	@ApiField("series_id")
	private String seriesId;

	/**
	 * 车系图片链接
	 */
	@ApiField("series_image_url")
	private String seriesImageUrl;

	/**
	 * 车系名称
	 */
	@ApiField("series_name")
	private String seriesName;

	/**
	 * 展示名称
	 */
	@ApiField("show_name")
	private String showName;

	/**
	 * 最大扭矩（n·m）
	 */
	@ApiField("torque_nm")
	private String torqueNm;

	/**
	 * 最大扭矩转速（rpm）
	 */
	@ApiField("torque_rpm")
	private String torqueRpm;

	/**
	 * 变速器
	 */
	@ApiField("transmission")
	private String transmission;

	/**
	 * 档位类型
	 */
	@ApiField("transmission_type")
	private String transmissionType;

	/**
	 * 车辆级别
	 */
	@ApiField("vehicle_size")
	private String vehicleSize;

	/**
	 * 车辆类型
	 */
	@ApiField("vehicle_type")
	private String vehicleType;

	public String getAcid() {
		return this.acid;
	}
	public void setAcid(String acid) {
		this.acid = acid;
	}

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

	public String getBrandLogoUrl() {
		return this.brandLogoUrl;
	}
	public void setBrandLogoUrl(String brandLogoUrl) {
		this.brandLogoUrl = brandLogoUrl;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCarType() {
		return this.carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getCylinderArrangement() {
		return this.cylinderArrangement;
	}
	public void setCylinderArrangement(String cylinderArrangement) {
		this.cylinderArrangement = cylinderArrangement;
	}

	public Long getCylindersNum() {
		return this.cylindersNum;
	}
	public void setCylindersNum(Long cylindersNum) {
		this.cylindersNum = cylindersNum;
	}

	public String getDisplacement() {
		return this.displacement;
	}
	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}

	public Long getDoorsNum() {
		return this.doorsNum;
	}
	public void setDoorsNum(Long doorsNum) {
		this.doorsNum = doorsNum;
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

	public String getManufacturerId() {
		return this.manufacturerId;
	}
	public void setManufacturerId(String manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public String getManufacturerName() {
		return this.manufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
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

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getSaleName() {
		return this.saleName;
	}
	public void setSaleName(String saleName) {
		this.saleName = saleName;
	}

	public String getSaleYears() {
		return this.saleYears;
	}
	public void setSaleYears(String saleYears) {
		this.saleYears = saleYears;
	}

	public Long getSeatNum() {
		return this.seatNum;
	}
	public void setSeatNum(Long seatNum) {
		this.seatNum = seatNum;
	}

	public String getSeriesId() {
		return this.seriesId;
	}
	public void setSeriesId(String seriesId) {
		this.seriesId = seriesId;
	}

	public String getSeriesImageUrl() {
		return this.seriesImageUrl;
	}
	public void setSeriesImageUrl(String seriesImageUrl) {
		this.seriesImageUrl = seriesImageUrl;
	}

	public String getSeriesName() {
		return this.seriesName;
	}
	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public String getShowName() {
		return this.showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
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
