package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺分数查询请求item
 *
 * @author auto create
 * @since 1.0, 2017-08-17 14:22:38
 */
public class ShopScoreReqItem extends AlipayObject {

	private static final long serialVersionUID = 6887425614642732177L;

	/**
	 * 店铺id
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
