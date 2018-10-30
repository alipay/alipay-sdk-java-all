package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询门店菜类列表
 *
 * @author auto create
 * @since 1.0, 2018-10-26 11:51:05
 */
public class KoubeiCateringPosCategorylistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6362583412316587226L;

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
