package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-06-08 17:57:56
 */
public class ReportDetailResponse extends AlipayObject {

	private static final long serialVersionUID = 3431544423163186899L;

	/**
	 * 文件来源
	 */
	@ApiField("file_source")
	private String fileSource;

	/**
	 * 文件url
	 */
	@ApiField("file_url")
	private String fileUrl;

	/**
	 * 主键ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 报告ID
	 */
	@ApiField("report_id")
	private String reportId;

	/**
	 * 报告名称
	 */
	@ApiField("report_name")
	private String reportName;

	/**
	 * 报告时间
	 */
	@ApiField("report_time")
	private Date reportTime;

	/**
	 * 场景
	 */
	@ApiField("scene")
	private String scene;

	public String getFileSource() {
		return this.fileSource;
	}
	public void setFileSource(String fileSource) {
		this.fileSource = fileSource;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
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

	public Date getReportTime() {
		return this.reportTime;
	}
	public void setReportTime(Date reportTime) {
		this.reportTime = reportTime;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
