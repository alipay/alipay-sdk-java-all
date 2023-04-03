package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 个人征信查询
 *
 * @author auto create
 * @since 1.0, 2022-10-10 13:49:14
 */
public class AnttechBlockchainFinanceTrusplePersoncreditinquirySubmitModel extends AlipayObject {

	private static final long serialVersionUID = 8537443564919918365L;

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
	 * 被查人证件类型，RESIDENT 居民身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 被查人姓名
	 */
	@ApiField("customer_name")
	private String customerName;

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
	 * 合作伙伴个人征信查询id，业务幂等字段
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

	public String getCustomerName() {
		return this.customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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
