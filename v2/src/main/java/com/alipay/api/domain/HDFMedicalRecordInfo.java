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
 * @since 1.0, 2025-11-24 20:27:41
 */
public class HDFMedicalRecordInfo extends AlipayObject {

	private static final long serialVersionUID = 8753379217469599818L;

	/**
	 * 问诊小结
	 */
	@ApiField("medical_summary")
	private HDFMedicalSummary medicalSummary;

	/**
	 * 病例订单ID
	 */
	@ApiField("paper_order_id")
	private String paperOrderId;

	/**
	 * null
	 */
	@ApiListField("patient_attachment_list")
	@ApiField("h_d_f_patient_attachment")
	private List<HDFPatientAttachment> patientAttachmentList;

	/**
	 * 服务结束时间
	 */
	@ApiField("service_end_time")
	private Date serviceEndTime;

	/**
	 * 服务开始时间
	 */
	@ApiField("service_start_time")
	private Date serviceStartTime;

	public HDFMedicalSummary getMedicalSummary() {
		return this.medicalSummary;
	}
	public void setMedicalSummary(HDFMedicalSummary medicalSummary) {
		this.medicalSummary = medicalSummary;
	}

	public String getPaperOrderId() {
		return this.paperOrderId;
	}
	public void setPaperOrderId(String paperOrderId) {
		this.paperOrderId = paperOrderId;
	}

	public List<HDFPatientAttachment> getPatientAttachmentList() {
		return this.patientAttachmentList;
	}
	public void setPatientAttachmentList(List<HDFPatientAttachment> patientAttachmentList) {
		this.patientAttachmentList = patientAttachmentList;
	}

	public Date getServiceEndTime() {
		return this.serviceEndTime;
	}
	public void setServiceEndTime(Date serviceEndTime) {
		this.serviceEndTime = serviceEndTime;
	}

	public Date getServiceStartTime() {
		return this.serviceStartTime;
	}
	public void setServiceStartTime(Date serviceStartTime) {
		this.serviceStartTime = serviceStartTime;
	}

}
