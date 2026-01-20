package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用药信息
 *
 * @author auto create
 * @since 1.0, 2025-11-03 15:32:13
 */
public class HDFMedicineCondition extends AlipayObject {

	private static final long serialVersionUID = 2839448532249812385L;

	/**
	 * 药品描述
	 */
	@ApiField("medicine_desc")
	private String medicineDesc;

	/**
	 * 药品名称
	 */
	@ApiField("medicine_name")
	private String medicineName;

	/**
	 * 图片地址列表
	 */
	@ApiListField("patient_attachment_ids")
	@ApiField("string")
	private List<String> patientAttachmentIds;

	public String getMedicineDesc() {
		return this.medicineDesc;
	}
	public void setMedicineDesc(String medicineDesc) {
		this.medicineDesc = medicineDesc;
	}

	public String getMedicineName() {
		return this.medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public List<String> getPatientAttachmentIds() {
		return this.patientAttachmentIds;
	}
	public void setPatientAttachmentIds(List<String> patientAttachmentIds) {
		this.patientAttachmentIds = patientAttachmentIds;
	}

}
