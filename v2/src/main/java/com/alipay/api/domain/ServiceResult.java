package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务结果
 *
 * @author auto create
 * @since 1.0, 2026-05-14 15:01:05
 */
public class ServiceResult extends AlipayObject {

	private static final long serialVersionUID = 2196688873221894963L;

	/**
	 * 实际就医科室
	 */
	@ApiField("actual_department")
	private String actualDepartment;

	/**
	 * 实际就医医院
	 */
	@ApiField("actual_hospital")
	private String actualHospital;

	/**
	 * 就医建议
	 */
	@ApiField("medical_advice")
	private String medicalAdvice;

	/**
	 * 服务小结图片URL
	 */
	@ApiListField("service_summary_photo_url_list")
	@ApiField("string")
	private List<String> serviceSummaryPhotoUrlList;

	/**
	 * 特殊需求记录
	 */
	@ApiField("special_requirements_record")
	private String specialRequirementsRecord;

	/**
	 * 满意度调查附件URL
	 */
	@ApiListField("survey_attachment_url_list")
	@ApiField("string")
	private List<String> surveyAttachmentUrlList;

	public String getActualDepartment() {
		return this.actualDepartment;
	}
	public void setActualDepartment(String actualDepartment) {
		this.actualDepartment = actualDepartment;
	}

	public String getActualHospital() {
		return this.actualHospital;
	}
	public void setActualHospital(String actualHospital) {
		this.actualHospital = actualHospital;
	}

	public String getMedicalAdvice() {
		return this.medicalAdvice;
	}
	public void setMedicalAdvice(String medicalAdvice) {
		this.medicalAdvice = medicalAdvice;
	}

	public List<String> getServiceSummaryPhotoUrlList() {
		return this.serviceSummaryPhotoUrlList;
	}
	public void setServiceSummaryPhotoUrlList(List<String> serviceSummaryPhotoUrlList) {
		this.serviceSummaryPhotoUrlList = serviceSummaryPhotoUrlList;
	}

	public String getSpecialRequirementsRecord() {
		return this.specialRequirementsRecord;
	}
	public void setSpecialRequirementsRecord(String specialRequirementsRecord) {
		this.specialRequirementsRecord = specialRequirementsRecord;
	}

	public List<String> getSurveyAttachmentUrlList() {
		return this.surveyAttachmentUrlList;
	}
	public void setSurveyAttachmentUrlList(List<String> surveyAttachmentUrlList) {
		this.surveyAttachmentUrlList = surveyAttachmentUrlList;
	}

}
