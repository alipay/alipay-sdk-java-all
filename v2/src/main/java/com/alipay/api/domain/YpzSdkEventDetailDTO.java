package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-06-23 11:41:00
 */
public class YpzSdkEventDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 5161415689861796418L;

	/**
	 * 事件编码
	 */
	@ApiField("event_code")
	private String eventCode;

	/**
	 * 事件总量
	 */
	@ApiField("event_count")
	private String eventCount;

	/**
	 * 事件结果描述
	 */
	@ApiField("event_description")
	private String eventDescription;

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
	 * 事件更新日期
	 */
	@ApiField("event_update_date")
	private String eventUpdateDate;

	/**
	 * 大于10min的事件数量
	 */
	@ApiField("greater_than_10m")
	private String greaterThan10m;

	/**
	 * 大于15秒的事件数量
	 */
	@ApiField("greater_than_15s")
	private String greaterThan15s;

	/**
	 * 大于1h的事件数据量
	 */
	@ApiField("greater_than_1h")
	private String greaterThan1h;

	/**
	 * 大于1min的事件数量
	 */
	@ApiField("greater_than_1m")
	private String greaterThan1m;

	/**
	 * 大于 30min 的事件数量
	 */
	@ApiField("greater_than_30m")
	private String greaterThan30m;

	/**
	 * 大于5秒的事件数量
	 */
	@ApiField("greater_than_5s")
	private String greaterThan5s;

	/**
	 * 小于 0s 的事件数量
	 */
	@ApiField("less_than_0s")
	private String lessThan0s;

	/**
	 * 小于负1s的事件数量
	 */
	@ApiField("less_than_negative_1s")
	private String lessThanNegative1s;

	/**
	 * 医疗机构名称
	 */
	@ApiField("medical_institution_name")
	private String medicalInstitutionName;

	/**
	 * 负1s到10s区间内的事件数量
	 */
	@ApiField("range_negative_1_to_10_s")
	private String rangeNegative1To10S;

	/**
	 * 负1s到15s区间内的事件数量
	 */
	@ApiField("range_negative_1_to_15_s")
	private String rangeNegative1To15S;

	/**
	 * [-1s,5s] 区间内的事件数量
	 */
	@ApiField("range_negative_1_to_5_s")
	private String rangeNegative1To5S;

	/**
	 * 负1s到10s区间内的事件占比
	 */
	@ApiField("rate_negative_1_to_10_s")
	private String rateNegative1To10S;

	/**
	 * 负1s到15s区间内的事件占比
	 */
	@ApiField("rate_negative_1_to_15_s")
	private String rateNegative1To15S;

	/**
	 * 负1s到5s区间内事件占比
	 */
	@ApiField("rate_negative_1_to_5_s")
	private String rateNegative1To5S;

	/**
	 * 医疗机构统一社会信用代码
	 */
	@ApiField("uscc")
	private String uscc;

	public String getEventCode() {
		return this.eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getEventCount() {
		return this.eventCount;
	}
	public void setEventCount(String eventCount) {
		this.eventCount = eventCount;
	}

	public String getEventDescription() {
		return this.eventDescription;
	}
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
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

	public String getEventUpdateDate() {
		return this.eventUpdateDate;
	}
	public void setEventUpdateDate(String eventUpdateDate) {
		this.eventUpdateDate = eventUpdateDate;
	}

	public String getGreaterThan10m() {
		return this.greaterThan10m;
	}
	public void setGreaterThan10m(String greaterThan10m) {
		this.greaterThan10m = greaterThan10m;
	}

	public String getGreaterThan15s() {
		return this.greaterThan15s;
	}
	public void setGreaterThan15s(String greaterThan15s) {
		this.greaterThan15s = greaterThan15s;
	}

	public String getGreaterThan1h() {
		return this.greaterThan1h;
	}
	public void setGreaterThan1h(String greaterThan1h) {
		this.greaterThan1h = greaterThan1h;
	}

	public String getGreaterThan1m() {
		return this.greaterThan1m;
	}
	public void setGreaterThan1m(String greaterThan1m) {
		this.greaterThan1m = greaterThan1m;
	}

	public String getGreaterThan30m() {
		return this.greaterThan30m;
	}
	public void setGreaterThan30m(String greaterThan30m) {
		this.greaterThan30m = greaterThan30m;
	}

	public String getGreaterThan5s() {
		return this.greaterThan5s;
	}
	public void setGreaterThan5s(String greaterThan5s) {
		this.greaterThan5s = greaterThan5s;
	}

	public String getLessThan0s() {
		return this.lessThan0s;
	}
	public void setLessThan0s(String lessThan0s) {
		this.lessThan0s = lessThan0s;
	}

	public String getLessThanNegative1s() {
		return this.lessThanNegative1s;
	}
	public void setLessThanNegative1s(String lessThanNegative1s) {
		this.lessThanNegative1s = lessThanNegative1s;
	}

	public String getMedicalInstitutionName() {
		return this.medicalInstitutionName;
	}
	public void setMedicalInstitutionName(String medicalInstitutionName) {
		this.medicalInstitutionName = medicalInstitutionName;
	}

	public String getRangeNegative1To10S() {
		return this.rangeNegative1To10S;
	}
	public void setRangeNegative1To10S(String rangeNegative1To10S) {
		this.rangeNegative1To10S = rangeNegative1To10S;
	}

	public String getRangeNegative1To15S() {
		return this.rangeNegative1To15S;
	}
	public void setRangeNegative1To15S(String rangeNegative1To15S) {
		this.rangeNegative1To15S = rangeNegative1To15S;
	}

	public String getRangeNegative1To5S() {
		return this.rangeNegative1To5S;
	}
	public void setRangeNegative1To5S(String rangeNegative1To5S) {
		this.rangeNegative1To5S = rangeNegative1To5S;
	}

	public String getRateNegative1To10S() {
		return this.rateNegative1To10S;
	}
	public void setRateNegative1To10S(String rateNegative1To10S) {
		this.rateNegative1To10S = rateNegative1To10S;
	}

	public String getRateNegative1To15S() {
		return this.rateNegative1To15S;
	}
	public void setRateNegative1To15S(String rateNegative1To15S) {
		this.rateNegative1To15S = rateNegative1To15S;
	}

	public String getRateNegative1To5S() {
		return this.rateNegative1To5S;
	}
	public void setRateNegative1To5S(String rateNegative1To5S) {
		this.rateNegative1To5S = rateNegative1To5S;
	}

	public String getUscc() {
		return this.uscc;
	}
	public void setUscc(String uscc) {
		this.uscc = uscc;
	}

}
