package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结算条款信息
 *
 * @author auto create
 * @since 1.0, 2020-04-21 19:49:56
 */
public class SettleClause extends AlipayObject {

	private static final long serialVersionUID = 2477842189485839138L;

	/**
	 * 结算金额，单位为元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 结算币种，支持人民币：CNY
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 结算账号所属于的结算主体类型。
secondMerchant 二级商户的结算账号
store 门店的结算账号
如果不填，默认为settleEntityType对应的类型
	 */
	@ApiField("settle_account_entity")
	private String settleAccountEntity;

	/**
	 * 结算账户id。

当结算账户id类型是cardSerialNo时，本参数为用户在支付宝绑定的卡编号；当结算账户id类型是userId时，本参数为用户的支付宝账号对应的支付宝唯一用户号；当结算账户id类型是loginName时，本参数为用户的支付宝登录号; 当 settle_account_type 为defaultSettle时，本参数必须为空
	 */
	@ApiField("settle_account_id")
	private String settleAccountId;

	/**
	 * 结算账户id类型。 
当settle_account_type 为bankCard时，本参数为cardSerialNo，表示结算账户id是银行卡编号; 当settle_account_type 为alipayBalance时，本参数为userId或者loginName，其中userId表示结算账户id是支付宝唯一用户号，loginName表示结算账户id是支付宝登录号; 当 settle_account_type 为 defaultSettle 时，本参数必须为空
	 */
	@ApiField("settle_account_id_type")
	private String settleAccountIdType;

	/**
	 * 结算账户类型。

bankCard: 结算账户为银行卡；
alipayBalance: 结算账户为支付宝余额户；
defaultSettle: 按默认结算规则结算
	 */
	@ApiField("settle_account_type")
	private String settleAccountType;

	/**
	 * 结算主体账号。
当结算主体类型为SecondMerchant，本参数为二级商户的SecondMerchantID
	 */
	@ApiField("settle_entity_id")
	private String settleEntityId;

	/**
	 * 结算主体类型。
SecondMerchant：结算主体为二级商户
	 */
	@ApiField("settle_entity_type")
	private String settleEntityType;

	/**
	 * 二级商户信息
	 */
	@ApiField("sub_merchant")
	private SubMerchant subMerchant;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getSettleAccountEntity() {
		return this.settleAccountEntity;
	}
	public void setSettleAccountEntity(String settleAccountEntity) {
		this.settleAccountEntity = settleAccountEntity;
	}

	public String getSettleAccountId() {
		return this.settleAccountId;
	}
	public void setSettleAccountId(String settleAccountId) {
		this.settleAccountId = settleAccountId;
	}

	public String getSettleAccountIdType() {
		return this.settleAccountIdType;
	}
	public void setSettleAccountIdType(String settleAccountIdType) {
		this.settleAccountIdType = settleAccountIdType;
	}

	public String getSettleAccountType() {
		return this.settleAccountType;
	}
	public void setSettleAccountType(String settleAccountType) {
		this.settleAccountType = settleAccountType;
	}

	public String getSettleEntityId() {
		return this.settleEntityId;
	}
	public void setSettleEntityId(String settleEntityId) {
		this.settleEntityId = settleEntityId;
	}

	public String getSettleEntityType() {
		return this.settleEntityType;
	}
	public void setSettleEntityType(String settleEntityType) {
		this.settleEntityType = settleEntityType;
	}

	public SubMerchant getSubMerchant() {
		return this.subMerchant;
	}
	public void setSubMerchant(SubMerchant subMerchant) {
		this.subMerchant = subMerchant;
	}

}
