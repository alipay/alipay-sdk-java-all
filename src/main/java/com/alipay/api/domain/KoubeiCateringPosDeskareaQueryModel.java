package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 餐区查询接口
 *
 * @author auto create
 * @since 1.0, 2018-10-26 01:19:45
 */
public class KoubeiCateringPosDeskareaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3116821713184562319L;

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
