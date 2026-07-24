package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-17 16:32:52
 */
public class HealthReport extends AlipayObject {

	private static final long serialVersionUID = 4649658445416674789L;

	/**
	 * 年龄
	 */
	@ApiField("age")
	private String age;

	/**
	 * null
	 */
	@ApiListField("basic_physical_examination_report_list")
	@ApiField("basic_examination_report")
	private List<BasicExaminationReport> basicPhysicalExaminationReportList;

	/**
	 * 唯一id
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 数据来源 HNjianxiangjun
	 */
	@ApiField("data_source")
	private String dataSource;

	/**
	 * 文件类型
PDF/PIC
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 原始文件地址
	 */
	@ApiField("file_url")
	private String fileUrl;

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
	 * null
	 */
	@ApiListField("inspection_report_list")
	@ApiField("health_inspection_report")
	private List<HealthInspectionReport> inspectionReportList;

	/**
	 * null
	 */
	@ApiListField("laboratory_report_list")
	@ApiField("health_laboratory_report")
	private List<HealthLaboratoryReport> laboratoryReportList;

	/**
	 * 结论
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 体检报告id
	 */
	@ApiField("report_id")
	private String reportId;

	/**
	 * 体检单名称
	 */
	@ApiField("report_name")
	private String reportName;

	/**
	 * 就诊日期
	 */
	@ApiField("report_time")
	private String reportTime;

	/**
	 * 体检类型（如"体检报告"/"入职体检"）
	 */
	@ApiField("report_type")
	private String reportType;

	public String getAge() {
		return this.age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public List<BasicExaminationReport> getBasicPhysicalExaminationReportList() {
		return this.basicPhysicalExaminationReportList;
	}
	public void setBasicPhysicalExaminationReportList(List<BasicExaminationReport> basicPhysicalExaminationReportList) {
		this.basicPhysicalExaminationReportList = basicPhysicalExaminationReportList;
	}

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

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
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

	public List<HealthInspectionReport> getInspectionReportList() {
		return this.inspectionReportList;
	}
	public void setInspectionReportList(List<HealthInspectionReport> inspectionReportList) {
		this.inspectionReportList = inspectionReportList;
	}

	public List<HealthLaboratoryReport> getLaboratoryReportList() {
		return this.laboratoryReportList;
	}
	public void setLaboratoryReportList(List<HealthLaboratoryReport> laboratoryReportList) {
		this.laboratoryReportList = laboratoryReportList;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
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
