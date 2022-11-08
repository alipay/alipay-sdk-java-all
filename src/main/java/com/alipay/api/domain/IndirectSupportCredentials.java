package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 辅助证明材料 ，主体类型为小微商户时，辅助证明材料信息必填
 *
 * @author auto create
 * @since 1.0, 2022-09-01 19:25:30
 */
public class IndirectSupportCredentials extends AlipayObject {

	private static final long serialVersionUID = 8223846476457186757L;

	/**
	 * 门店城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 门店市行政区号（数字）
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 门店街道
	 */
	@ApiField("district")
	private String district;

	/**
	 * 门店街道区号（数字）
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 小微商户经营类型，枚举值：门店场所（STORE）、流动经营（STALL）
	 */
	@ApiField("merchant_type")
	private String merchantType;

	/**
	 * 门店省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 门店省行政区号（数字
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 门店场所填写门店详细地址，流动经营类型填“无”
	 */
	@ApiField("store_address")
	private String storeAddress;

	/**
	 * 门店门头照信息或摊位照（使用图片上传接口）
	 */
	@ApiField("store_door_img")
	private String storeDoorImg;

	/**
	 * 门店店内照片或者摊位照侧面（使用图片上传接口）
	 */
	@ApiField("store_inner_img")
	private String storeInnerImg;

	/**
	 * 门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getMerchantType() {
		return this.merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getStoreAddress() {
		return this.storeAddress;
	}
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getStoreDoorImg() {
		return this.storeDoorImg;
	}
	public void setStoreDoorImg(String storeDoorImg) {
		this.storeDoorImg = storeDoorImg;
	}

	public String getStoreInnerImg() {
		return this.storeInnerImg;
	}
	public void setStoreInnerImg(String storeInnerImg) {
		this.storeInnerImg = storeInnerImg;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

}
