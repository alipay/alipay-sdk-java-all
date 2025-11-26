package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-10-29 15:52:40
 */
public class CheckReport extends AlipayObject {

	private static final long serialVersionUID = 8817912736947818827L;

	/**
	 * 唯一id
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 数据来源
	 */
	@ApiField("data_source")
	private String dataSource;

	/**
	 * 医院名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * 医院编码
	 */
	@ApiField("hospital_org_id")
	private String hospitalOrgId;

	/**
	 * 检查报告详情
	 */
	@ApiField("inspection_report")
	private InspectionReport inspectionReport;

	/**
	 * 检验报告详情
	 */
	@ApiField("laboratory_report")
	private LaboratoryReport laboratoryReport;

	/**
	 * 检验报告id
	 */
	@ApiField("report_id")
	private String reportId;

	/**
	 * 检验报告名称
	 */
	@ApiField("report_name")
	private String reportName;

	/**
	 * 报告时间
	 */
	@ApiField("report_time")
	private String reportTime;

	/**
	 * 检验报告类型 inspection-检查，laboratory-检验
	 */
	@ApiField("report_type")
	private String reportType;

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getDataSource() {
		return this.dataSource;
	}
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalOrgId() {
		return this.hospitalOrgId;
	}
	public void setHospitalOrgId(String hospitalOrgId) {
		this.hospitalOrgId = hospitalOrgId;
	}

	public InspectionReport getInspectionReport() {
		return this.inspectionReport;
	}
	public void setInspectionReport(InspectionReport inspectionReport) {
		this.inspectionReport = inspectionReport;
	}

	public LaboratoryReport getLaboratoryReport() {
		return this.laboratoryReport;
	}
	public void setLaboratoryReport(LaboratoryReport laboratoryReport) {
		this.laboratoryReport = laboratoryReport;
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

	public String getReportTime() {
		return this.reportTime;
	}
	public void setReportTime(String reportTime) {
		this.reportTime = reportTime;
	}

	public String getReportType() {
		return this.reportType;
	}
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

}
