package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户门店信息
 *
 * @author auto create
 * @since 1.0, 2017-06-20 21:12:59
 */
public class ShopQueryInfo extends AlipayObject {

	private static final long serialVersionUID = 8419966861378129549L;

	/**
	 * 门店地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 是否包含同mid下的其他pid的店铺
	 */
	@ApiField("is_include_cognate")
	private Boolean isIncludeCognate;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 门店名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商户pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 内部门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 门店类型
	 */
	@ApiField("shop_type")
	private String shopType;

	/**
	 * 外部门店ID
	 */
	@ApiField("store_id")
	private String storeId;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public Boolean getIsIncludeCognate() {
		return this.isIncludeCognate;
	}
	public void setIsIncludeCognate(Boolean isIncludeCognate) {
		this.isIncludeCognate = isIncludeCognate;
	}

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

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopType() {
		return this.shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
