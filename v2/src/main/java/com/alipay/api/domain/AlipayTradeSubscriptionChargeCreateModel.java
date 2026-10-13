package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订阅收费创建
 *
 * @author auto create
 * @since 1.0, 2026-10-08 16:42:58
 */
public class AlipayTradeSubscriptionChargeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1747169478154169834L;

	/**
	 * 收费类型
	 */
	@ApiField("charge_type")
	private String chargeType;

	/**
	 * 订阅项id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 订阅id
	 */
	@ApiField("subscription_id")
	private String subscriptionId;

	public String getChargeType() {
		return this.chargeType;
	}
	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getSubscriptionId() {
		return this.subscriptionId;
	}
	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

}
