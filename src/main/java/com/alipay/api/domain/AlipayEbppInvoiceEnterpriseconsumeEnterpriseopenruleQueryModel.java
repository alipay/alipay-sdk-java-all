package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票规则查询
 *
 * @author auto create
 * @since 1.0, 2021-09-24 18:19:14
 */
public class AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7773587499896719525L;

	/**
	 * 企业签约企业合花ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 开票规则id
	 */
	@ApiField("invoice_rule_id")
	private String invoiceRuleId;

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

	public String getInvoiceRuleId() {
		return this.invoiceRuleId;
	}
	public void setInvoiceRuleId(String invoiceRuleId) {
		this.invoiceRuleId = invoiceRuleId;
	}

}
