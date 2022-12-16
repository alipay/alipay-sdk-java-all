package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 核酸到期提醒订阅状态更新
 *
 * @author auto create
 * @since 1.0, 2022-11-11 17:15:14
 */
public class AlipayEbppIndustryNucleicremindSubscribeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8264483638596718474L;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订阅提醒时间列表,单位小时，必须不小于48
	 */
	@ApiListField("reminder_hour_list")
	@ApiField("number")
	private List<Long> reminderHourList;

	/**
	 * 订阅状态，1 订阅  0 退订 。
	 */
	@ApiField("status")
	private String status;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<Long> getReminderHourList() {
		return this.reminderHourList;
	}
	public void setReminderHourList(List<Long> reminderHourList) {
		this.reminderHourList = reminderHourList;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
