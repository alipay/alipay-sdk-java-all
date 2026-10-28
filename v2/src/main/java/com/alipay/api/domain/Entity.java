package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 额外字段
 *
 * @author auto create
 * @since 1.0, 2026-10-19 20:42:54
 */
public class Entity extends AlipayObject {

	private static final long serialVersionUID = 2791938422227133213L;

	/**
	 * 详情id
	 */
	@ApiField("case_id")
	private String caseId;

	/**
	 * 病例类型
	 */
	@ApiField("case_type")
	private String caseType;

	/**
	 * 科室名称
	 */
	@ApiField("department")
	private String department;

	/**
	 * 疾病名称
	 */
	@ApiField("disease")
	private String disease;

	/**
	 * 事件id
	 */
	@ApiField("event_id")
	private String eventId;

	/**
	 * 地区
	 */
	@ApiField("region")
	private String region;

	public String getCaseId() {
		return this.caseId;
	}
	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public String getCaseType() {
		return this.caseType;
	}
	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}

	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDisease() {
		return this.disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getEventId() {
		return this.eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getRegion() {
		return this.region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

}
