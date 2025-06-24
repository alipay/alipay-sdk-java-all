package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 餐区查询接口
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:25:03
 */
public class KoubeiCateringPosDeskareaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7613898386993493118L;

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
