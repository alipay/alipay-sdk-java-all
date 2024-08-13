package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 药品门店信息
 *
 * @author auto create
 * @since 1.0, 2024-02-27 14:59:14
 */
public class MedicineStoreInfo extends AlipayObject {

	private static final long serialVersionUID = 3339195758792454999L;

	/**
	 * 门店详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 门店ID
	 */
	@ApiField("app_store_id")
	private String appStoreId;

	/**
	 * 门店所在地级行政区划编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 门店所在地级行政区划名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 用户和门店的距离(单位：米)
	 */
	@ApiField("distance")
	private Long distance;

	/**
	 * 免配送费门槛价
	 */
	@ApiField("free_shipping_price")
	private Long freeShippingPrice;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 门店Logo
	 */
	@ApiField("logo_image")
	private String logoImage;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 定点医药机构编码
医保相关业务必填
	 */
	@ApiField("medical_org_no")
	private String medicalOrgNo;

	/**
	 * 门店所在省行政区划编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 门店所在省行政区划名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 该区域配送费
	 */
	@ApiField("shipping_fee")
	private Long shippingFee;

	/**
	 * 起送价
	 */
	@ApiField("shipping_price")
	private Long shippingPrice;

	/**
	 * 门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	/**
	 * 标签列表
	 */
	@ApiListField("tag_list")
	@ApiField("medicine_tag_info")
	private List<MedicineTagInfo> tagList;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAppStoreId() {
		return this.appStoreId;
	}
	public void setAppStoreId(String appStoreId) {
		this.appStoreId = appStoreId;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Long getDistance() {
		return this.distance;
	}
	public void setDistance(Long distance) {
		this.distance = distance;
	}

	public Long getFreeShippingPrice() {
		return this.freeShippingPrice;
	}
	public void setFreeShippingPrice(Long freeShippingPrice) {
		this.freeShippingPrice = freeShippingPrice;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLogoImage() {
		return this.logoImage;
	}
	public void setLogoImage(String logoImage) {
		this.logoImage = logoImage;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getMedicalOrgNo() {
		return this.medicalOrgNo;
	}
	public void setMedicalOrgNo(String medicalOrgNo) {
		this.medicalOrgNo = medicalOrgNo;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public Long getShippingFee() {
		return this.shippingFee;
	}
	public void setShippingFee(Long shippingFee) {
		this.shippingFee = shippingFee;
	}

	public Long getShippingPrice() {
		return this.shippingPrice;
	}
	public void setShippingPrice(Long shippingPrice) {
		this.shippingPrice = shippingPrice;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public List<MedicineTagInfo> getTagList() {
		return this.tagList;
	}
	public void setTagList(List<MedicineTagInfo> tagList) {
		this.tagList = tagList;
	}

}
