package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业认证信息
 *
 * @author auto create
 * @since 1.0, 2024-09-02 15:51:50
 */
public class RentEnterpriseCertification extends AlipayObject {

	private static final long serialVersionUID = 5674716684225534527L;

	/**
	 * 代理人手机号
	 */
	@ApiField("agent_person_cellphone")
	private String agentPersonCellphone;

	/**
	 * 代理人身份证有效期
	 */
	@ApiField("agent_person_cert_expire_date")
	private String agentPersonCertExpireDate;

	/**
	 * 代理人身份证号
	 */
	@ApiField("agent_person_cert_no")
	private String agentPersonCertNo;

	/**
	 * 代理人身份证有效开始日期
	 */
	@ApiField("agent_person_cert_start_date")
	private String agentPersonCertStartDate;

	/**
	 * 代理人身份证国徽面照片地址
	 */
	@ApiField("agent_person_emblem_cert_image_url")
	private String agentPersonEmblemCertImageUrl;

	/**
	 * 代理人身份证人像面照片地址
	 */
	@ApiField("agent_person_face_cert_image_url")
	private String agentPersonFaceCertImageUrl;

	/**
	 * 代理人姓名
	 */
	@ApiField("agent_person_name")
	private String agentPersonName;

	/**
	 * 小程序ID
	 */
	@ApiField("appid")
	private String appid;

	/**
	 * 法人授权状态
	 */
	@ApiField("auth_status")
	private String authStatus;

	/**
	 * 企业认证结果
	 */
	@ApiField("certification_result")
	private String certificationResult;

	/**
	 * 认证类型
	 */
	@ApiField("certification_type")
	private String certificationType;

	/**
	 * 企业地址
	 */
	@ApiField("enterprise_address")
	private String enterpriseAddress;

	/**
	 * 营业执照有效时间（年-月-日）
	 */
	@ApiField("enterprise_license_expire_date")
	private String enterpriseLicenseExpireDate;

	/**
	 * 营业执照图片地址
	 */
	@ApiField("enterprise_license_image_url")
	private String enterpriseLicenseImageUrl;

	/**
	 * 营业执照开始日期（年-月-日）
	 */
	@ApiField("enterprise_license_start_date")
	private String enterpriseLicenseStartDate;

	/**
	 * 企业名称
	 */
	@ApiField("enterprise_name")
	private String enterpriseName;

	/**
	 * 企业上一次认证成功时的日期时间
	 */
	@ApiField("gmt_authentication_success")
	private Date gmtAuthenticationSuccess;

	/**
	 * 法人手机号
	 */
	@ApiField("legal_person_cellphone")
	private String legalPersonCellphone;

	/**
	 * 法人身份证有效期，到期日期（年-月-日）
	 */
	@ApiField("legal_person_cert_expire_date")
	private String legalPersonCertExpireDate;

	/**
	 * 法人身份证号码
	 */
	@ApiField("legal_person_cert_no")
	private String legalPersonCertNo;

	/**
	 * 法人身份证有效期开始日期（年-月-日）
	 */
	@ApiField("legal_person_cert_start_date")
	private String legalPersonCertStartDate;

	/**
	 * 法人身份证国徽面图片
	 */
	@ApiField("legal_person_emblem_cert_image_url")
	private String legalPersonEmblemCertImageUrl;

	/**
	 * 法人证件照人像面
	 */
	@ApiField("legal_person_face_cert_image_url")
	private String legalPersonFaceCertImageUrl;

	/**
	 * 法人姓名
	 */
	@ApiField("legal_person_name")
	private String legalPersonName;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 认证的企业类型
	 */
	@ApiField("org_type")
	private String orgType;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 商户ID
	 */
	@ApiField("partner_open_id")
	private String partnerOpenId;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("unified_social_credit_code")
	private String unifiedSocialCreditCode;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getAgentPersonCellphone() {
		return this.agentPersonCellphone;
	}
	public void setAgentPersonCellphone(String agentPersonCellphone) {
		this.agentPersonCellphone = agentPersonCellphone;
	}

	public String getAgentPersonCertExpireDate() {
		return this.agentPersonCertExpireDate;
	}
	public void setAgentPersonCertExpireDate(String agentPersonCertExpireDate) {
		this.agentPersonCertExpireDate = agentPersonCertExpireDate;
	}

	public String getAgentPersonCertNo() {
		return this.agentPersonCertNo;
	}
	public void setAgentPersonCertNo(String agentPersonCertNo) {
		this.agentPersonCertNo = agentPersonCertNo;
	}

	public String getAgentPersonCertStartDate() {
		return this.agentPersonCertStartDate;
	}
	public void setAgentPersonCertStartDate(String agentPersonCertStartDate) {
		this.agentPersonCertStartDate = agentPersonCertStartDate;
	}

