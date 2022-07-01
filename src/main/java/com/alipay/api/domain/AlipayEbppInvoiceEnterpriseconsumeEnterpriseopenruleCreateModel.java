package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票规则新增接口
 *
 * @author auto create
 * @since 1.0, 2022-06-09 15:13:42
 */
public class AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8132253621564538818L;

	/**
	 * 企业ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 账期结束日期，可选范围1-31，只有汇总开需要
	 */
	@ApiField("bill_month_day")
	private Long billMonthDay;

	/**
	 * 开票规则名称
	 */
	@ApiField("invoice_rule_name")
	private String invoiceRuleName;

	/**
	 * 汇总开需要抬头，笔笔开不需要传抬头
	 */
	@ApiField("invoice_title_id")
	private String invoiceTitleId;

	/**
	 * 开票模式：汇总开、笔笔开
枚举定义：SUMMARY:汇总开
SINGLE:单笔开
	 */
	@ApiField("open_mode")
	private String openMode;

	/**
	 * 销方类型：TP开票、商户开票，
枚举定义：MERCHANT（商户）、TP（TP），不填默认商户
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

	public Long getBillMonthDay() {
		return this.billMonthDay;
	}
	public void setBillMonthDay(Long billMonthDay) {
		this.billMonthDay = billMonthDay;
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

	public String getSellerType() {
		return this.sellerType;
	}
	public void setSellerType(String sellerType) {
		this.sellerType = sellerType;
	}

}
