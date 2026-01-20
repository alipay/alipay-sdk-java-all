package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店信息
 *
 * @author auto create
 * @since 1.0, 2025-12-15 23:21:38
 */
public class InteOpShopInfoVO extends AlipayObject {

	private static final long serialVersionUID = 2733498199621584769L;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
