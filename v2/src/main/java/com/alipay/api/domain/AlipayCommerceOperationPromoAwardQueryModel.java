package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销活动激励信息查询
 *
 * @author auto create
 * @since 1.0, 2026-04-15 11:42:45
 */
public class AlipayCommerceOperationPromoAwardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3364287215541683644L;

	/**
	 * 活动编码
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 查询截止时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 查询起始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 主体ID
	 */
	@ApiField("subject_id")
	private String subjectId;

	/**
	 * 主体类型，枚举值：ALPAY_USER（商户）、SMID（二级商户）、POIMID（门店）、LEADS_ID（leadsId）、BIZ_TID、TAG_ID、SN、EMAIL、PHONE、APP
	 */
	@ApiField("subject_type")
	private String subjectType;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getSubjectId() {
		return this.subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectType() {
		return this.subjectType;
	}
	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

}
