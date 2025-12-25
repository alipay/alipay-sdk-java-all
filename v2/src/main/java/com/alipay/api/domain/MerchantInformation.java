package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户信息模型
 *
 * @author auto create
 * @since 1.0, 2020-09-24 10:12:19
 */
public class MerchantInformation extends AlipayObject {

	private static final long serialVersionUID = 5216897483548214683L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 预收金额
	 */
	@ApiField("advance_amount")
	private String advanceAmount;

	/**
	 * 城市
	 */
	@ApiField("city_desc")
	private String cityDesc;

	/**
	 * 计收模式和结算方式
	 */
	@ApiField("collection_settlement")
	private String collectionSettlement;

	/**
	 * 国家
	 */
	@ApiField("country_desc")
	private String countryDesc;

	/**
	 * 地区
	 */
	@ApiField("district_desc")
	private String districtDesc;

	/**
	 * mcc码
	 */
	@ApiField("mcc_code")
	private String mccCode;

	/**
	 * mcc一级类目
	 */
	@ApiField("mcc_industry_one")
	private String mccIndustryOne;

	/**
	 * mcc二级类目
	 */
	@ApiField("mcc_industry_two")
	private String mccIndustryTwo;

	/**
	 * 上面名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * mid
	 */
	@ApiField("mid")
	private String mid;

	/**
	 * 邮编
	 */
	@ApiField("zip_code")
	private String zipCode;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAdvanceAmount() {
		return this.advanceAmount;
	}
	public void setAdvanceAmount(String advanceAmount) {
		this.advanceAmount = advanceAmount;
	}

	public String getCityDesc() {
		return this.cityDesc;
	}
	public void setCityDesc(String cityDesc) {
		this.cityDesc = cityDesc;
	}

	public String getCollectionSettlement() {
		return this.collectionSettlement;
	}
	public void setCollectionSettlement(String collectionSettlement) {
		this.collectionSettlement = collectionSettlement;
	}

	public String getCountryDesc() {
		return this.countryDesc;
	}
	public void setCountryDesc(String countryDesc) {
		this.countryDesc = countryDesc;
	}

	public String getDistrictDesc() {
		return this.districtDesc;
	}
	public void setDistrictDesc(String districtDesc) {
		this.districtDesc = districtDesc;
	}

	public String getMccCode() {
		return this.mccCode;
	}
	public void setMccCode(String mccCode) {
		this.mccCode = mccCode;
	}

	public String getMccIndustryOne() {
		return this.mccIndustryOne;
	}
	public void setMccIndustryOne(String mccIndustryOne) {
		this.mccIndustryOne = mccIndustryOne;
	}

	public String getMccIndustryTwo() {
		return this.mccIndustryTwo;
	}
	public void setMccIndustryTwo(String mccIndustryTwo) {
		this.mccIndustryTwo = mccIndustryTwo;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMid() {
		return this.mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getZipCode() {
		return this.zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
