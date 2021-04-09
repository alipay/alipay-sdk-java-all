package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家门店信息
 *
 * @author auto create
 * @since 1.0, 2020-09-26 20:17:25
 */
public class MerchantShopDTO extends AlipayObject {

	private static final long serialVersionUID = 8764748471981322197L;

	/**
	 * 门店名称，最长不超过256个字符。
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 门店编号。
	 */
	@ApiField("shop_no")
	private String shopNo;

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopNo() {
		return this.shopNo;
	}
	public void setShopNo(String shopNo) {
		this.shopNo = shopNo;
	}

}
