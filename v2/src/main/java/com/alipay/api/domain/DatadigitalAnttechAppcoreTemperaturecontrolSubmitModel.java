package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 温控设置下发接口
 *
 * @author auto create
 * @since 1.0, 2024-07-22 14:24:12
 */
public class DatadigitalAnttechAppcoreTemperaturecontrolSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 7497281474565654458L;

	/**
	 * 企业统一社会信用代码，和热力公司定义保持一致
	 */
	@ApiField("company_uscc")
	private String companyUscc;

	/**
	 * 采暖模式
	 */
	@ApiField("heating_mode")
	private String heatingMode;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 住户id，热力公司自定义的id，数据来源热力公司
	 */
	@ApiField("resident_id")
	private String residentId;

	/**
	 * 室内温度，单位为摄氏度
	 */
	@ApiField("room_temperature")
	private String roomTemperature;

	/**
	 * 设定的温度，单位为摄氏度
	 */
	@ApiField("set_temperature")
	private String setTemperature;

	/**
	 * 设定的时间
	 */
	@ApiField("set_time")
	private String setTime;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCompanyUscc() {
		return this.companyUscc;
	}
	public void setCompanyUscc(String companyUscc) {
		this.companyUscc = companyUscc;
	}

	public String getHeatingMode() {
		return this.heatingMode;
	}
	public void setHeatingMode(String heatingMode) {
		this.heatingMode = heatingMode;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getResidentId() {
		return this.residentId;
	}
	public void setResidentId(String residentId) {
		this.residentId = residentId;
	}

	public String getRoomTemperature() {
		return this.roomTemperature;
	}
	public void setRoomTemperature(String roomTemperature) {
		this.roomTemperature = roomTemperature;
	}

	public String getSetTemperature() {
		return this.setTemperature;
	}
	public void setSetTemperature(String setTemperature) {
		this.setTemperature = setTemperature;
	}

	public String getSetTime() {
		return this.setTime;
	}
	public void setSetTime(String setTime) {
		this.setTime = setTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
