package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字家医智能体跳转链接查询
 *
 * @author auto create
 * @since 1.0, 2025-10-27 10:44:21
 */
public class AlipayCommerceMedicalHomedoctorAgenturlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6321488758479221267L;

	/**
	 * 医生的身份信息
	 */
	@ApiField("doctor_cert_no")
	private String doctorCertNo;

	public String getDoctorCertNo() {
		return this.doctorCertNo;
	}
	public void setDoctorCertNo(String doctorCertNo) {
		this.doctorCertNo = doctorCertNo;
	}

}
