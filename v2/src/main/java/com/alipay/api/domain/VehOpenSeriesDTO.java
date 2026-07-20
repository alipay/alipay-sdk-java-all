package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-06 16:22:55
 */
public class VehOpenSeriesDTO extends AlipayObject {

	private static final long serialVersionUID = 4227144329795126861L;

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
	 * ["-", "CNG", "增程式", "插电式混合动力", "柴油", "柴油+48V轻混系统", "氢燃料", "汽油", "汽油+24V轻混系统", "汽油+48V轻混系统", "汽油+90V轻混系统", "汽油+CNG", "汽油电驱", "油电混合", "甲醇混动", "纯电动"]
	 */
	@ApiField("fuel_type")
	private String fuelType;

	/**
	 * guide price max, unit: yuan
	 */
	@ApiField("guide_price_max")
	private Long guidePriceMax;

	/**
	 * guide price min, unit: yuan
	 */
	@ApiField("guide_price_min")
	private Long guidePriceMin;

	/**
	 * launch date, format yyyyMMdd
	 */
	@ApiField("launch_date")
	private String launchDate;

	/**
	 * manufacturer name
	 */
	@ApiField("manufacturer")
	private String manufacturer;

	/**
	 * 厂商类型
	 */
	@ApiField("manufacturer_type")
	private String manufacturerType;

	/**
	 * sale status: ONLINE/OFFLINE/PHASE_OUT/PRESALE/PRODUCING/UNLISTED
	 */
	@ApiField("sale_status")
	private String saleStatus;

	/**
	 * seat number
	 */
	@ApiField("seat_num")
	private String seatNum;

	/**
	 * 车系id
	 */
	@ApiField("series_id")
	private String seriesId;

	/**
	 * series image url
	 */
	@ApiField("series_img")
	private String seriesImg;

	/**
	 * series name
	 */
	@ApiField("series_name")
	private String seriesName;

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
	 * ["-", "MPV", "SUV", "SUV跨界车", "三厢跨界车", "三厢车", "两厢跨界车", "两厢车", "客车", "掀背车", "旅行跨界车", "旅行车", "皮卡", "硬顶敞篷车", "硬顶跑车", "货车", "软顶敞篷车"]
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

	public String getFuelType() {
		return this.fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public Long getGuidePriceMax() {
		return this.guidePriceMax;
	}
	public void setGuidePriceMax(Long guidePriceMax) {
		this.guidePriceMax = guidePriceMax;
	}

	public Long getGuidePriceMin() {
		return this.guidePriceMin;
	}
	public void setGuidePriceMin(Long guidePriceMin) {
		this.guidePriceMin = guidePriceMin;
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

	public String getManufacturerType() {
		return this.manufacturerType;
	}
	public void setManufacturerType(String manufacturerType) {
		this.manufacturerType = manufacturerType;
	}

	public String getSaleStatus() {
		return this.saleStatus;
	}
	public void setSaleStatus(String saleStatus) {
		this.saleStatus = saleStatus;
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

	public String getSeriesImg() {
		return this.seriesImg;
	}
	public void setSeriesImg(String seriesImg) {
		this.seriesImg = seriesImg;
	}

	public String getSeriesName() {
		return this.seriesName;
	}
	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
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
