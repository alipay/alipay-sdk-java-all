package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-28 14:42:50
 */
public class LifeServiceAccountInfo extends AlipayObject {

	private static final long serialVersionUID = 3686446285855786542L;

	/**
	 * 账户状态
	 */
	@ApiField("account_status")
	private String accountStatus;

	/**
	 * 结算账号
	 */
	@ApiField("settle_account_id")
	private String settleAccountId;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getAccountStatus() {
		return this.accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getSettleAccountId() {
		return this.settleAccountId;
	}
	public void setSettleAccountId(String settleAccountId) {
		this.settleAccountId = settleAccountId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
