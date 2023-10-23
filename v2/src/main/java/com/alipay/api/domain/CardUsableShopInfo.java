package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡可使用门店信息
 *
 * @author auto create
 * @since 1.0, 2023-10-20 10:55:43
 */
public class CardUsableShopInfo extends AlipayObject {

	private static final long serialVersionUID = 8813217666643226268L;

	/**
	 * 门店ID
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
