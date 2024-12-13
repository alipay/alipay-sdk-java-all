package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询支付方式列表
 *
 * @author auto create
 * @since 1.0, 2019-01-16 17:31:19
 */
public class KoubeiCateringPosPaymodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4494664896532782851L;

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
