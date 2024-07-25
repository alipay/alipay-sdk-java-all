package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 新增开票规则绑定费控规则
 *
 * @author auto create
 * @since 1.0, 2024-02-21 14:34:14
 */
public class AlipayEbppInvoiceEnterpriseconsumeOpenrulerelationCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1885266113984394616L;

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
	 * 费控规则ID列表
	 */
	@ApiListField("standard_id_list")
	@ApiField("string")
	private List<String> standardIdList;

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

	public List<String> getStandardIdList() {
		return this.standardIdList;
	}
	public void setStandardIdList(List<String> standardIdList) {
		this.standardIdList = standardIdList;
	}

}
