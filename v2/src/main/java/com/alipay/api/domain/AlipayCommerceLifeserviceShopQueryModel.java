package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店预约配置查询
 *
 * @author auto create
 * @since 1.0, 2026-07-14 11:27:52
 */
public class AlipayCommerceLifeserviceShopQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7229137873227873913L;

	/**
	 * 蚂蚁门店id
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
