package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行卡信息详情
 *
 * @author auto create
 * @since 1.0, 2021-03-05 13:51:33
 */
public class BankInfo extends AlipayObject {

	private static final long serialVersionUID = 1389844211849238587L;

	/**
	 * 用户交易账号的发卡机构id
	 */
	@ApiField("account_issue_entity_id")
	private String accountIssueEntityId;

	/**
	 * 用户交易账号的发卡机构名称
	 */
	@ApiField("account_issue_entity_name")
	private String accountIssueEntityName;

	/**
	 * 用户在支付机构的开户名称
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 用户在支付机构的账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 机构联行号
	 */
	@ApiField("bank_code")
	private String bankCode;

	public String getAccountIssueEntityId() {
		return this.accountIssueEntityId;
	}
	public void setAccountIssueEntityId(String accountIssueEntityId) {
		this.accountIssueEntityId = accountIssueEntityId;
	}

	public String getAccountIssueEntityName() {
		return this.accountIssueEntityName;
	}
	public void setAccountIssueEntityName(String accountIssueEntityName) {
		this.accountIssueEntityName = accountIssueEntityName;
	}

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getBankCode() {
		return this.bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

}
