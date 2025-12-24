package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预约门店查询
 *
 * @author auto create
 * @since 1.0, 2025-12-03 10:27:42
 */
public class AlipayCommerceMerchantcardBookingshopQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4336139188958761492L;

	/**
	 * 门店id【必填】
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
