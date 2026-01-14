package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 号卡收货地址
 *
 * @author auto create
 * @since 1.0, 2024-11-08 11:42:18
 */
public class PhoneCardShippingAddressModel extends AlipayObject {

	private static final long serialVersionUID = 8793615458811642432L;

	/**
	 * 收货地址
	 */
	@ApiField("address_detail")
	private String addressDetail;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 区域编码，如北京市朝阳区对应编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 省份编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	public String getAddressDetail() {
		return this.addressDetail;
	}
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
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

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

}
