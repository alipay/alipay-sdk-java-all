package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询支付方式列表
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:29:31
 */
public class KoubeiCateringPosPaymodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1487362156418935852L;

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
