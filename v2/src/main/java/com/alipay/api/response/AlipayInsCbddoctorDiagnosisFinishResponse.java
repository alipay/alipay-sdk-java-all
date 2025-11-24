package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.cbddoctor.diagnosis.finish response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-07 17:27:33
 */
public class AlipayInsCbddoctorDiagnosisFinishResponse extends AlipayResponse {

	private static final long serialVersionUID = 3223358384447984381L;

	/** 
	 * 医生在蚂蚁插件填写的病情处置建议
	 */
	@ApiField("disposal_advice")
	private String disposalAdvice;

	/** 
	 * 蚂蚁插件医生填写的是否有效问诊标识[true,false]
	 */
	@ApiField("doctor_beneficial")
	private Boolean doctorBeneficial;

	/** 
	 * 医生在蚂蚁插件填写的就诊人病情描述
	 */
	@ApiField("illness_desc")
	private String illnessDesc;

	/** 
	 * 医生在蚂蚁插件填写的就诊人年龄字符串（数字+年龄单位），单位分别为["Y","M","D"]，示例如下：
28Y代表28岁
6M代表6个月
25D代表25天
	 */
	@ApiField("patient_age")
	private String patientAge;

	/** 
	 * 医生蚂蚁插件填写的就诊人性别
	 */
	@ApiField("patient_gender")
	private String patientGender;

	public void setDisposalAdvice(String disposalAdvice) {
		this.disposalAdvice = disposalAdvice;
	}
	public String getDisposalAdvice( ) {
		return this.disposalAdvice;
	}

	public void setDoctorBeneficial(Boolean doctorBeneficial) {
		this.doctorBeneficial = doctorBeneficial;
	}
	public Boolean getDoctorBeneficial( ) {
		return this.doctorBeneficial;
	}

	public void setIllnessDesc(String illnessDesc) {
		this.illnessDesc = illnessDesc;
	}
	public String getIllnessDesc( ) {
		return this.illnessDesc;
	}

	public void setPatientAge(String patientAge) {
		this.patientAge = patientAge;
	}
	public String getPatientAge( ) {
		return this.patientAge;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}
	public String getPatientGender( ) {
		return this.patientGender;
	}

}
