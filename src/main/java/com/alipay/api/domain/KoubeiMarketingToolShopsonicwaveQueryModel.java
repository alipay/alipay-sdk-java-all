package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑店铺声波查询
 *
 * @author auto create
 * @since 1.0, 2016-06-03 11:17:54
 */
public class KoubeiMarketingToolShopsonicwaveQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1815766762413112775L;

	/**
	 * 口碑店铺id
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
