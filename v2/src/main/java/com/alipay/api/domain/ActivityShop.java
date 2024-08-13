package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用承诺消费活动门店模型
 *
 * @author auto create
 * @since 1.0, 2018-10-18 18:01:45
 */
public class ActivityShop extends AlipayObject {

	private static final long serialVersionUID = 8576194216453589777L;

	/**
	 * 承诺消费活动门店地址
	 */
	@ApiField("shop_address")
	private String shopAddress;

	/**
	 * 承诺消费活动门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 承诺消费门店纬度
	 */
	@ApiField("shop_latitude")
	private String shopLatitude;

	/**
	 * 承诺消费门店经度信息
	 */
	@ApiField("shop_longitude")
	private String shopLongitude;

	/**
	 * 承诺消费活动门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	public String getShopAddress() {
		return this.shopAddress;
	}
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopLatitude() {
		return this.shopLatitude;
	}
	public void setShopLatitude(String shopLatitude) {
		this.shopLatitude = shopLatitude;
	}

	public String getShopLongitude() {
		return this.shopLongitude;
	}
	public void setShopLongitude(String shopLongitude) {
		this.shopLongitude = shopLongitude;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}
