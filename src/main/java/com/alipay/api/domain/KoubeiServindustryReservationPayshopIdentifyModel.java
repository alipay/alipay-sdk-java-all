package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 判断是否旺铺
 *
 * @author auto create
 * @since 1.0, 2018-11-29 14:40:40
 */
public class KoubeiServindustryReservationPayshopIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 4697822635766654447L;

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
