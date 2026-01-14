package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 就诊信息
 *
 * @author auto create
 * @since 1.0, 2025-12-26 17:37:42
 */
public class InsuranceVisitInfo extends AlipayObject {

	private static final long serialVersionUID = 5742598733766717867L;

	/**
	 * 医院名
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * 就诊类型
	 */
	@ApiField("medical_type")
	private String medicalType;

	/**
	 * 就诊日期 格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("visit_date")
	private String visitDate;

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getMedicalType() {
		return this.medicalType;
	}
	public void setMedicalType(String medicalType) {
		this.medicalType = medicalType;
	}

	public String getVisitDate() {
		return this.visitDate;
	}
	public void setVisitDate(String visitDate) {
		this.visitDate = visitDate;
	}

}
