package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 展会活动修改
 *
 * @author auto create
 * @since 1.0, 2025-11-10 10:20:30
 */
public class AlipayOfflineProviderExpoActivityModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2767181935346374272L;

	/**
	 * 活动code,创建活动会返回
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 活动地址
	 */
	@ApiField("address_detail")
	private String addressDetail;

	/**
	 * 市
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 结束shi jian
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 外部图片路径
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 省
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private String startTime;

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

}
