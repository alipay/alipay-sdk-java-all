package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报告出具消息发送
 *
 * @author auto create
 * @since 1.0, 2026-06-29 14:42:55
 */
public class AlipayCommerceMedicalReportSmsSendModel extends AlipayObject {

	private static final long serialVersionUID = 7725956657315127661L;

	/**
	 * 证件号码,若短信模板签名为支付宝,则此项必填
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 报告科室
	 */
	@ApiField("department")
	private String department;

	/**
	 * 医院名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * 用户姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 手机号码,仅支持中国手机号,若短信模板签名非支付宝,则此项必填
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	/**
	 * 报告数量
	 */
	@ApiField("report_count")
	private String reportCount;

	/**
	 * 报告id列表(json格式数组)
	 */
	@ApiField("report_ids")
	private String reportIds;

	/**
	 * 报告出具时间(毫秒级时间戳)
	 */
	@ApiField("report_issue_time")
	private String reportIssueTime;

	/**
	 * 报告名称(若有多份填最新那份)
	 */
	@ApiField("report_name")
	private String reportName;

	/**
	 * 报告类型;如果是mixed,报告数量则必须>1,否则返回参数错误
	 */
	@ApiField("report_type")
	private String reportType;

	/**
	 * 机构社会信用代码
	 */
	@ApiField("uscc")
	private String uscc;

	/**
	 * 就诊时间(毫秒级时间戳)
	 */
	@ApiField("visit_time")
	private String visitTime;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getReportCount() {
		return this.reportCount;
	}
	public void setReportCount(String reportCount) {
		this.reportCount = reportCount;
	}

	public String getReportIds() {
		return this.reportIds;
	}
	public void setReportIds(String reportIds) {
		this.reportIds = reportIds;
	}

	public String getReportIssueTime() {
		return this.reportIssueTime;
	}
	public void setReportIssueTime(String reportIssueTime) {
		this.reportIssueTime = reportIssueTime;
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

	public String getUscc() {
		return this.uscc;
	}
	public void setUscc(String uscc) {
		this.uscc = uscc;
	}

	public String getVisitTime() {
		return this.visitTime;
	}
	public void setVisitTime(String visitTime) {
		this.visitTime = visitTime;
	}

}
