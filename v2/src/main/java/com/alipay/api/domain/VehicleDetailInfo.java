package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆信息
 *
 * @author auto create
 * @since 1.0, 2025-12-03 11:43:05
 */
public class VehicleDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 7159584658218392642L;

	/**
	 * 车辆编码
	 */
	@ApiField("car_code")
	private String carCode;

	/**
	 * 车型图片
	 */
	@ApiField("car_image")
	private String carImage;

	/**
	 * 车辆标签
	 */
	@ApiField("car_label")
	private String carLabel;

	/**
	 * 车辆等级code
参考 1,经济型 2,舒适型 3,豪华型
	 */
	@ApiField("car_level")
	private String carLevel;

	/**
	 * 车辆型号id
	 */
	@ApiField("car_model_id")
	private String carModelId;

	/**
	 * 车级名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 车辆颜色
	 */
	@ApiField("vehicle_color")
	private String vehicleColor;

	/**
	 * 车牌号
	 */
	@ApiField("vehicle_license")
	private String vehicleLicense;

	/**
	 * 车品牌名称
	 */
	@ApiField("vehicle_make")
	private String vehicleMake;

	public String getCarCode() {
		return this.carCode;
	}
	public void setCarCode(String carCode) {
		this.carCode = carCode;
	}

	public String getCarImage() {
		return this.carImage;
	}
	public void setCarImage(String carImage) {
		this.carImage = carImage;
	}

	public String getCarLabel() {
		return this.carLabel;
	}
	public void setCarLabel(String carLabel) {
		this.carLabel = carLabel;
	}

	public String getCarLevel() {
		return this.carLevel;
	}
	public void setCarLevel(String carLevel) {
		this.carLevel = carLevel;
	}

	public String getCarModelId() {
		return this.carModelId;
	}
	public void setCarModelId(String carModelId) {
		this.carModelId = carModelId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getVehicleColor() {
		return this.vehicleColor;
	}
	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}

	public String getVehicleLicense() {
		return this.vehicleLicense;
	}
	public void setVehicleLicense(String vehicleLicense) {
		this.vehicleLicense = vehicleLicense;
	}

	public String getVehicleMake() {
		return this.vehicleMake;
	}
	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	}

}
