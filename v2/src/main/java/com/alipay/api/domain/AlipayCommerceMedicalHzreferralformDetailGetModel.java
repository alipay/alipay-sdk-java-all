package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转诊单详情获取
 *
 * @author auto create
 * @since 1.0, 2025-10-27 10:44:22
 */
public class AlipayCommerceMedicalHzreferralformDetailGetModel extends AlipayObject {

	private static final long serialVersionUID = 3519345998189392971L;

	/**
	 * 医生的身份信息，用于判断医生权限，是否能够获取转诊单列表
	 */
	@ApiField("doctor_cert_no")
	private String doctorCertNo;

	/**
	 * 转诊单单号，为转诊单表的主键，自动生成，提供给外部使用
	 */
	@ApiField("referral_form_id")
	private String referralFormId;

	public String getDoctorCertNo() {
		return this.doctorCertNo;
	}
	public void setDoctorCertNo(String doctorCertNo) {
		this.doctorCertNo = doctorCertNo;
	}

	public String getReferralFormId() {
		return this.referralFormId;
	}
	public void setReferralFormId(String referralFormId) {
		this.referralFormId = referralFormId;
	}

}
