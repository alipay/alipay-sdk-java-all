package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户的电子社保卡或医保电子凭证基础信息
 *
 * @author auto create
 * @since 1.0, 2024-12-12 15:58:25
 */
public class AlipayCommerceMedicalCardAuthQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2188347853216452794L;

	/**
	 * 机构编码
	 */
	@ApiField("ins_code")
	private String insCode;

	/**
	 * 就诊人有效身份证件号码
	 */
	@ApiField("patient_cert_no")
	private String patientCertNo;

	/**
	 * 当前就诊人的有效身份证件类型编码
	 */
	@ApiField("patient_cert_type")
	private String patientCertType;

	/**
	 * 就诊人与当前登录用户的关系
	 */
	@ApiField("relation_type")
	private String relationType;

	public String getInsCode() {
		return this.insCode;
	}
	public void setInsCode(String insCode) {
		this.insCode = insCode;
	}

	public String getPatientCertNo() {
		return this.patientCertNo;
	}
	public void setPatientCertNo(String patientCertNo) {
		this.patientCertNo = patientCertNo;
	}

	public String getPatientCertType() {
		return this.patientCertType;
	}
	public void setPatientCertType(String patientCertType) {
		this.patientCertType = patientCertType;
	}

	public String getRelationType() {
		return this.relationType;
	}
	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

}
