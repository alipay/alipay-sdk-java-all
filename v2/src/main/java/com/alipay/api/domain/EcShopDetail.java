package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业码门店池内门店详情
 *
 * @author auto create
 * @since 1.0, 2024-05-06 16:53:20
 */
public class EcShopDetail extends AlipayObject {

	private static final long serialVersionUID = 8342164784623832488L;

	/**
	 * 门店准确度等级，可选值：HIGH - 高；MIDDLE - 中；LOW - 低
	 */
	@ApiField("accuracy_level")
	private String accuracyLevel;

	/**
	 * 企业码门店所在位置的城市编码
	 */
	@ApiField("city_id")
	private String cityId;

	/**
	 * 企业码门店所属位置的城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 企业码门店所属位置的地区编码
	 */
	@ApiField("district_id")
	private String districtId;

	/**
	 * 企业码门店所属位置的地区名称
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * 企业码门店是否有营业执照，可选值： true - 是； false - 否
	 */
	@ApiField("has_legal_cert_no")
	private Boolean hasLegalCertNo;

	/**
	 * 企业码是否有门头照，可选值：true - 是；false - 否
	 */
	@ApiField("has_out_door_pic")
	private Boolean hasOutDoorPic;

	/**
	 * 企业码门店所属纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 企业码门店所属经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 企业码门店所属经营类目
	 */
	@ApiListField("mcc_list")
	@ApiField("ec_mcc_info")
	private List<EcMccInfo> mccList;

	/**
	 * 企业码门店所属位置的高德POIID
	 */
	@ApiField("poi_id")
	private String poiId;

	/**
	 * 企业码门店所在位置的省份编码
	 */
	@ApiField("province_id")
	private String provinceId;

	/**
	 * 企业码门店所在位置的省份名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 企业码所属门店地址
	 */
	@ApiField("shop_address")
	private String shopAddress;

	/**
	 * 企业码门店别名
	 */
	@ApiField("shop_alias")
	private String shopAlias;

	/**
	 * 企业码门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 企业码门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 企业码门店类型，可选值：
餐饮门店 - MEAL；
理赔医院 - HOSPITAL
	 */
	@ApiField("shop_type")
	private String shopType;

	/**
	 * 企业码门店是否支持开票，可选值：true - 是；false - 否
	 */
	@ApiField("support_invoice")
	private Boolean supportInvoice;

	public String getAccuracyLevel() {
		return this.accuracyLevel;
	}
	public void setAccuracyLevel(String accuracyLevel) {
		this.accuracyLevel = accuracyLevel;
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

	public Boolean getHasLegalCertNo() {
		return this.hasLegalCertNo;
	}
	public void setHasLegalCertNo(Boolean hasLegalCertNo) {
		this.hasLegalCertNo = hasLegalCertNo;
	}

	public Boolean getHasOutDoorPic() {
		return this.hasOutDoorPic;
	}
	public void setHasOutDoorPic(Boolean hasOutDoorPic) {
		this.hasOutDoorPic = hasOutDoorPic;
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

	public List<EcMccInfo> getMccList() {
		return this.mccList;
	}
	public void setMccList(List<EcMccInfo> mccList) {
		this.mccList = mccList;
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

	public String getShopAddress() {
		return this.shopAddress;
	}
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	public String getShopAlias() {
		return this.shopAlias;
	}
	public void setShopAlias(String shopAlias) {
		this.shopAlias = shopAlias;
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

	public Boolean getSupportInvoice() {
		return this.supportInvoice;
	}
	public void setSupportInvoice(Boolean supportInvoice) {
		this.supportInvoice = supportInvoice;
	}

}
