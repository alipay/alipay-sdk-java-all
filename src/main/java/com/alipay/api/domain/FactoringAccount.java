package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账户信息模型
 *
 * @author auto create
 * @since 1.0, 2017-09-07 21:00:46
 */
public class FactoringAccount extends AlipayObject {

	private static final long serialVersionUID = 4848637555936795345L;

	/**
	 * 账号外标，如支付宝登录号
	 */
	@ApiField("account_ext_no")
	private String accountExtNo;

	/**
	 * 金融机构码
	 */
	@ApiField("account_fip_code")
	private String accountFipCode;

	/**
	 * 金融机构名称
	 */
	@ApiField("account_fip_name")
	private String accountFipName;

	/**
	 * 账户名称，如银行账户名,支付宝手机号、email
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 资金账号,支付宝2088开头或银行卡号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * ALIPAY("ALIPAY", "Alipay", "支付宝账号", "支付宝账号"),CURRENT("CURRENT", "MayiBank", "网商银行账号", "网商银行账号"),OUT_BANK("OUT_BANK", "OutBank", "外部银行账号", "外部银行账号")
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 账户对公对私类型,P-对私，B-对公
	 */
	@ApiField("bank_card_category")
	private String bankCardCategory;

	/**
	 * 持卡人姓名
	 */
	@ApiField("card_holder_name")
	private String cardHolderName;

	public String getAccountExtNo() {
		return this.accountExtNo;
	}
	public void setAccountExtNo(String accountExtNo) {
		this.accountExtNo = accountExtNo;
	}

	public String getAccountFipCode() {
		return this.accountFipCode;
	}
	public void setAccountFipCode(String accountFipCode) {
		this.accountFipCode = accountFipCode;
	}

	public String getAccountFipName() {
		return this.accountFipName;
	}
	public void setAccountFipName(String accountFipName) {
		this.accountFipName = accountFipName;
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

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBankCardCategory() {
		return this.bankCardCategory;
	}
	public void setBankCardCategory(String bankCardCategory) {
		this.bankCardCategory = bankCardCategory;
	}

	public String getCardHolderName() {
		return this.cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

}
