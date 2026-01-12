package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 司机信息
 *
 * @author auto create
 * @since 1.0, 2025-12-25 19:56:54
 */
public class DesignatedDriverInfo extends AlipayObject {

	private static final long serialVersionUID = 7816367228777599287L;

	/**
	 * 某个服务商传参异常，此字段用于兜底。正确的需要使用contact_phone字段
	 */
	@ApiField("concat_phone")
	private String concatPhone;

	/**
	 * 司机电话
明文传输，不允许为固定电话或其他格式的电话
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 当前距离，单位：米
	 */
	@ApiField("distance")
	private Long distance;

	/**
	 * 司机工号
	 */
	@ApiField("driver_id")
	private String driverId;

	/**
	 * 司机名称，非姓名
	 */
	@ApiField("driver_name")
	private String driverName;

	/**
	 * 驾龄
	 */
	@ApiField("driving_years")
	private Long drivingYears;

	/**
	 * 司机照片
司机头像照片地址，公网可访问的地址，图片大小为压缩格式，请尽量减小此文件体积，便于加载。
	 */
	@ApiField("head_img")
	private String headImg;

	/**
	 * 司机纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 司机经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 司机真实姓名
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 服务次数
	 */
	@ApiField("service_times")
	private Long serviceTimes;

	/**
	 * 司机的星级别
5分制，表示师傅在服务商系统内的服务星级。
	 */
	@ApiField("star_lever")
	private String starLever;

	public String getConcatPhone() {
		return this.concatPhone;
	}
	public void setConcatPhone(String concatPhone) {
		this.concatPhone = concatPhone;
	}

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

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Long getServiceTimes() {
		return this.serviceTimes;
	}
	public void setServiceTimes(Long serviceTimes) {
		this.serviceTimes = serviceTimes;
	}

	public String getStarLever() {
		return this.starLever;
	}
	public void setStarLever(String starLever) {
		this.starLever = starLever;
	}

}
