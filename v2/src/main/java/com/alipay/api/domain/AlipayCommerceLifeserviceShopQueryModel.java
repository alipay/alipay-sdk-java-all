package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店预约配置查询
 *
 * @author auto create
 * @since 1.0, 2026-01-26 15:47:43
 */
public class AlipayCommerceLifeserviceShopQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2752335637122566885L;

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
