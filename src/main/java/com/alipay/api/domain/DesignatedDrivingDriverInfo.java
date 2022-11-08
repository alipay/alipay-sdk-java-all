package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 附近空闲司机对象模型
 *
 * @author auto create
 * @since 1.0, 2022-08-23 16:31:48
 */
public class DesignatedDrivingDriverInfo extends AlipayObject {

	private static final long serialVersionUID = 5547216427377983826L;

	/**
	 * 司机联系方式，可能是渠道处理后的电话
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 司机距离当前用户的距离，即司机的经纬度距离用户经纬度的距离
	 */
	@ApiField("distance")
	private Long distance;

	/**
	 * 代驾司机在渠道方的ID，字符串类型
	 */
	@ApiField("driver_id")
	private String driverId;

	/**
	 * 代驾司机名称
	 */
	@ApiField("driver_name")
	private String driverName;

	/**
	 * 司机服务年限
	 */
	@ApiField("driving_years")
	private Long drivingYears;

	/**
	 * 司机头像，司机在渠道方的头像，公网可访问的地址
	 */
	@ApiField("head_img")
	private String headImg;

	/**
	 * 代驾渠道在能力中心的唯一code
	 */
	@ApiField("isv")
	private String isv;

	/**
	 * 司机经纬度信息
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 司机经纬度信息
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 司机代驾服务次数
	 */
	@ApiField("service_times")
	private Long serviceTimes;

	/**
	 * 司机在渠道内的服务级别，服务星级
	 */
	@ApiField("star_level")
	private String starLevel;

	public String getContactPhone() {
		return this.contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public Long getDistance() {
		return this.distance;
	}
	public void setDistance(Long distance) {
		this.distance = distance;
	}

	public String getDriverId() {
		return this.driverId;
	}
	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	public String getDriverName() {
		return this.driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public Long getDrivingYears() {
		return this.drivingYears;
	}
	public void setDrivingYears(Long drivingYears) {
		this.drivingYears = drivingYears;
	}

	public String getHeadImg() {
		return this.headImg;
	}
	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public String getIsv() {
		return this.isv;
	}
	public void setIsv(String isv) {
		this.isv = isv;
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

	public Long getServiceTimes() {
		return this.serviceTimes;
	}
	public void setServiceTimes(Long serviceTimes) {
		this.serviceTimes = serviceTimes;
	}

	public String getStarLevel() {
		return this.starLevel;
	}
	public void setStarLevel(String starLevel) {
		this.starLevel = starLevel;
	}

}
