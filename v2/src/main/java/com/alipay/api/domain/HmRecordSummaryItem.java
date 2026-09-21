package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-21 11:12:57
 */
public class HmRecordSummaryItem extends AlipayObject {

	private static final long serialVersionUID = 7776721121953354162L;

	/**
	 * 活动ID
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动类型
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 记录日期
	 */
	@ApiField("record_date")
	private String recordDate;

	/**
	 * 打卡次数
	 */
	@ApiField("record_num")
	private Long recordNum;

	/**
	 * 记录类型
	 */
	@ApiField("record_type")
	private String recordType;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getRecordDate() {
		return this.recordDate;
	}
	public void setRecordDate(String recordDate) {
		this.recordDate = recordDate;
	}

	public Long getRecordNum() {
		return this.recordNum;
	}
	public void setRecordNum(Long recordNum) {
		this.recordNum = recordNum;
	}

	public String getRecordType() {
		return this.recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

}
