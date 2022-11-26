package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票规则新增接口
 *
 * @author auto create
 * @since 1.0, 2022-08-17 13:54:24
 */
public class AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4745615493811542518L;

	/**
	 * 共同账户id
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
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

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

	/**
	 * 开票规则标记： DEFAULT-默认 EMPLOYEE_TITLE_FIRST-员工签约抬头优先于开票规则
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
