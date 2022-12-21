package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家支付宝门店-小程序绑定关系
 *
 * @author auto create
 * @since 1.0, 2020-11-24 19:04:22
 */
public class ShopAppRelation extends AlipayObject {

	private static final long serialVersionUID = 6652244449866253821L;

	/**
	 * 支付宝门店ID，在支付宝商户平台维护的线下门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 待绑定的支付宝小程序ID
	 */
	@ApiField("store_app_id")
	private String storeAppId;

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStoreAppId() {
		return this.storeAppId;
	}
	public void setStoreAppId(String storeAppId) {
		this.storeAppId = storeAppId;
	}

}
