package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 油站信息
 *
 * @author auto create
 * @since 1.0, 2019-11-25 16:22:33
 */
public class OilStationDetails extends AlipayObject {

	private static final long serialVersionUID = 2712152138466693162L;

	/**
	 * 油站详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 直降金额
	 */
	@ApiField("discount_price")
	private String discountPrice;

	/**
	 * 油站名称
	 */
	@ApiField("oil_station_name")
	private String oilStationName;

	/**
	 * 油品
	 */
	@ApiField("oil_type")
	private String oilType;

	/**
	 * 高德 poi_id
	 */
	@ApiField("poi_id")
	private String poiId;

	/**
	 * 油价，以元为单位
	 */
	@ApiField("sale_price")
	private String salePrice;

	/**
	 * 油站门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getDiscountPrice() {
		return this.discountPrice;
	}
	public void setDiscountPrice(String discountPrice) {
		this.discountPrice = discountPrice;
	}

	public String getOilStationName() {
		return this.oilStationName;
	}
	public void setOilStationName(String oilStationName) {
		this.oilStationName = oilStationName;
	}

	public String getOilType() {
		return this.oilType;
	}
	public void setOilType(String oilType) {
		this.oilType = oilType;
	}

	public String getPoiId() {
		return this.poiId;
	}
	public void setPoiId(String poiId) {
		this.poiId = poiId;
	}

	public String getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
