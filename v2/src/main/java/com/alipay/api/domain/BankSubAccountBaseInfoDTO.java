package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行子账号详情
 *
 * @author auto create
 * @since 1.0, 2020-08-28 14:17:31
 */
public class BankSubAccountBaseInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4174369116122997362L;

	/**
	 * 主账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 用于收款交易的账号
	 */
	@ApiField("account_no_4_credit_transfer")
	private String accountNo4CreditTransfer;

	/**
	 * 账户所在两位国家代码
	 */
	@ApiField("country_code")
	private String countryCode;

	/**
	 * 主账号币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 全球化语言账户名称，一般为英文
	 */
	@ApiField("global_account_name")
	private String globalAccountName;

	/**
	 * 全球化语言银行名称
	 */
	@ApiField("global_bank_name")
	private String globalBankName;

	/**
	 * 全球化语言支行名称
	 */
	@ApiField("global_branch_name")
	private String globalBranchName;

	/**
	 * 全球化语言分行名称
	 */
	@ApiField("global_sub_bank_name")
	private String globalSubBankName;

	/**
	 * 当地语言的账户名
	 */
	@ApiField("local_account_name")
	private String localAccountName;

	/**
	 * 当地语言银行名称
	 */
	@ApiField("local_bank_name")
	private String localBankName;

	/**
	 * 当地语言用于交易的银行名称(通常为支行名称，当支行名称为空时取分行名称)
	 */
	@ApiField("local_bank_name_4_transfer")
	private String localBankName4Transfer;

	/**
	 * 当地语言支行名称
	 */
	@ApiField("local_branch_name")
	private String localBranchName;

	/**
	 * 当地语言分行名称
	 */
	@ApiField("local_sub_bank_name")
	private String localSubBankName;

	/**
	 * 全球化语言银行缩写
	 */
	@ApiField("out_fin_inst_abbreviation")
	private String outFinInstAbbreviation;

	/**
	 * 子账号，如：0000000001
	 */
	@ApiField("sub_account_no")
	private String subAccountNo;

	/**
	 * 归属业务类型，如：LIGHTS
	 */
	@ApiField("treasury_biz_type")
	private String treasuryBizType;

	/**
	 * 归属业务类型名称
	 */
	@ApiField("treasury_biz_type_name")
	private String treasuryBizTypeName;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountNo4CreditTransfer() {
		return this.accountNo4CreditTransfer;
	}
	public void setAccountNo4CreditTransfer(String accountNo4CreditTransfer) {
		this.accountNo4CreditTransfer = accountNo4CreditTransfer;
	}

	public String getCountryCode() {
		return this.countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getGlobalAccountName() {
		return this.globalAccountName;
	}
	public void setGlobalAccountName(String globalAccountName) {
		this.globalAccountName = globalAccountName;
	}

	public String getGlobalBankName() {
		return this.globalBankName;
	}
	public void setGlobalBankName(String globalBankName) {
		this.globalBankName = globalBankName;
	}

	public String getGlobalBranchName() {
		return this.globalBranchName;
	}
	public void setGlobalBranchName(String globalBranchName) {
		this.globalBranchName = globalBranchName;
	}

	public String getGlobalSubBankName() {
		return this.globalSubBankName;
	}
	public void setGlobalSubBankName(String globalSubBankName) {
		this.globalSubBankName = globalSubBankName;
	}

	public String getLocalAccountName() {
		return this.localAccountName;
	}
	public void setLocalAccountName(String localAccountName) {
		this.localAccountName = localAccountName;
	}

	public String getLocalBankName() {
		return this.localBankName;
	}
	public void setLocalBankName(String localBankName) {
		this.localBankName = localBankName;
	}

	public String getLocalBankName4Transfer() {
		return this.localBankName4Transfer;
	}
	public void setLocalBankName4Transfer(String localBankName4Transfer) {
		this.localBankName4Transfer = localBankName4Transfer;
	}

	public String getLocalBranchName() {
		return this.localBranchName;
	}
	public void setLocalBranchName(String localBranchName) {
		this.localBranchName = localBranchName;
	}

	public String getLocalSubBankName() {
		return this.localSubBankName;
	}
	public void setLocalSubBankName(String localSubBankName) {
		this.localSubBankName = localSubBankName;
	}

	public String getOutFinInstAbbreviation() {
		return this.outFinInstAbbreviation;
	}
	public void setOutFinInstAbbreviation(String outFinInstAbbreviation) {
		this.outFinInstAbbreviation = outFinInstAbbreviation;
	}

	public String getSubAccountNo() {
		return this.subAccountNo;
	}
	public void setSubAccountNo(String subAccountNo) {
		this.subAccountNo = subAccountNo;
	}

	public String getTreasuryBizType() {
		return this.treasuryBizType;
	}
	public void setTreasuryBizType(String treasuryBizType) {
		this.treasuryBizType = treasuryBizType;
	}

	public String getTreasuryBizTypeName() {
		return this.treasuryBizTypeName;
	}
	public void setTreasuryBizTypeName(String treasuryBizTypeName) {
		this.treasuryBizTypeName = treasuryBizTypeName;
	}

}
