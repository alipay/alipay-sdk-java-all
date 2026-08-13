package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票规则新增接口
 *
 * @author auto create
 * @since 1.0, 2026-07-31 14:56:59
 */
public class AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6461461817365411313L;

	/**
	 * 共同账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 账期结束日期
	 */
	@ApiField("bill_month_day")
	private Long billMonthDay;

	/**
	 * 开票账单范围
	 */
	@ApiField("bill_scope")
	private String billScope;

	/**
	 * 组合支付模式
	 */
	@ApiField("combined_pay_mode")
	private String combinedPayMode;

	/**
	 * 默认开票类型
	 */
	@ApiField("default_invoice_kind")
	private String defaultInvoiceKind;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

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
	 * 开票模式
	 */
	@ApiField("open_mode")
	private String openMode;

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

	/**
	 * 开票规则标记
	 */
	@ApiField("tag")
	private String tag;

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

	public Long getBillMonthDay() {
		return this.billMonthDay;
	}
	public void setBillMonthDay(Long billMonthDay) {
		this.billMonthDay = billMonthDay;
	}

	public String getBillScope() {
		return this.billScope;
	}
	public void setBillScope(String billScope) {
		this.billScope = billScope;
	}

	public String getCombinedPayMode() {
		return this.combinedPayMode;
	}
	public void setCombinedPayMode(String combinedPayMode) {
		this.combinedPayMode = combinedPayMode;
	}

	public String getDefaultInvoiceKind() {
		return this.defaultInvoiceKind;
	}
	public void setDefaultInvoiceKind(String defaultInvoiceKind) {
		this.defaultInvoiceKind = defaultInvoiceKind;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
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

	public String getOpenMode() {
		return this.openMode;
	}
	public void setOpenMode(String openMode) {
		this.openMode = openMode;
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

	public String getTag() {
		return this.tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}

}
