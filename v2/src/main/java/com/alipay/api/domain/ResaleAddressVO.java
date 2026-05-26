package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收货地址信息，邮寄方式需要输入
 *
 * @author auto create
 * @since 1.0, 2026-04-27 17:22:45
 */
public class ResaleAddressVO extends AlipayObject {

	private static final long serialVersionUID = 3489146942213171733L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 213
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 区域编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 手机号，数字
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 标准省份编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

}
