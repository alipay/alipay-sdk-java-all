package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询门店档口列表
 *
 * @author auto create
 * @since 1.0, 2018-11-23 19:45:07
 */
public class KoubeiCateringPosStallQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8678881826748952447L;

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
