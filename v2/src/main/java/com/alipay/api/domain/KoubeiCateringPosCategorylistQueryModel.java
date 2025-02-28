package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询门店菜类列表
 *
 * @author auto create
 * @since 1.0, 2018-11-16 16:50:16
 */
public class KoubeiCateringPosCategorylistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1162945195388854646L;

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
