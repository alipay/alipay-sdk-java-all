package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店信息
 *
 * @author auto create
 * @since 1.0, 2026-01-23 14:41:45
 */
public class LifeServiceShopInfo extends AlipayObject {

	private static final long serialVersionUID = 4677549695638848397L;

	/**
	 * 商家门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 商家门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}
