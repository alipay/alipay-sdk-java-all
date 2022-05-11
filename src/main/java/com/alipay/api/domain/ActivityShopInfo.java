package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动门店详情
 *
 * @author auto create
 * @since 1.0, 2022-02-23 14:15:43
 */
public class ActivityShopInfo extends AlipayObject {

	private static final long serialVersionUID = 8243516245149549286L;

	/**
	 * 纬度，浮点型,小数点后最多保留6位
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度，浮点型, 小数点后最多保留6位。
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 支付宝侧蚂蚁店铺 id。
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 店铺名称。
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 门店类型
PAYMENT_SHOP 支付门店
REAL_SHOP 代运营商业关系门店
	 */
	@ApiField("shop_type")
	private String shopType;

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
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

	public String getShopType() {
		return this.shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

}
