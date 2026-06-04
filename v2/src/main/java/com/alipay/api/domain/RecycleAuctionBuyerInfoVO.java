package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收竞拍买家信息
 *
 * @author auto create
 * @since 1.0, 2026-03-27 10:50:56
 */
public class RecycleAuctionBuyerInfoVO extends AlipayObject {

	private static final long serialVersionUID = 4284632645775812257L;

	/**
	 * 买家详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 买家标识
	 */
	@ApiField("buyer_identify")
	private String buyerIdentify;

	/**
	 * 买家手机号
	 */
	@ApiField("buyer_mobile")
	private String buyerMobile;

	/**
	 * 买家名称
	 */
	@ApiField("buyer_name")
	private String buyerName;

	/**
	 * 市区
	 */
	@ApiField("city")
	private String city;

	/**
	 * 买家市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 区县
	 */
	@ApiField("distinct")
	private String distinct;

	/**
	 * 买家区县编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 买家省份编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBuyerIdentify() {
		return this.buyerIdentify;
	}
	public void setBuyerIdentify(String buyerIdentify) {
		this.buyerIdentify = buyerIdentify;
	}

	public String getBuyerMobile() {
		return this.buyerMobile;
	}
	public void setBuyerMobile(String buyerMobile) {
		this.buyerMobile = buyerMobile;
	}

	public String getBuyerName() {
		return this.buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

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

	public String getDistinct() {
		return this.distinct;
	}
	public void setDistinct(String distinct) {
		this.distinct = distinct;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
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

}
