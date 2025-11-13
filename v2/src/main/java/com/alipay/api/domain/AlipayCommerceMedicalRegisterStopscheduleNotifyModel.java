package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 号源停诊通知
 *
 * @author auto create
 * @since 1.0, 2025-07-04 14:30:57
 */
public class AlipayCommerceMedicalRegisterStopscheduleNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 5578285591949694236L;

	/**
	 * yyyyMMdd.停诊日期.格式如上
	 */
	@ApiField("date")
	private String date;

	/**
	 * 医院id
	 */
	@ApiField("hospital_id")
	private String hospitalId;

	/**
	 * 服务商code.不可枚举
	 */
	@ApiField("isv_code")
	private String isvCode;

	/**
	 * 停诊取消
	 */
	@ApiField("notify_type")
	private String notifyType;

	/**
	 * 平台 code
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 停诊原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 支持批量.registerIds 逗号分隔
	 */
	@ApiField("register_ids")
	private String registerIds;

	/**
	 * 排班类型 上午
	 */
	@ApiField("type")
	private String type;

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getHospitalId() {
		return this.hospitalId;
	}
	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getIsvCode() {
		return this.isvCode;
	}
	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}

	public String getNotifyType() {
		return this.notifyType;
	}
	public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getRegisterIds() {
		return this.registerIds;
	}
	public void setRegisterIds(String registerIds) {
		this.registerIds = registerIds;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
