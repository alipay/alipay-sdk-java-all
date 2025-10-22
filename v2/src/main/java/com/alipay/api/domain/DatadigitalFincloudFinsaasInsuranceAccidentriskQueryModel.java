package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险SaaS两核风控意外险风控等级查询
 *
 * @author auto create
 * @since 1.0, 2024-08-21 17:14:36
 */
public class DatadigitalFincloudFinsaasInsuranceAccidentriskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3828547573573414971L;

	/**
	 * 投保人身份信息，格式为：SHA256(身份证号)。
注意：身份证号需要大写之后做SHA256计算。
	 */
	@ApiField("applicant_cert_no")
	private String applicantCertNo;

	/**
	 * 当前风险判定以投保人为主还是以被保人为主。若以投保人为主，则值为applicant， 若以被保人为主，则值为insured。
	 */
	@ApiField("assess_priority")
	private String assessPriority;

	/**
	 * 授权协议信息，由授权协议地址和授权协议号组成，中间通过'#'符号分隔，格式为: 授权协议地址#授权协议号。
	 */
	@ApiField("auth_agreement")
	private String authAgreement;

	/**
	 * 业务ID，服务调用方生成并确保全局唯一。服务是否基于该参数保证幂等性，服务调用方需提前确认。
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 保额，单位为元。
	 */
	@ApiField("insured_amt")
	private String insuredAmt;

	/**
	 * 被保人身份信息，格式为：SHA256(身份证号)。
注意：身份证号需要大写之后做SHA256计算。
	 */
	@ApiField("insured_cert_no")
	private String insuredCertNo;

	/**
	 * 对客产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 被保人职业等级
	 */
	@ApiField("profession_level")
	private String professionLevel;

	public String getApplicantCertNo() {
		return this.applicantCertNo;
	}
	public void setApplicantCertNo(String applicantCertNo) {
		this.applicantCertNo = applicantCertNo;
	}

	public String getAssessPriority() {
		return this.assessPriority;
	}
	public void setAssessPriority(String assessPriority) {
		this.assessPriority = assessPriority;
	}

	public String getAuthAgreement() {
		return this.authAgreement;
	}
	public void setAuthAgreement(String authAgreement) {
		this.authAgreement = authAgreement;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getInsuredAmt() {
		return this.insuredAmt;
	}
	public void setInsuredAmt(String insuredAmt) {
		this.insuredAmt = insuredAmt;
	}

	public String getInsuredCertNo() {
		return this.insuredCertNo;
	}
	public void setInsuredCertNo(String insuredCertNo) {
		this.insuredCertNo = insuredCertNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProfessionLevel() {
		return this.professionLevel;
	}
	public void setProfessionLevel(String professionLevel) {
		this.professionLevel = professionLevel;
	}

}
