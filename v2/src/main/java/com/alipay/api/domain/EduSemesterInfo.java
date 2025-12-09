package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学期信息
 *
 * @author auto create
 * @since 1.0, 2025-06-09 09:59:07
 */
public class EduSemesterInfo extends AlipayObject {

	private static final long serialVersionUID = 4356135537294961778L;

	/**
	 * 学期结束日期
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 学期最大周数
	 */
	@ApiField("max_week")
	private Long maxWeek;

	/**
	 * 修改时间
	 */
	@ApiField("modified_time")
	private Date modifiedTime;

	/**
	 * 操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 关联课时
	 */
	@ApiField("period")
	private EduPeriodInfo period;

	/**
	 * 学期描述
	 */
	@ApiField("semester_desc")
	private String semesterDesc;

	/**
	 * 学期ID
	 */
	@ApiField("semester_id")
	private String semesterId;

	/**
	 * 学期名称
	 */
	@ApiField("semester_name")
	private String semesterName;

	/**
	 * 学期开始日期，格式：yyyyMMdd
	 */
	@ApiField("start_date")
	private String startDate;

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public Long getMaxWeek() {
		return this.maxWeek;
	}
	public void setMaxWeek(Long maxWeek) {
		this.maxWeek = maxWeek;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public EduPeriodInfo getPeriod() {
		return this.period;
	}
	public void setPeriod(EduPeriodInfo period) {
		this.period = period;
	}

	public String getSemesterDesc() {
		return this.semesterDesc;
	}
	public void setSemesterDesc(String semesterDesc) {
		this.semesterDesc = semesterDesc;
	}

	public String getSemesterId() {
		return this.semesterId;
	}
	public void setSemesterId(String semesterId) {
		this.semesterId = semesterId;
	}

	public String getSemesterName() {
		return this.semesterName;
	}
	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
