package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺VO
 *
 * @author auto create
 * @since 1.0, 2024-06-04 20:14:01
 */
public class ShopVO extends AlipayObject {

	private static final long serialVersionUID = 7772986187226538939L;

	/**
	 * 店铺状态
	 */
	@ApiField("auth_state")
	private String authState;

	/**
	 * 采购方id
	 */
	@ApiField("purchaser_id")
	private String purchaserId;

	/**
	 * 店铺编码
	 */
	@ApiField("shop_code")
	private String shopCode;

	/**
	 * 店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	public String getAuthState() {
		return this.authState;
	}
	public void setAuthState(String authState) {
		this.authState = authState;
	}

	public String getPurchaserId() {
		return this.purchaserId;
	}
	public void setPurchaserId(String purchaserId) {
		this.purchaserId = purchaserId;
	}

	public String getShopCode() {
		return this.shopCode;
	}
	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}
