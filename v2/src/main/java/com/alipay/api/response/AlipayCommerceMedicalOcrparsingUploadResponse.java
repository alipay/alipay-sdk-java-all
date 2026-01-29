package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OcrAttachmentRes;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.ocrparsing.upload response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-15 12:57:41
 */
public class AlipayCommerceMedicalOcrparsingUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 3619588978486587497L;

	/** 
	 * null
	 */
	@ApiListField("attachment_list")
	@ApiField("ocr_attachment_res")
	private List<OcrAttachmentRes> attachmentList;

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

	public void setAttachmentList(List<OcrAttachmentRes> attachmentList) {
		this.attachmentList = attachmentList;
	}
	public List<OcrAttachmentRes> getAttachmentList( ) {
		return this.attachmentList;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public String getBusinessId( ) {
		return this.businessId;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getBusinessType( ) {
		return this.businessType;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getPatientId( ) {
		return this.patientId;
	}

}
