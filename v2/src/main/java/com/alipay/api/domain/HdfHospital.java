package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫医院信息
 *
 * @author auto create
 * @since 1.0, 2025-11-03 15:32:13
 */
public class HdfHospital extends AlipayObject {

	private static final long serialVersionUID = 4278199259385778139L;

	/**
	 * 例：医保卡、身份证 
按三方业务定义传递卡名称即可
	 */
	@ApiField("consultation_credentials")
	private String consultationCredentials;

	/**
	 * 就诊证件号
	 */
	@ApiField("credentials_number")
	private String credentialsNumber;

	/**
	 * 科室名称
	 */
	@ApiField("faculty_name")
	private String facultyName;

	/**
	 * 医院名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	public String getConsultationCredentials() {
		return this.consultationCredentials;
	}
	public void setConsultationCredentials(String consultationCredentials) {
		this.consultationCredentials = consultationCredentials;
	}

	public String getCredentialsNumber() {
		return this.credentialsNumber;
	}
	public void setCredentialsNumber(String credentialsNumber) {
		this.credentialsNumber = credentialsNumber;
	}

	public String getFacultyName() {
		return this.facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

}
