package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询门店档口列表
 *
 * @author auto create
 * @since 1.0, 2018-12-24 13:55:22
 */
public class KoubeiCateringPosStallQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1692713593577885774L;

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
