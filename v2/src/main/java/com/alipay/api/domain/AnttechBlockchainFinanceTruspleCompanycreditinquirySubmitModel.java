package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业征信查询服务
 *
 * @author auto create
 * @since 1.0, 2022-10-10 13:48:49
 */
public class AnttechBlockchainFinanceTruspleCompanycreditinquirySubmitModel extends AlipayObject {

	private static final long serialVersionUID = 3815446295991795221L;

	/**
	 * 资料附件列表
	 */
	@ApiListField("attachments")
	@ApiField("fin_attachment")
	private List<FinAttachment> attachments;

	/**
	 * 被查人证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 被查企业证件类型,NATIONAL_LEGAL 全国法人营业执照;
NATIONAL_LEGAL_MERGE 全国法人营业执照-多证合一
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 被查企业英文名
	 */
	@ApiField("company_english_name")
	private String companyEnglishName;

	/**
	 * 被查企业名称
	 */
	@ApiField("company_name")
	private String companyName;

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
	 * 查询原因
	 */
	@ApiField("inquiry_reason")
	private String inquiryReason;

	/**
	 * 查询模板
	 */
	@ApiField("inquiry_template")
	private String inquiryTemplate;

	/**
	 * 机构代码
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 查询请求唯一标识
	 */
	@ApiField("request_id")
	private String requestId;

	public List<FinAttachment> getAttachments() {
		return this.attachments;
	}
	public void setAttachments(List<FinAttachment> attachments) {
		this.attachments = attachments;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getCompanyEnglishName() {
		return this.companyEnglishName;
	}
	public void setCompanyEnglishName(String companyEnglishName) {
		this.companyEnglishName = companyEnglishName;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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

	public String getInquiryReason() {
		return this.inquiryReason;
	}
	public void setInquiryReason(String inquiryReason) {
		this.inquiryReason = inquiryReason;
	}

	public String getInquiryTemplate() {
		return this.inquiryTemplate;
	}
	public void setInquiryTemplate(String inquiryTemplate) {
		this.inquiryTemplate = inquiryTemplate;
	}

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
