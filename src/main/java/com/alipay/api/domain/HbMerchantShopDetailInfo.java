package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户门店详情信息
 *
 * @author auto create
 * @since 1.0, 2022-08-15 17:30:20
 */
public class HbMerchantShopDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 3424362836378936392L;

	/**
	 * 门店地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 距离
	 */
	@ApiField("distance")
	private String distance;

	/**
	 * 门店id
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

	public String getDistance() {
		return this.distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
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
