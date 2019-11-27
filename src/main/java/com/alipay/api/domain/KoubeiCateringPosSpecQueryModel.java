package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 规格查询
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:26:13
 */
public class KoubeiCateringPosSpecQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1517364271248467961L;

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
