package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 问诊总结生成接口
 *
 * @author auto create
 * @since 1.0, 2025-06-23 14:28:27
 */
public class AlipayCommerceHdfaitransferConclusionGenerateModel extends AlipayObject {

	private static final long serialVersionUID = 8759734553381547271L;

	/**
	 * 交流记录信息
	 */
	@ApiListField("chat_record_info")
	@ApiField("chat_record_info")
	private List<ChatRecordInfo> chatRecordInfo;

	/**
	 * 病历信息
	 */
	@ApiField("medical_record_info")
	private MedicalRecordInfo medicalRecordInfo;

	public List<ChatRecordInfo> getChatRecordInfo() {
		return this.chatRecordInfo;
	}
	public void setChatRecordInfo(List<ChatRecordInfo> chatRecordInfo) {
		this.chatRecordInfo = chatRecordInfo;
	}

	public MedicalRecordInfo getMedicalRecordInfo() {
		return this.medicalRecordInfo;
	}
	public void setMedicalRecordInfo(MedicalRecordInfo medicalRecordInfo) {
		this.medicalRecordInfo = medicalRecordInfo;
	}

}
