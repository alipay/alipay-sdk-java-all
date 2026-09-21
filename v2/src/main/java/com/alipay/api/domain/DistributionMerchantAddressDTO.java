package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分销商户归还地址信息
 *
 * @author auto create
 * @since 1.0, 2026-08-26 12:35:51
 */
public class DistributionMerchantAddressDTO extends AlipayObject {

	private static final long serialVersionUID = 4623562392362673165L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 地址id
	 */
	@ApiField("address_id")
	private String addressId;

	/**
	 * 区
	 */
	@ApiField("area")
	private String area;

	/**
	 * 市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 区县代码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 联系人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 联系人手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 省
	 */
	@ApiField("prov")
	private String prov;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressId() {
		return this.addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getArea() {
		return this.area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProv() {
		return this.prov;
	}
	public void setProv(String prov) {
		this.prov = prov;
	}

}
