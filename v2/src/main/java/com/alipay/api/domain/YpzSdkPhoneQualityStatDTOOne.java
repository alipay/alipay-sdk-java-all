package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-22 15:27:56
 */
public class YpzSdkPhoneQualityStatDTOOne extends AlipayObject {

	private static final long serialVersionUID = 3511296216386592817L;

	/**
	 * 事件名称
	 */
	@ApiField("event_name")
	private String eventName;

	/**
	 * 事件发生时间
	 */
	@ApiField("event_occur_time")
	private String eventOccurTime;

	/**
	 * 事件类型
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 医疗机构名称
	 */
	@ApiField("medical_institution_name")
	private String medicalInstitutionName;

	/**
	 * 合格的数据量占比
	 */
	@ApiField("pass_rate")
	private String passRate;

	/**
	 * 手机号有问题的数据量统计
	 */
	@ApiField("problem_count")
	private String problemCount;

	/**
	 * 手机号有问题的数据量占比
	 */
	@ApiField("problem_rate")
	private String problemRate;

	/**
	 * 报告出具事件的数据量统计
	 */
	@ApiField("total_count")
	private String totalCount;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("uscc")
	private String uscc;

	public String getEventName() {
		return this.eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventOccurTime() {
		return this.eventOccurTime;
	}
	public void setEventOccurTime(String eventOccurTime) {
		this.eventOccurTime = eventOccurTime;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getMedicalInstitutionName() {
		return this.medicalInstitutionName;
	}
	public void setMedicalInstitutionName(String medicalInstitutionName) {
		this.medicalInstitutionName = medicalInstitutionName;
	}

	public String getPassRate() {
		return this.passRate;
	}
	public void setPassRate(String passRate) {
		this.passRate = passRate;
	}

	public String getProblemCount() {
		return this.problemCount;
	}
	public void setProblemCount(String problemCount) {
		this.problemCount = problemCount;
	}

	public String getProblemRate() {
		return this.problemRate;
	}
	public void setProblemRate(String problemRate) {
		this.problemRate = problemRate;
	}

	public String getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getUscc() {
		return this.uscc;
	}
	public void setUscc(String uscc) {
		this.uscc = uscc;
	}

}
