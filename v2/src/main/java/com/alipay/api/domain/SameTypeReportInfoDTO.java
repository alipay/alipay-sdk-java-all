package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-03 14:07:42
 */
public class SameTypeReportInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6899352379419742945L;

	/**
	 * 医院名称
	 */
	@ApiField("org_name")
	private String orgName;

	/**
	 * 报告id
	 */
	@ApiField("report_id")
	private String reportId;

	/**
	 * 报告名称
	 */
	@ApiField("report_name")
	private String reportName;

	/**
	 * 报告类型
	 */
	@ApiField("report_type")
	private String reportType;

	/**
	 * 同类型分数
	 */
	@ApiField("score")
	private String score;

	/**
	 * 检查时间
	 */
	@ApiField("treatment_time")
	private String treatmentTime;

	public String getOrgName() {
		return this.orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getReportId() {
		return this.reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public String getReportName() {
		return this.reportName;
	}
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public String getReportType() {
		return this.reportType;
	}
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
	}

	public String getTreatmentTime() {
		return this.treatmentTime;
	}
	public void setTreatmentTime(String treatmentTime) {
		this.treatmentTime = treatmentTime;
	}

}
