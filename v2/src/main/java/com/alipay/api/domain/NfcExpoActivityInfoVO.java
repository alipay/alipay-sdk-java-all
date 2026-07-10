package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-08 11:12:45
 */
public class NfcExpoActivityInfoVO extends AlipayObject {

	private static final long serialVersionUID = 3189733562562852652L;

	/**
	 * 活动唯一编码
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 详细地址
	 */
	@ApiField("address_detail")
	private String addressDetail;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 活动结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 活动Logo链接
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 省份名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 活动开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 活动状态
	 */
	@ApiField("status")
	private String status;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getAddressDetail() {
		return this.addressDetail;
	}
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
