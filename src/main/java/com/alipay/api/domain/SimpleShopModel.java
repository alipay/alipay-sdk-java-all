package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑商家中心员工管理的商户门店信息简单模型，包括门店id，门店名称
 *
 * @author auto create
 * @since 1.0, 2018-03-23 11:31:55
 */
public class SimpleShopModel extends AlipayObject {

	private static final long serialVersionUID = 2536276363465753639L;

	/**
	 * 商户门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 商户门店名称
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
