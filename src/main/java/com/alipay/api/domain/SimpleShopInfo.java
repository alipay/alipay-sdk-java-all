package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线下服务场景使用的线下门店信息
 *
 * @author auto create
 * @since 1.0, 2020-02-29 10:40:24
 */
public class SimpleShopInfo extends AlipayObject {

	private static final long serialVersionUID = 8491849371841737476L;

	/**
	 * 地址信息
	 */
	@ApiField("address")
	private String address;

	/**
	 * 线下门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 线下店名称
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
