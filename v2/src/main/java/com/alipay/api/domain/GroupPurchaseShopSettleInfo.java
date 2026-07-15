package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店结算信息
 *
 * @author auto create
 * @since 1.0, 2026-07-01 19:41:54
 */
public class GroupPurchaseShopSettleInfo extends AlipayObject {

	private static final long serialVersionUID = 8632965627125197533L;

	/**
	 * 结算到户的账号
	 */
	@ApiField("account")
	private String account;

	/**
	 * 店铺银行卡信息
	 */
	@ApiField("bank_card")
	private GroupPurchaseBankCard bankCard;

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

	public GroupPurchaseBankCard getBankCard() {
		return this.bankCard;
	}
	public void setBankCard(GroupPurchaseBankCard bankCard) {
		this.bankCard = bankCard;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
