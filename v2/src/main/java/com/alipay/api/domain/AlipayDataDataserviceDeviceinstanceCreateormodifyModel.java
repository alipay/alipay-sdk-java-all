package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线下屏幕绑定激活
 *
 * @author auto create
 * @since 1.0, 2022-11-11 10:56:28
 */
public class AlipayDataDataserviceDeviceinstanceCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 1611318178217414683L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 楼宇名称
	 */
	@ApiField("building_name")
	private String buildingName;

	/**
	 * 市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 扩展字段
	 */
	@ApiField("device_instance_ext_info")
	private String deviceInstanceExtInfo;

	/**
	 * 设备唯一编号
	 */
	@ApiField("device_instance_id")
	private String deviceInstanceId;

	/**
	 * 屏幕摆放位置名称
	 */
	@ApiField("device_instance_pos_name")
	private String deviceInstancePosName;

	/**
	 * 区或者县级市
	 */
	@ApiField("district")
	private String district;

	/**
	 * 屏幕分辨率高
	 */
	@ApiField("height")
	private String height;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 省名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 屏幕尺寸
	 */
	@ApiField("screen_size")
	private String screenSize;

	/**
	 * 屏幕状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 屏幕分辨率宽
	 */
	@ApiField("width")
	private String width;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public String getBuildingName() {
		return this.buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getDeviceInstanceExtInfo() {
		return this.deviceInstanceExtInfo;
	}
	public void setDeviceInstanceExtInfo(String deviceInstanceExtInfo) {
		this.deviceInstanceExtInfo = deviceInstanceExtInfo;
	}

	public String getDeviceInstanceId() {
		return this.deviceInstanceId;
	}
	public void setDeviceInstanceId(String deviceInstanceId) {
		this.deviceInstanceId = deviceInstanceId;
	}

	public String getDeviceInstancePosName() {
		return this.deviceInstancePosName;
	}
	public void setDeviceInstancePosName(String deviceInstancePosName) {
		this.deviceInstancePosName = deviceInstancePosName;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getHeight() {
		return this.height;
	}
	public void setHeight(String height) {
		this.height = height;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getScreenSize() {
		return this.screenSize;
	}
	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getWidth() {
		return this.width;
	}
	public void setWidth(String width) {
		this.width = width;
	}

}
