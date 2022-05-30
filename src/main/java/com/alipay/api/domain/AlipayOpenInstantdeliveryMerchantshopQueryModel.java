package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 即时配送商家门店详情查询
 *
 * @author auto create
 * @since 1.0, 2020-09-27 21:15:22
 */
public class AlipayOpenInstantdeliveryMerchantshopQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1796928273188688321L;

	/**
	 * 商家门店编码。
	 */
	@ApiField("shop_no")
	private String shopNo;

	public String getShopNo() {
		return this.shopNo;
	}
	public void setShopNo(String shopNo) {
		this.shopNo = shopNo;
	}

}
