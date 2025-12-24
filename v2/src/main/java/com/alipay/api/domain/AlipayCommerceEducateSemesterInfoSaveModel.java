package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建学期
 *
 * @author auto create
 * @since 1.0, 2025-06-18 17:16:29
 */
public class AlipayCommerceEducateSemesterInfoSaveModel extends AlipayObject {

	private static final long serialVersionUID = 6181186582731217131L;

	/**
	 * 学期结束日期，格式：yyyyMMdd
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 课时配置ID
	 */
	@ApiField("period_id")
	private String periodId;

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

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

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

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getPeriodId() {
		return this.periodId;
	}
	public void setPeriodId(String periodId) {
		this.periodId = periodId;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
