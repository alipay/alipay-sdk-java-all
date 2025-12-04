package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 主报告
 *
 * @author auto create
 * @since 1.0, 2025-12-03 14:07:42
 */
public class ReportInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7888996115237127266L;

	/**
	 * 医院名
	 */
	@ApiField("org_name")
	private String orgName;

	/**
	 * 报告Id
	 */
	@ApiField("report_id")
	private String reportId;

	/**
	 * 报告名
	 */
	@ApiField("report_name")
	private String reportName;

	/**
	 * 报告类型
	 */
	@ApiField("report_type")
	private String reportType;

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

	public String getTreatmentTime() {
		return this.treatmentTime;
	}
	public void setTreatmentTime(String treatmentTime) {
		this.treatmentTime = treatmentTime;
	}

}
