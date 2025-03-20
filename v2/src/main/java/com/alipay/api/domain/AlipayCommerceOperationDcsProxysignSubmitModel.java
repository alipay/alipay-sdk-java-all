package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联合营销签约信息代填写请求
 *
 * @author auto create
 * @since 1.0, 2024-01-23 15:21:07
 */
public class AlipayCommerceOperationDcsProxysignSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 5548872317231251862L;

	/**
	 * 门店所在位置纬度，小数点后最多保留6位
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 门店所在位置经度，小数点后最多保留6位
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 详细地址，仅填写“去除省市区”后的地址
	 */
	@ApiField("shop_address")
	private String shopAddress;

	/**
	 * 门店所在城市编码。参考民政部最新行政区划编码
	 */
	@ApiField("shop_city_code")
	private String shopCityCode;

	/**
	 * 门店联系人
	 */
	@ApiField("shop_contact")
	private String shopContact;

	/**
	 * 联系电话
	 */
	@ApiField("shop_contact_phone")
	private String shopContactPhone;

	/**
	 * 门店所在区县编码，参考最新国家行政区划
	 */
	@ApiField("shop_district_code")
	private String shopDistrictCode;

	/**
	 * 门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 门店所在省份编码。参考民政部最新行政区划编码
	 */
	@ApiField("shop_province_code")
	private String shopProvinceCode;

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

	public String getShopAddress() {
		return this.shopAddress;
	}
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	public String getShopCityCode() {
		return this.shopCityCode;
	}
	public void setShopCityCode(String shopCityCode) {
		this.shopCityCode = shopCityCode;
	}

	public String getShopContact() {
		return this.shopContact;
	}
	public void setShopContact(String shopContact) {
		this.shopContact = shopContact;
	}

	public String getShopContactPhone() {
		return this.shopContactPhone;
	}
	public void setShopContactPhone(String shopContactPhone) {
		this.shopContactPhone = shopContactPhone;
	}

	public String getShopDistrictCode() {
		return this.shopDistrictCode;
	}
	public void setShopDistrictCode(String shopDistrictCode) {
		this.shopDistrictCode = shopDistrictCode;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopProvinceCode() {
		return this.shopProvinceCode;
	}
	public void setShopProvinceCode(String shopProvinceCode) {
		this.shopProvinceCode = shopProvinceCode;
	}

}
