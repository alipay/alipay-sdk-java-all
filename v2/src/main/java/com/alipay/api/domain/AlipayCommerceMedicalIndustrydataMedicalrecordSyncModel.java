package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 病程状态同步
 *
 * @author auto create
 * @since 1.0, 2025-08-29 14:19:14
 */
public class AlipayCommerceMedicalIndustrydataMedicalrecordSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3715366247746285713L;

	/**
	 * 1 删除 0 未删除
	 */
	@ApiField("delete_flag")
	private String deleteFlag;

	/**
	 * 病程id
	 */
	@ApiField("medical_record_id")
	private String medicalRecordId;

	/**
	 * 1 隐私 0 公开
	 */
	@ApiField("private_flag")
	private String privateFlag;

	public String getDeleteFlag() {
		return this.deleteFlag;
	}
	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getMedicalRecordId() {
		return this.medicalRecordId;
	}
	public void setMedicalRecordId(String medicalRecordId) {
		this.medicalRecordId = medicalRecordId;
	}

	public String getPrivateFlag() {
		return this.privateFlag;
	}
	public void setPrivateFlag(String privateFlag) {
		this.privateFlag = privateFlag;
	}

}
