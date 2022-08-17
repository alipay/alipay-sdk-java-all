package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 配料列表查询
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:23:42
 */
public class KoubeiCateringPosMaterialQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4452893953254361178L;

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
