package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业虚拟门店创建
 *
 * @author auto create
 * @since 1.0, 2020-07-13 17:29:31
 */
public class AlipayCommerceIotMdeviceprodShopCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1611313611723882556L;

	/**
	 * 西湖区文三路国际大厦
	 */
	@ApiField("address")
	private String address;

	/**
	 * 市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 创建人PID
	 */
	@ApiField("creator_pid")
	private String creatorPid;

	/**
	 * 区县
	 */
	@ApiField("district")
	private String district;

	/**
	 * {"key":"value"}
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 行业类目
	 */
	@ApiField("industry_category")
	private String industryCategory;

	/**
	 * 门店商户PID
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 省
	 */
	@ApiField("province")
	private String province;

	/**
	 * 虚拟门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 门店属性
	 */
	@ApiField("shop_property")
	private String shopProperty;

	/**
	 * 门店类型
	 */
	@ApiField("shop_type")
	private String shopType;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCreatorPid() {
		return this.creatorPid;
	}
	public void setCreatorPid(String creatorPid) {
		this.creatorPid = creatorPid;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getIndustryCategory() {
		return this.industryCategory;
	}
	public void setIndustryCategory(String industryCategory) {
		this.industryCategory = industryCategory;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopProperty() {
		return this.shopProperty;
	}
	public void setShopProperty(String shopProperty) {
		this.shopProperty = shopProperty;
	}

	public String getShopType() {
		return this.shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

}
