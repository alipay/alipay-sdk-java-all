package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过该接口可以查询商户录入的指定商品详细信息
 *
 * @author auto create
 * @since 1.0, 2024-07-04 17:00:58
 */
public class AlipayOfflineMarketProductQuerydetailModel extends AlipayObject {

	private static final long serialVersionUID = 6513583861188238366L;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 操作人角色，默认商户操作:MERCHANT；服务商操作：PROVIDER。支付宝内部使用，外部商户不需填写此字段。
	 */
	@ApiField("op_role")
	private String opRole;

	/**
	 * 门店ID。支付宝内部使用，外部商户不需填写此字段。
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOpRole() {
		return this.opRole;
	}
	public void setOpRole(String opRole) {
		this.opRole = opRole;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
