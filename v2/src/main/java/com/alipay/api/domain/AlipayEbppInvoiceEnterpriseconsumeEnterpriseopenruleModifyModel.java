package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票规则修改
 *
 * @author auto create
 * @since 1.0, 2024-02-21 14:32:49
 */
public class AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5485867795985364932L;

	/**
	 * 企业共同账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 开票规则ID
	 */
	@ApiField("invoice_rule_id")
	private String invoiceRuleId;

	/**
	 * 开票规则名称
	 */
	@ApiField("invoice_rule_name")
	private String invoiceRuleName;

	/**
	 * 发票抬头
	 */
	@ApiField("invoice_title_id")
	private String invoiceTitleId;

	/**
	 * 收件人地址
	 */
	@ApiField("receive_address")
	private String receiveAddress;

	/**
	 * 收件人姓名
	 */
	@ApiField("receive_name")
	private String receiveName;

	/**
	 * 收件人手机号
	 */
	@ApiField("receive_phone")
	private String receivePhone;

	/**
	 * 销方类型
	 */
	@ApiField("seller_type")
	private String sellerType;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getInvoiceRuleId() {
		return this.invoiceRuleId;
	}
	public void setInvoiceRuleId(String invoiceRuleId) {
		this.invoiceRuleId = invoiceRuleId;
	}

	public String getInvoiceRuleName() {
		return this.invoiceRuleName;
	}
	public void setInvoiceRuleName(String invoiceRuleName) {
		this.invoiceRuleName = invoiceRuleName;
	}

	public String getInvoiceTitleId() {
		return this.invoiceTitleId;
	}
	public void setInvoiceTitleId(String invoiceTitleId) {
		this.invoiceTitleId = invoiceTitleId;
	}

	public String getReceiveAddress() {
		return this.receiveAddress;
	}
	public void setReceiveAddress(String receiveAddress) {
		this.receiveAddress = receiveAddress;
	}

	public String getReceiveName() {
		return this.receiveName;
	}
	public void setReceiveName(String receiveName) {
		this.receiveName = receiveName;
	}

	public String getReceivePhone() {
		return this.receivePhone;
	}
	public void setReceivePhone(String receivePhone) {
		this.receivePhone = receivePhone;
	}

	public String getSellerType() {
		return this.sellerType;
	}
	public void setSellerType(String sellerType) {
		this.sellerType = sellerType;
	}

}
