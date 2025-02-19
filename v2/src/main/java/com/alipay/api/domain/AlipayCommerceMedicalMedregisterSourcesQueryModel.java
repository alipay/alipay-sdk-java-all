package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询号源列表
 *
 * @author auto create
 * @since 1.0, 2024-12-24 14:53:34
 */
public class AlipayCommerceMedicalMedregisterSourcesQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3348826177959221746L;

	/**
	 * 上午
	 */
	@ApiField("am_pm")
	private String amPm;

	/**
	 * 机构下的分院id
	 */
	@ApiField("hospital_id")
	private String hospitalId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 机构id对应的机构名称
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 外部用户id
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 用户id类型
	 */
	@ApiField("out_user_type")
	private String outUserType;

	/**
	 * 排班id
	 */
	@ApiField("schedule_id")
	private String scheduleId;

	/**
	 * 会话id
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 2024年11月15日
	 */
	@ApiField("treat_date")
	private String treatDate;

	public String getAmPm() {
		return this.amPm;
	}
	public void setAmPm(String amPm) {
		this.amPm = amPm;
	}

	public String getHospitalId() {
		return this.hospitalId;
	}
	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getOutUserType() {
		return this.outUserType;
	}
	public void setOutUserType(String outUserType) {
		this.outUserType = outUserType;
	}

	public String getScheduleId() {
		return this.scheduleId;
	}
	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getTreatDate() {
		return this.treatDate;
	}
	public void setTreatDate(String treatDate) {
		this.treatDate = treatDate;
	}

}
