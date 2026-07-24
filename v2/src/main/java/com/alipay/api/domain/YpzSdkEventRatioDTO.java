package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-06-23 11:40:53
 */
public class YpzSdkEventRatioDTO extends AlipayObject {

	private static final long serialVersionUID = 2872492928634461434L;

	/**
	 * 事件代码
	 */
	@ApiField("event_code")
	private String eventCode;

	/**
	 * 事件唯一Id去重后事件量
	 */
	@ApiField("event_id_event_count")
	private String eventIdEventCount;

	/**
	 * 事件唯一Id去重后事件占比
	 */
	@ApiField("event_id_event_rate")
	private String eventIdEventRate;

	/**
	 * 事件唯一Id去重后事件占比结果
	 */
	@ApiField("event_id_event_rate_result")
	private String eventIdEventRateResult;

	/**
	 * 事件名称
	 */
	@ApiField("event_name")
	private String eventName;

	/**
	 * 事件发生日期
	 */
	@ApiField("event_occur_date")
	private String eventOccurDate;

	/**
	 * 医疗机构名称
	 */
	@ApiField("medical_institution_name")
	private String medicalInstitutionName;

	/**
	 * 挂号数据量，已经按流水号去重统计
	 */
	@ApiField("registration_count")
	private String registrationCount;

	/**
	 * 事件数量，已经按流水号去重统计
	 */
	@ApiField("serial_no_event_count")
	private String serialNoEventCount;

	/**
	 * 流水号去重后占挂号数据量的比重
	 */
	@ApiField("serial_no_event_rate")
	private String serialNoEventRate;

	/**
	 * 事件占比结果
	 */
	@ApiField("serial_no_event_rate_result")
	private String serialNoEventRateResult;

	/**
	 * 机构统一社会信用代码
	 */
	@ApiField("uscc")
	private String uscc;

	public String getEventCode() {
		return this.eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getEventIdEventCount() {
		return this.eventIdEventCount;
	}
	public void setEventIdEventCount(String eventIdEventCount) {
		this.eventIdEventCount = eventIdEventCount;
	}

	public String getEventIdEventRate() {
		return this.eventIdEventRate;
	}
	public void setEventIdEventRate(String eventIdEventRate) {
		this.eventIdEventRate = eventIdEventRate;
	}

	public String getEventIdEventRateResult() {
		return this.eventIdEventRateResult;
	}
	public void setEventIdEventRateResult(String eventIdEventRateResult) {
		this.eventIdEventRateResult = eventIdEventRateResult;
	}

	public String getEventName() {
		return this.eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventOccurDate() {
		return this.eventOccurDate;
	}
	public void setEventOccurDate(String eventOccurDate) {
		this.eventOccurDate = eventOccurDate;
	}

	public String getMedicalInstitutionName() {
		return this.medicalInstitutionName;
	}
	public void setMedicalInstitutionName(String medicalInstitutionName) {
		this.medicalInstitutionName = medicalInstitutionName;
	}

	public String getRegistrationCount() {
		return this.registrationCount;
	}
	public void setRegistrationCount(String registrationCount) {
		this.registrationCount = registrationCount;
	}

	public String getSerialNoEventCount() {
		return this.serialNoEventCount;
	}
	public void setSerialNoEventCount(String serialNoEventCount) {
		this.serialNoEventCount = serialNoEventCount;
	}

	public String getSerialNoEventRate() {
		return this.serialNoEventRate;
	}
	public void setSerialNoEventRate(String serialNoEventRate) {
		this.serialNoEventRate = serialNoEventRate;
	}

	public String getSerialNoEventRateResult() {
		return this.serialNoEventRateResult;
	}
	public void setSerialNoEventRateResult(String serialNoEventRateResult) {
		this.serialNoEventRateResult = serialNoEventRateResult;
	}

	public String getUscc() {
		return this.uscc;
	}
	public void setUscc(String uscc) {
		this.uscc = uscc;
	}

}
