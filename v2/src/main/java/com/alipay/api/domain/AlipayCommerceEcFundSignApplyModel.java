package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账户签约申请
 *
 * @author auto create
 * @since 1.0, 2025-11-03 10:39:16
 */
public class AlipayCommerceEcFundSignApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3439675294533466274L;

	/**
	 * 企业因公代付的资金账户
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 系统自动生成企业唯一标识
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 出资账户类型 当前字段已废弃(请使用fund_source与account_type)
	 */
	@ApiField("fund_account_type")
	@Deprecated
	private String fundAccountType;

	/**
	 * 企业因公代付的资金来源
	 */
	@ApiField("fund_source")
	private String fundSource;

	/**
	 * 是否进行企业同人校验，检验信息为社会信用代码
默认开启
	 */
	@ApiField("identity_verify")
	private Boolean identityVerify;

	/**
	 * 签约终端类型
	 */
	@ApiField("sign_terminal")
	private String signTerminal;

	/**
	 * 签约人支付宝账号类型
	 */
	@ApiField("signer_category")
	private String signerCategory;

	/**
	 * 限定出资的银行卡号
	 */
	@ApiField("specified_bank_card_no")
	private String specifiedBankCardNo;

	/**
	 * 是否使用企业创建人支付宝账号出资
<br/>1、为true时表示选择企业创建人的支付宝账号出资
<br/>2、为false时表示选择企业其他支付宝账号，需登录账号进行授权
	 */
	@ApiField("use_creator_alipay_account")
	private Boolean useCreatorAlipayAccount;

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getFundAccountType() {
		return this.fundAccountType;
	}
	public void setFundAccountType(String fundAccountType) {
		this.fundAccountType = fundAccountType;
	}

	public String getFundSource() {
		return this.fundSource;
	}
	public void setFundSource(String fundSource) {
		this.fundSource = fundSource;
	}

	public Boolean getIdentityVerify() {
		return this.identityVerify;
	}
	public void setIdentityVerify(Boolean identityVerify) {
		this.identityVerify = identityVerify;
	}

	public String getSignTerminal() {
		return this.signTerminal;
	}
	public void setSignTerminal(String signTerminal) {
		this.signTerminal = signTerminal;
	}

	public String getSignerCategory() {
		return this.signerCategory;
	}
	public void setSignerCategory(String signerCategory) {
		this.signerCategory = signerCategory;
	}

	public String getSpecifiedBankCardNo() {
		return this.specifiedBankCardNo;
	}
	public void setSpecifiedBankCardNo(String specifiedBankCardNo) {
		this.specifiedBankCardNo = specifiedBankCardNo;
	}

	public Boolean getUseCreatorAlipayAccount() {
		return this.useCreatorAlipayAccount;
	}
	public void setUseCreatorAlipayAccount(Boolean useCreatorAlipayAccount) {
		this.useCreatorAlipayAccount = useCreatorAlipayAccount;
	}

}
