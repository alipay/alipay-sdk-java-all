package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺经营地址信息
 *
 * @author auto create
 * @since 1.0, 2021-03-10 16:55:36
 */
public class ShopAddressInfo extends AlipayObject {

	private static final long serialVersionUID = 3685692691362897841L;

	/**
	 * 精度类型，支付宝定义code
	 */
	@ApiField("accuracy_type")
	private String accuracyType;

	/**
	 * 地址详情
	 */
	@ApiField("address")
	private String address;

	/**
	 * 市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 国家
	 */
	@ApiField("country")
	private String country;

	/**
	 * 区
	 */
	@ApiField("county")
	private String county;

	/**
	 * 省
	 */
	@ApiField("province")
	private String province;

	/**
	 * 街道
	 */
	@ApiField("town")
	private String town;

	public String getAccuracyType() {
		return this.accuracyType;
	}
	public void setAccuracyType(String accuracyType) {
		this.accuracyType = accuracyType;
	}

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

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getCounty() {
		return this.county;
	}
	public void setCounty(String county) {
		this.county = county;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getTown() {
		return this.town;
	}
	public void setTown(String town) {
		this.town = town;
	}

}
