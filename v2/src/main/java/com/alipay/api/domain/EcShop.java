package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码门店信息
 *
 * @author auto create
 * @since 1.0, 2023-08-04 16:19:21
 */
public class EcShop extends AlipayObject {

	private static final long serialVersionUID = 6224281495341931955L;

	/**
	 * 门店地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 门店品牌id
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 城市编码
	 */
	@ApiField("city_id")
	private String cityId;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 门店距离，单位km
	 */
	@ApiField("distance")
	private String distance;

	/**
	 * 区编码
	 */
	@ApiField("district_id")
	private String districtId;

	/**
	 * 区名称
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * 企业码门店id
	 */
	@ApiField("ec_shop_id")
	private String ecShopId;

	/**
	 * 费用类型子类
	 */
	@ApiField("expense_type_sub_category")
	private String expenseTypeSubCategory;

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
	 * 一级mcc类目编码
	 */
	@ApiField("mcc_code_1")
	private String mccCode1;

	/**
	 * 二级mcc类目编码
	 */
	@ApiField("mcc_code_2")
	private String mccCode2;

	/**
	 * 一级mcc类目名称
	 */
	@ApiField("mcc_name_1")
	private String mccName1;

	/**
	 * 二级mcc类目名称
	 */
	@ApiField("mcc_name_2")
	private String mccName2;

	/**
	 * 门头照地址
	 */
	@ApiField("outdoor_img_url")
	private String outdoorImgUrl;

	/**
	 * 门店联系电话
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * poiId
	 */
	@ApiField("poi_id")
	private String poiId;

	/**
	 * 省份编码
	 */
	@ApiField("province_id")
	private String provinceId;

	/**
	 * 省份名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 门店产品类型,不传默认3
	 */
	@ApiField("shop_product")
	private String shopProduct;

	/**
	 * 门店收单身份信息
	 */
	@ApiField("shop_trade_info_list")
	private TradeIdentityInfo shopTradeInfoList;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getCityId() {
		return this.cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getDistance() {
		return this.distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getDistrictId() {
		return this.districtId;
	}
	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}

	public String getDistrictName() {
		return this.districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getEcShopId() {
		return this.ecShopId;
	}
	public void setEcShopId(String ecShopId) {
		this.ecShopId = ecShopId;
	}

	public String getExpenseTypeSubCategory() {
		return this.expenseTypeSubCategory;
	}
	public void setExpenseTypeSubCategory(String expenseTypeSubCategory) {
		this.expenseTypeSubCategory = expenseTypeSubCategory;
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

	public String getMccCode1() {
		return this.mccCode1;
	}
	public void setMccCode1(String mccCode1) {
		this.mccCode1 = mccCode1;
	}

	public String getMccCode2() {
		return this.mccCode2;
	}
	public void setMccCode2(String mccCode2) {
		this.mccCode2 = mccCode2;
	}

	public String getMccName1() {
		return this.mccName1;
	}
	public void setMccName1(String mccName1) {
		this.mccName1 = mccName1;
	}

	public String getMccName2() {
		return this.mccName2;
	}
	public void setMccName2(String mccName2) {
		this.mccName2 = mccName2;
	}

	public String getOutdoorImgUrl() {
		return this.outdoorImgUrl;
	}
	public void setOutdoorImgUrl(String outdoorImgUrl) {
		this.outdoorImgUrl = outdoorImgUrl;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPoiId() {
		return this.poiId;
	}
	public void setPoiId(String poiId) {
		this.poiId = poiId;
	}

	public String getProvinceId() {
		return this.provinceId;
	}
	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopProduct() {
		return this.shopProduct;
	}
	public void setShopProduct(String shopProduct) {
		this.shopProduct = shopProduct;
	}

	public TradeIdentityInfo getShopTradeInfoList() {
		return this.shopTradeInfoList;
	}
	public void setShopTradeInfoList(TradeIdentityInfo shopTradeInfoList) {
		this.shopTradeInfoList = shopTradeInfoList;
	}

}
