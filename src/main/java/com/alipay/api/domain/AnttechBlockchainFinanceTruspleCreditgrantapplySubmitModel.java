package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 贸易金融授信申请
 *
 * @author auto create
 * @since 1.0, 2021-11-09 14:10:26
 */
public class AnttechBlockchainFinanceTruspleCreditgrantapplySubmitModel extends AlipayObject {

	private static final long serialVersionUID = 7517897725919671845L;

	/**
	 * 资料附件列表
	 */
	@ApiListField("attachments")
	@ApiField("fin_attachment")
	private List<FinAttachment> attachments;

	/**
	 * 借款人类型
	 */
	@ApiField("borrower_type")
	private String borrowerType;

	/**
	 * 关联的企业征信查询ID
	 */
	@ApiField("company_credit_inquiry_request_id")
	private String companyCreditInquiryRequestId;

	/**
	 * 企业信息
	 */
	@ApiField("company_info")
	private CompanyInformation companyInfo;

	/**
	 * 扩展字段JSON String，address，occupation等字段放入扩展字段中（备注：只涉及数据的接收，不涉及到蚂蚁数据的输出））
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 外部合作伙伴的授信申请编号
	 */
	@ApiField("external_credit_grant_id")
	private String externalCreditGrantId;

	/**
	 * 外部产品码
	 */
	@ApiField("external_product_code")
	private String externalProductCode;

	/**
	 * 被查用户的外部用户唯一标识
	 */
	@ApiField("external_user_id")
	private String externalUserId;

	/**
	 * 机构代码
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 法人信息
	 */
	@ApiField("legal_person_info")
	private PersonInfo legalPersonInfo;

	/**
	 * 关联的个人征信查询ID
	 */
	@ApiField("personal_credit_inquiry_request_id")
	private String personalCreditInquiryRequestId;

	/**
	 * 额度分项明细
	 */
	@ApiListField("quota_details")
	@ApiField("credit_quota_detail")
	private List<CreditQuotaDetail> quotaDetails;

	/**
	 * 风控变量（备注：只涉及数据的接收，不涉及到蚂蚁数据的输出）
	 */
	@ApiField("risk_info")
	private String riskInfo;

	public List<FinAttachment> getAttachments() {
		return this.attachments;
	}
	public void setAttachments(List<FinAttachment> attachments) {
		this.attachments = attachments;
	}

	public String getBorrowerType() {
		return this.borrowerType;
	}
	public void setBorrowerType(String borrowerType) {
		this.borrowerType = borrowerType;
	}

	public String getCompanyCreditInquiryRequestId() {
		return this.companyCreditInquiryRequestId;
	}
	public void setCompanyCreditInquiryRequestId(String companyCreditInquiryRequestId) {
		this.companyCreditInquiryRequestId = companyCreditInquiryRequestId;
	}

	public CompanyInformation getCompanyInfo() {
		return this.companyInfo;
	}
	public void setCompanyInfo(CompanyInformation companyInfo) {
		this.companyInfo = companyInfo;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getExternalCreditGrantId() {
		return this.externalCreditGrantId;
	}
	public void setExternalCreditGrantId(String externalCreditGrantId) {
		this.externalCreditGrantId = externalCreditGrantId;
	}

	public String getExternalProductCode() {
		return this.externalProductCode;
	}
	public void setExternalProductCode(String externalProductCode) {
		this.externalProductCode = externalProductCode;
	}

	public String getExternalUserId() {
		return this.externalUserId;
	}
	public void setExternalUserId(String externalUserId) {
		this.externalUserId = externalUserId;
	}

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public PersonInfo getLegalPersonInfo() {
		return this.legalPersonInfo;
	}
	public void setLegalPersonInfo(PersonInfo legalPersonInfo) {
		this.legalPersonInfo = legalPersonInfo;
	}

	public String getPersonalCreditInquiryRequestId() {
		return this.personalCreditInquiryRequestId;
	}
	public void setPersonalCreditInquiryRequestId(String personalCreditInquiryRequestId) {
		this.personalCreditInquiryRequestId = personalCreditInquiryRequestId;
	}

	public List<CreditQuotaDetail> getQuotaDetails() {
		return this.quotaDetails;
	}
	public void setQuotaDetails(List<CreditQuotaDetail> quotaDetails) {
		this.quotaDetails = quotaDetails;
	}

	public String getRiskInfo() {
		return this.riskInfo;
	}
	public void setRiskInfo(String riskInfo) {
		this.riskInfo = riskInfo;
	}

}
