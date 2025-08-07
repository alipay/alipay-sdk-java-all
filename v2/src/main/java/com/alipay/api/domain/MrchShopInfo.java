package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店信息
 *
 * @author auto create
 * @since 1.0, 2024-10-09 11:27:01
 */
public class MrchShopInfo extends AlipayObject {

	private static final long serialVersionUID = 2424554129211714922L;

	/**
	 * 门店地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}
