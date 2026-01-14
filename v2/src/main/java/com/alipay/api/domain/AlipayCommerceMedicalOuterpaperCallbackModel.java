package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 三方履约服务病历回传
 *
 * @author auto create
 * @since 1.0, 2025-11-06 10:37:41
 */
public class AlipayCommerceMedicalOuterpaperCallbackModel extends AlipayObject {

	private static final long serialVersionUID = 2694367418884646112L;

	/**
	 * 医生信息
	 */
	@ApiField("doctor_info")
	private HDFDoctorInfo doctorInfo;

	/**
	 * 存所有数据json，后续转病程
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 履约订单Id
	 */
	@ApiField("fulfillment_order_id")
	private String fulfillmentOrderId;

	/**
	 * null
	 */
	@ApiListField("medical_content_list")
	@ApiField("h_d_f_medical_content")
	private List<HDFMedicalContent> medicalContentList;

	/**
	 * 外部单号
	 */
	@ApiField("partner_order_id")
	private String partnerOrderId;

	/**
	 * 患者信息
	 */
	@ApiField("patient_info")
	private HDFPatientInfo patientInfo;

	/**
	 * 处方
	 */
	@ApiField("prescription_info")
	private HDFPrescription prescriptionInfo;

	public HDFDoctorInfo getDoctorInfo() {
		return this.doctorInfo;
	}
	public void setDoctorInfo(HDFDoctorInfo doctorInfo) {
		this.doctorInfo = doctorInfo;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getFulfillmentOrderId() {
		return this.fulfillmentOrderId;
	}
	public void setFulfillmentOrderId(String fulfillmentOrderId) {
		this.fulfillmentOrderId = fulfillmentOrderId;
	}

	public List<HDFMedicalContent> getMedicalContentList() {
		return this.medicalContentList;
	}
	public void setMedicalContentList(List<HDFMedicalContent> medicalContentList) {
		this.medicalContentList = medicalContentList;
	}

	public String getPartnerOrderId() {
		return this.partnerOrderId;
	}
	public void setPartnerOrderId(String partnerOrderId) {
		this.partnerOrderId = partnerOrderId;
	}

	public HDFPatientInfo getPatientInfo() {
		return this.patientInfo;
	}
	public void setPatientInfo(HDFPatientInfo patientInfo) {
		this.patientInfo = patientInfo;
	}

	public HDFPrescription getPrescriptionInfo() {
		return this.prescriptionInfo;
	}
	public void setPrescriptionInfo(HDFPrescription prescriptionInfo) {
		this.prescriptionInfo = prescriptionInfo;
	}

}
