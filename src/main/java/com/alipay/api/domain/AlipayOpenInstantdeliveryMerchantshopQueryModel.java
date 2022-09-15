package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 即时配送商家门店详情查询
 *
 * @author auto create
 * @since 1.0, 2022-09-14 20:29:55
 */
public class AlipayOpenInstantdeliveryMerchantshopQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4657565838873176353L;

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
