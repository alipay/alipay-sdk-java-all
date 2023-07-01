package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扩展信息
 *
 * @author auto create
 * @since 1.0, 2023-06-25 22:40:16
 */
public class AuthExtendParams extends AlipayObject {

	private static final long serialVersionUID = 3222559893882861919L;

	/**
	 * 就诊人证件号
	 */
	@ApiField("patient_cert_no")
	private String patientCertNo;

	/**
	 * 就诊人证件类型
	 */
	@ApiField("patient_cert_type")
	private String patientCertType;

	/**
	 * 就诊人真实姓名
	 */
	@ApiField("patient_name")
	private String patientName;

	/**
	 * 返佣参数
	 */
	@ApiField("sys_service_provider_id")
	private String sysServiceProviderId;

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

	public String getPatientName() {
		return this.patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getSysServiceProviderId() {
		return this.sysServiceProviderId;
	}
	public void setSysServiceProviderId(String sysServiceProviderId) {
		this.sysServiceProviderId = sysServiceProviderId;
	}

}
