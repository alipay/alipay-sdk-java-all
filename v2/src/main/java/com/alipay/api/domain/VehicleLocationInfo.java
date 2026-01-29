package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆信息
 *
 * @author auto create
 * @since 1.0, 2025-12-26 21:42:41
 */
public class VehicleLocationInfo extends AlipayObject {

	private static final long serialVersionUID = 1179196376748467431L;

	/**
	 * 车身编号,用于车型库匹配获取更多信息
	 */
	@ApiField("car_code")
	private String carCode;

	/**
	 * 运营商运力类型
	 */
	@ApiField("car_level")
	private String carLevel;

	/**
	 * 车辆当前所在纬度
	 */
	@ApiField("lat")
	private String lat;

	/**
	 * 车辆当前所在经度
	 */
	@ApiField("lon")
	private String lon;

	/**
	 * 车牌号
	 */
	@ApiField("vehicle_license")
	private String vehicleLicense;

	/**
	 * 车型id
	 */
	@ApiField("vehicle_model_id")
	private String vehicleModelId;

	public String getCarCode() {
		return this.carCode;
	}
	public void setCarCode(String carCode) {
		this.carCode = carCode;
	}

	public String getCarLevel() {
		return this.carLevel;
	}
	public void setCarLevel(String carLevel) {
		this.carLevel = carLevel;
	}

	public String getLat() {
		return this.lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return this.lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getVehicleLicense() {
		return this.vehicleLicense;
	}
	public void setVehicleLicense(String vehicleLicense) {
		this.vehicleLicense = vehicleLicense;
	}

	public String getVehicleModelId() {
		return this.vehicleModelId;
	}
	public void setVehicleModelId(String vehicleModelId) {
		this.vehicleModelId = vehicleModelId;
	}

}
