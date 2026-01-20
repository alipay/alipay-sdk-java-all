package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店结算信息
 *
 * @author auto create
 * @since 1.0, 2025-12-11 22:07:34
 */
public class ShopSettleInfo extends AlipayObject {

	private static final long serialVersionUID = 3586154291513273235L;

	/**
	 * 结算到户的账号
	 */
	@ApiField("account")
	private String account;

	/**
	 * 门店结算银行卡信息（特殊可选），结算到卡时必填
	 */
	@ApiField("bank_cards")
	private ShopBankCard bankCards;

	/**
	 * 结算类型
	 */
	@ApiField("type")
	private String type;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public ShopBankCard getBankCards() {
		return this.bankCards;
	}
	public void setBankCards(ShopBankCard bankCards) {
		this.bankCards = bankCards;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
