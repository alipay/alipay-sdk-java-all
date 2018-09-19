package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医院报告明细
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class MedicalHospitalReportList extends AlipayObject {

	private static final long serialVersionUID = 7151262895284567941L;

	/**
	 * 报告产出日期 格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("report_date")
	private Date reportDate;

	/**
	 * 报告说明
	 */
	@ApiField("report_desc")
	private String reportDesc;

	/**
	 * 报告详情连接
	 */
	@ApiField("report_link")
	private String reportLink;

	/**
	 * 报告名称
	 */
	@ApiField("report_name")
	private String reportName;

	/**
	 * 报告类型:
CHECK_REPORT 检查报告
EXAM_REPORT检验报告
	 */
	@ApiField("report_type")
	private String reportType;

	public Date getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public String getReportDesc() {
		return this.reportDesc;
	}
	public void setReportDesc(String reportDesc) {
		this.reportDesc = reportDesc;
	}

	public String getReportLink() {
		return this.reportLink;
	}
	public void setReportLink(String reportLink) {
		this.reportLink = reportLink;
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

}
