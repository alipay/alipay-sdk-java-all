package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 判断是否旺铺
 *
 * @author auto create
 * @since 1.0, 2022-03-22 10:00:54
 */
public class KoubeiServindustryReservationPayshopIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 3571553428124497788L;

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
