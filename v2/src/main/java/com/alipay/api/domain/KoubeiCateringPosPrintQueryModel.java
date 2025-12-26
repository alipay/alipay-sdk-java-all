package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询门店后厨，标签打印机列表
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:27:54
 */
public class KoubeiCateringPosPrintQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1886144447649658849L;

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
