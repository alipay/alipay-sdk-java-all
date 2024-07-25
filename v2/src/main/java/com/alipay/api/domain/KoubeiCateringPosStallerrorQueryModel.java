package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店档口异常菜品列表
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:28:43
 */
public class KoubeiCateringPosStallerrorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3226378662926598767L;

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
