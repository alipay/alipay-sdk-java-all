package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-25 17:42:51
 */
public class MedicalHmMedicalReport extends AlipayObject {

	private static final long serialVersionUID = 1484857989529462865L;

	/**
	 * 用户测量记录表ID
	 */
	@ApiField("assessment_record_id")
	private String assessmentRecordId;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * null
	 */
	@ApiListField("report_url_json")
	@ApiField("string")
	private List<String> reportUrlJson;

	/**
	 * sync_report-体检报告 /  image-上传图片 / file-上传文件
	 */
	@ApiField("upload_type")
	private String uploadType;

	public String getAssessmentRecordId() {
		return this.assessmentRecordId;
	}
	public void setAssessmentRecordId(String assessmentRecordId) {
		this.assessmentRecordId = assessmentRecordId;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public List<String> getReportUrlJson() {
		return this.reportUrlJson;
	}
	public void setReportUrlJson(List<String> reportUrlJson) {
		this.reportUrlJson = reportUrlJson;
	}

	public String getUploadType() {
		return this.uploadType;
	}
	public void setUploadType(String uploadType) {
		this.uploadType = uploadType;
	}

}
