package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询OCR结果
 *
 * @author auto create
 * @since 1.0, 2026-01-15 12:57:41
 */
public class AlipayCommerceMedicalOcrresultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2556478466596894181L;

	/**
	 * null
	 */
	@ApiListField("attachment_list")
	@ApiField("ocr_attachment")
	private List<OcrAttachment> attachmentList;

	/**
	 * 业务id
	 */
	@ApiField("business_id")
	private String businessId;

	/**
	 * 业务类型
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 患者id
	 */
	@ApiField("patient_id")
	private String patientId;

	public List<OcrAttachment> getAttachmentList() {
		return this.attachmentList;
	}
	public void setAttachmentList(List<OcrAttachment> attachmentList) {
		this.attachmentList = attachmentList;
	}

	public String getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getBusinessType() {
		return this.businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getPatientId() {
		return this.patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

}
