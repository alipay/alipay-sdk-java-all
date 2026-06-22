package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-18 15:47:48
 */
public class SelfShopGroupShopDetail extends AlipayObject {

	private static final long serialVersionUID = 7821685434183563699L;

	/**
	 * 门店位置的具体地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 品牌
	 */
	@ApiField("brand")
	private String brand;

	/**
	 * 门店的营业时间范围
	 */
	@ApiField("business_duration")
	private String businessDuration;

	/**
	 * 门店位置所属的城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 门店位置所属的区县
	 */
	@ApiField("district")
	private String district;

	/**
	 * 门店记录的创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 行业信息详情
	 */
	@ApiField("industry_info")
	private SelfIndustryInfo industryInfo;

	/**
	 * null
	 */
	@ApiListField("label_list")
	@ApiField("string")
	private List<String> labelList;

	/**
	 * 门店位置的纬度信息
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 门店位置的经度信息
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 门店的联系电话
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 门店位置所属的省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 企业码门店id
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

	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBusinessDuration() {
		return this.businessDuration;
	}
	public void setBusinessDuration(String businessDuration) {
		this.businessDuration = businessDuration;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public SelfIndustryInfo getIndustryInfo() {
		return this.industryInfo;
	}
	public void setIndustryInfo(SelfIndustryInfo industryInfo) {
		this.industryInfo = industryInfo;
	}

	public List<String> getLabelList() {
		return this.labelList;
	}
	public void setLabelList(List<String> labelList) {
		this.labelList = labelList;
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

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
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
