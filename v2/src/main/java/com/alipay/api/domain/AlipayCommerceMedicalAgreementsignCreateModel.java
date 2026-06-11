package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 主体同步与协议签约
 *
 * @author auto create
 * @since 1.0, 2026-02-26 15:17:44
 */
public class AlipayCommerceMedicalAgreementsignCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2221322556912719262L;

	/**
	 * 签约时间
	 */
	@ApiField("agreement_signing_time")
	private String agreementSigningTime;

	/**
	 * null
	 */
	@ApiListField("agreement_template_list")
	@ApiField("agreement_template")
	private List<AgreementTemplate> agreementTemplateList;

	/**
	 * 应用编码
	 */
	@ApiField("app_code")
	private String appCode;

	/**
	 * 医生id
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 签约人支付宝userid(2088)
	 */
	@ApiField("signing_alipay_user_id")
	private String signingAlipayUserId;

	/**
	 * 签约人身份证
	 */
	@ApiField("signing_cert_no")
	private String signingCertNo;

	/**
	 * 签约人姓名
	 */
	@ApiField("signing_name")
	private String signingName;

	/**
	 * 签约人手机号
	 */
	@ApiField("signing_phone_no")
	private String signingPhoneNo;

	public String getAgreementSigningTime() {
		return this.agreementSigningTime;
	}
	public void setAgreementSigningTime(String agreementSigningTime) {
		this.agreementSigningTime = agreementSigningTime;
	}

	public List<AgreementTemplate> getAgreementTemplateList() {
		return this.agreementTemplateList;
	}
	public void setAgreementTemplateList(List<AgreementTemplate> agreementTemplateList) {
		this.agreementTemplateList = agreementTemplateList;
	}

	public String getAppCode() {
		return this.appCode;
	}
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getDoctorId() {
		return this.doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getSigningAlipayUserId() {
		return this.signingAlipayUserId;
	}
	public void setSigningAlipayUserId(String signingAlipayUserId) {
		this.signingAlipayUserId = signingAlipayUserId;
	}

	public String getSigningCertNo() {
		return this.signingCertNo;
	}
	public void setSigningCertNo(String signingCertNo) {
		this.signingCertNo = signingCertNo;
	}

	public String getSigningName() {
		return this.signingName;
	}
	public void setSigningName(String signingName) {
		this.signingName = signingName;
	}

	public String getSigningPhoneNo() {
		return this.signingPhoneNo;
	}
	public void setSigningPhoneNo(String signingPhoneNo) {
		this.signingPhoneNo = signingPhoneNo;
	}

}
