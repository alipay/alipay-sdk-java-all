package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆信息
 *
 * @author auto create
 * @since 1.0, 2025-12-18 17:11:46
 */
public class CarSaleVehicleInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5237791167967615436L;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 车辆年限
	 */
	@ApiField("car_age")
	private Long carAge;

	/**
	 * 行驶里程, 单位：公里
	 */
	@ApiField("drive_distance_km")
	private Long driveDistanceKm;

	/**
	 * 车型名称
	 */
	@ApiField("model_name")
	private String modelName;

	/**
	 * 车系名称
	 */
	@ApiField("series_name")
	private String seriesName;

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Long getCarAge() {
		return this.carAge;
	}
	public void setCarAge(Long carAge) {
		this.carAge = carAge;
	}

	public Long getDriveDistanceKm() {
		return this.driveDistanceKm;
	}
	public void setDriveDistanceKm(Long driveDistanceKm) {
		this.driveDistanceKm = driveDistanceKm;
	}

	public String getModelName() {
		return this.modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getSeriesName() {
		return this.seriesName;
	}
	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

}
