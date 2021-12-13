package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 新增开票规则绑定费控规则
 *
 * @author auto create
 * @since 1.0, 2021-12-08 20:29:09
 */
public class AlipayEbppInvoiceEnterpriseconsumeOpenrulerelationCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6453819498786654478L;

	/**
	 * 企业签约企业合花ID-共同账号ID
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

	/**
	 * 支付制度id列表
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