	public String getAgentPersonEmblemCertImageUrl() {
		return this.agentPersonEmblemCertImageUrl;
	}
	public void setAgentPersonEmblemCertImageUrl(String agentPersonEmblemCertImageUrl) {
		this.agentPersonEmblemCertImageUrl = agentPersonEmblemCertImageUrl;
	}

	public String getAgentPersonFaceCertImageUrl() {
		return this.agentPersonFaceCertImageUrl;
	}
	public void setAgentPersonFaceCertImageUrl(String agentPersonFaceCertImageUrl) {
		this.agentPersonFaceCertImageUrl = agentPersonFaceCertImageUrl;
	}

	public String getAgentPersonName() {
		return this.agentPersonName;
	}
	public void setAgentPersonName(String agentPersonName) {
		this.agentPersonName = agentPersonName;
	}

	public String getAppid() {
		return this.appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getAuthStatus() {
		return this.authStatus;
	}
	public void setAuthStatus(String authStatus) {
		this.authStatus = authStatus;
	}

	public String getCertificationResult() {
		return this.certificationResult;
	}
	public void setCertificationResult(String certificationResult) {
		this.certificationResult = certificationResult;
	}

	public String getCertificationType() {
		return this.certificationType;
	}
	public void setCertificationType(String certificationType) {
		this.certificationType = certificationType;
	}

	public String getEnterpriseAddress() {
		return this.enterpriseAddress;
	}
	public void setEnterpriseAddress(String enterpriseAddress) {
		this.enterpriseAddress = enterpriseAddress;
	}

	public String getEnterpriseLicenseExpireDate() {
		return this.enterpriseLicenseExpireDate;
	}
	public void setEnterpriseLicenseExpireDate(String enterpriseLicenseExpireDate) {
		this.enterpriseLicenseExpireDate = enterpriseLicenseExpireDate;
	}

	public String getEnterpriseLicenseImageUrl() {
		return this.enterpriseLicenseImageUrl;
	}
	public void setEnterpriseLicenseImageUrl(String enterpriseLicenseImageUrl) {
		this.enterpriseLicenseImageUrl = enterpriseLicenseImageUrl;
	}

	public String getEnterpriseLicenseStartDate() {
		return this.enterpriseLicenseStartDate;
	}
	public void setEnterpriseLicenseStartDate(String enterpriseLicenseStartDate) {
		this.enterpriseLicenseStartDate = enterpriseLicenseStartDate;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public Date getGmtAuthenticationSuccess() {
		return this.gmtAuthenticationSuccess;
	}
	public void setGmtAuthenticationSuccess(Date gmtAuthenticationSuccess) {
		this.gmtAuthenticationSuccess = gmtAuthenticationSuccess;
	}

	public String getLegalPersonCellphone() {
		return this.legalPersonCellphone;
	}
	public void setLegalPersonCellphone(String legalPersonCellphone) {
		this.legalPersonCellphone = legalPersonCellphone;
	}

	public String getLegalPersonCertExpireDate() {
		return this.legalPersonCertExpireDate;
	}
	public void setLegalPersonCertExpireDate(String legalPersonCertExpireDate) {
		this.legalPersonCertExpireDate = legalPersonCertExpireDate;
	}

	public String getLegalPersonCertNo() {
		return this.legalPersonCertNo;
	}
	public void setLegalPersonCertNo(String legalPersonCertNo) {
		this.legalPersonCertNo = legalPersonCertNo;
	}

	public String getLegalPersonCertStartDate() {
		return this.legalPersonCertStartDate;
	}
	public void setLegalPersonCertStartDate(String legalPersonCertStartDate) {
		this.legalPersonCertStartDate = legalPersonCertStartDate;
	}

	public String getLegalPersonEmblemCertImageUrl() {
		return this.legalPersonEmblemCertImageUrl;
	}
	public void setLegalPersonEmblemCertImageUrl(String legalPersonEmblemCertImageUrl) {
		this.legalPersonEmblemCertImageUrl = legalPersonEmblemCertImageUrl;
	}

	public String getLegalPersonFaceCertImageUrl() {
		return this.legalPersonFaceCertImageUrl;
	}
	public void setLegalPersonFaceCertImageUrl(String legalPersonFaceCertImageUrl) {
		this.legalPersonFaceCertImageUrl = legalPersonFaceCertImageUrl;
	}

	public String getLegalPersonName() {
		return this.legalPersonName;
	}
	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrgType() {
		return this.orgType;
	}
	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPartnerOpenId() {
		return this.partnerOpenId;
	}
	public void setPartnerOpenId(String partnerOpenId) {
		this.partnerOpenId = partnerOpenId;
	}

	public String getUnifiedSocialCreditCode() {
		return this.unifiedSocialCreditCode;
	}
	public void setUnifiedSocialCreditCode(String unifiedSocialCreditCode) {
		this.unifiedSocialCreditCode = unifiedSocialCreditCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
