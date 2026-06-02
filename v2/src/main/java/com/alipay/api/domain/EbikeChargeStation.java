package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 两轮充电桩详情
 *
 * @author auto create
 * @since 1.0, 2026-05-29 14:17:49
 */
public class EbikeChargeStation extends AlipayObject {

	private static final long serialVersionUID = 6247662378361144465L;

	/**
	 * 充电桩设备详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 可用空闲插口数
	 */
	@ApiField("available_plug_count")
	private Long availablePlugCount;

	/**
	 * 桩企品牌code
	 */
	@ApiField("brand_code")
	private String brandCode;

	/**
	 * 桩企品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 设备经纬度
	 */
	@ApiField("device_lbs")
	private LocationParam deviceLbs;

	/**
	 * 设备名称
	 */
	@ApiField("device_name")
	private String deviceName;

	/**
	 * 设备编号，设备唯一标识
	 */
	@ApiField("device_no")
	private String deviceNo;

	/**
	 * 设备状态
	 */
	@ApiField("device_status")
	private String deviceStatus;

	/**
	 * 充电桩类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 收费标准文案描述
	 */
	@ApiField("fee_desc")
	private String feeDesc;

	/**
	 * 单路最大输出功率 单位: 瓦
	 */
	@ApiField("maximum_power")
	private String maximumPower;

	/**
	 * 充电桩名称
	 */
	@ApiField("station_name")
	private String stationName;

	/**
	 * 充电桩编号
	 */
	@ApiField("station_no")
	private String stationNo;

	/**
	 * 插口总数
	 */
	@ApiField("total_plug_count")
	private Long totalPlugCount;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public Long getAvailablePlugCount() {
		return this.availablePlugCount;
	}
	public void setAvailablePlugCount(Long availablePlugCount) {
		this.availablePlugCount = availablePlugCount;
	}

	public String getBrandCode() {
		return this.brandCode;
	}
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public LocationParam getDeviceLbs() {
		return this.deviceLbs;
	}
	public void setDeviceLbs(LocationParam deviceLbs) {
		this.deviceLbs = deviceLbs;
	}

	public String getDeviceName() {
		return this.deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceNo() {
		return this.deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}

	public String getDeviceStatus() {
		return this.deviceStatus;
	}
	public void setDeviceStatus(String deviceStatus) {
		this.deviceStatus = deviceStatus;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getFeeDesc() {
		return this.feeDesc;
	}
	public void setFeeDesc(String feeDesc) {
		this.feeDesc = feeDesc;
	}

	public String getMaximumPower() {
		return this.maximumPower;
	}
	public void setMaximumPower(String maximumPower) {
		this.maximumPower = maximumPower;
	}

	public String getStationName() {
		return this.stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getStationNo() {
		return this.stationNo;
	}
	public void setStationNo(String stationNo) {
		this.stationNo = stationNo;
	}

	public Long getTotalPlugCount() {
		return this.totalPlugCount;
	}
	public void setTotalPlugCount(Long totalPlugCount) {
		this.totalPlugCount = totalPlugCount;
	}

}
