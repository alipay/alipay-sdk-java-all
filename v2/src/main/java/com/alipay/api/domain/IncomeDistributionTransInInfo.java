package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收益分配规则创建申请，转入方信息。
仅用于入参
 *
 * @author auto create
 * @since 1.0, 2023-06-28 20:54:46
 */
public class IncomeDistributionTransInInfo extends AlipayObject {

	private static final long serialVersionUID = 8245174222834263143L;

	/**
	 * 收益分配的百分比数值，支持2位小数
	 */
	@ApiField("allocate_rate")
	private String allocateRate;

	/**
	 * 收款方类型为「03-外部银行账户」时必填
	 */
	@ApiField("bank_branch_code")
	private String bankBranchCode;

	/**
	 * 收款方类型为「03-外部银行账户」时必填.
	 */
	@ApiField("bank_branch_name")
	private String bankBranchName;

	/**
	 * 收款方类型为「04-标准数币钱包」时必填
C1010211000012 工行
C1010311000014 衣行
C1010411000013 中行
C1010511003703 建行
Z2004944000010 腾讯-财付通
C1302533000018 浙江网商银行
C1040311005293 邮储
C1030131001288 交通银行
C1030844001362 招行
C1030935001347 兴业银行
	 */
	@ApiField("digit_currency_inst")
	private String digitCurrencyInst;

	/**
	 * 当收款方类型为「01-子户/子钱包」时，需填写子户（子钱包）ID
当收款方账户类型为「02-支付宝」时，为支付宝身份标识id
当收款方账户类型为「03-外部银行账户」时，为银行账户账号
当收款方账户类型为「04-标准数币钱包」时，为数币钱包id
	 */
	@ApiField("trans_in_account_no")
	private String transInAccountNo;

	/**
	 * 当收款方账户类型
01-子户/子钱包
02-支付宝账户
03-外部银行账户
04-标准数币钱包
	 */
	@ApiField("trans_in_account_type")
	private String transInAccountType;

	/**
	 * 收款方证件号，如企业证件号码
	 */
	@ApiField("trans_in_cert_no")
	private String transInCertNo;

	/**
	 * 证件类型。
01-统一社会信用编码
02-居民身份证
	 */
	@ApiField("trans_in_cert_type")
	private String transInCertType;

	/**
	 * 收益分配收款方，需和证件号、收款账户对应名称一致
	 */
	@ApiField("trans_in_name")
	private String transInName;

	public String getAllocateRate() {
		return this.allocateRate;
	}
	public void setAllocateRate(String allocateRate) {
		this.allocateRate = allocateRate;
	}

	public String getBankBranchCode() {
		return this.bankBranchCode;
	}
	public void setBankBranchCode(String bankBranchCode) {
		this.bankBranchCode = bankBranchCode;
	}

	public String getBankBranchName() {
		return this.bankBranchName;
	}
	public void setBankBranchName(String bankBranchName) {
		this.bankBranchName = bankBranchName;
	}

	public String getDigitCurrencyInst() {
		return this.digitCurrencyInst;
	}
	public void setDigitCurrencyInst(String digitCurrencyInst) {
		this.digitCurrencyInst = digitCurrencyInst;
	}

	public String getTransInAccountNo() {
		return this.transInAccountNo;
	}
	public void setTransInAccountNo(String transInAccountNo) {
		this.transInAccountNo = transInAccountNo;
	}

	public String getTransInAccountType() {
		return this.transInAccountType;
	}
	public void setTransInAccountType(String transInAccountType) {
		this.transInAccountType = transInAccountType;
	}

	public String getTransInCertNo() {
		return this.transInCertNo;
	}
	public void setTransInCertNo(String transInCertNo) {
		this.transInCertNo = transInCertNo;
	}

	public String getTransInCertType() {
		return this.transInCertType;
	}
	public void setTransInCertType(String transInCertType) {
		this.transInCertType = transInCertType;
	}

	public String getTransInName() {
		return this.transInName;
	}
	public void setTransInName(String transInName) {
		this.transInName = transInName;
	}

}
