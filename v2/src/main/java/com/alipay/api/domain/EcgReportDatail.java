package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-14 16:22:49
 */
public class EcgReportDatail extends AlipayObject {

	private static final long serialVersionUID = 2276533945782637574L;

	/**
	 * 年龄
	 */
	@ApiField("age")
	private String age;

	/**
	 * 检查结果
	 */
	@ApiField("check_result")
	private String checkResult;

	/**
	 * 性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 医院编码
	 */
	@ApiField("hospital_code")
	private String hospitalCode;

	/**
	 * 医院名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * 报告对应图片类型
	 */
	@ApiField("pic_type")
	private String picType;

	/**
	 * 心电图报告唯一标识
	 */
	@ApiField("report_id")
	private String reportId;

	/**
	 * 报告名称
	 */
	@ApiField("report_name")
	private String reportName;

	/**
	 * 报告采集时间
	 */
	@ApiField("report_time")
	private String reportTime;

	/**
	 * 报告类型
	 */
	@ApiField("report_type")
	private String reportType;

	/**
	 * 报告上传时间
	 */
	@ApiField("report_upload_time")
	private String reportUploadTime;

	/**
	 * 报告保存地址
	 */
	@ApiField("report_url")
	private String reportUrl;

	public String getAge() {
		return this.age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public String getCheckResult() {
		return this.checkResult;
	}
	public void setCheckResult(String checkResult) {
		this.checkResult = checkResult;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHospitalCode() {
		return this.hospitalCode;
	}
	public void setHospitalCode(String hospitalCode) {
		this.hospitalCode = hospitalCode;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getPicType() {
		return this.picType;
	}
	public void setPicType(String picType) {
		this.picType = picType;
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

	public String getReportUploadTime() {
		return this.reportUploadTime;
	}
	public void setReportUploadTime(String reportUploadTime) {
		this.reportUploadTime = reportUploadTime;
	}

	public String getReportUrl() {
		return this.reportUrl;
	}
	public void setReportUrl(String reportUrl) {
		this.reportUrl = reportUrl;
	}

}
