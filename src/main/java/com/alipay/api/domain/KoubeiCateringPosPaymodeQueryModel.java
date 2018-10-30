package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询支付方式列表
 *
 * @author auto create
 * @since 1.0, 2018-10-26 01:22:21
 */
public class KoubeiCateringPosPaymodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2835831929688483861L;

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
