package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店班次查询
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:26:50
 */
public class KoubeiCateringPosShiftQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1533519413536483754L;

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
