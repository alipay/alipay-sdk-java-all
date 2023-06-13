package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账号信息
 *
 * @author auto create
 * @since 1.0, 2023-01-13 16:09:12
 */
public class MyBkAccountVO extends AlipayObject {

	private static final long serialVersionUID = 4847564844256128587L;

	/**
	 * 账号外标，如支付宝登录号
	 */
	@ApiField("account_ext_no")
	private String accountExtNo;

	/**
	 * 金融机构支行联行号
	 */
	@ApiField("account_fip_branch_code")
	private String accountFipBranchCode;

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
	 * 资金账号,支付宝2088开头或银行卡号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 账号分类，ALIPAY("ALIPAY", "Alipay", "支付宝账号", "支付宝账号"),MY_BANK("MY_BANK", "MayiBank", "网商银行账号", "网商银行账号"),OUT_BANK("OUT_BANK", "OutBank", "外部银行账号", "外部银行账号")
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * OpenId是某个用户在某个应用下的唯一用户标识， 对于同一个用户，不同应用拿到的OpenId是不同的，而且对于同一个应用，不同用户的OpenId是唯一的
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 是否可用，Y-可用；N-不可用
	 */
	@ApiField("available")
	private String available;

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

	/**
	 * 放款来源
	 */
	@ApiField("grant_channel")
	private String grantChannel;

	/**
	 * 账户不可用原因
	 */
	@ApiField("refuse_code")
	private String refuseCode;

	public String getAccountExtNo() {
		return this.accountExtNo;
	}
	public void setAccountExtNo(String accountExtNo) {
		this.accountExtNo = accountExtNo;
	}

	public String getAccountFipBranchCode() {
		return this.accountFipBranchCode;
	}
	public void setAccountFipBranchCode(String accountFipBranchCode) {
		this.accountFipBranchCode = accountFipBranchCode;
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

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAvailable() {
		return this.available;
	}
	public void setAvailable(String available) {
		this.available = available;
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

	public String getGrantChannel() {
		return this.grantChannel;
	}
	public void setGrantChannel(String grantChannel) {
		this.grantChannel = grantChannel;
	}

	public String getRefuseCode() {
		return this.refuseCode;
	}
	public void setRefuseCode(String refuseCode) {
		this.refuseCode = refuseCode;
	}

}
