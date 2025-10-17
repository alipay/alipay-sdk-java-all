package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁地址信息
 *
 * @author auto create
 * @since 1.0, 2025-03-18 16:05:55
 */
public class RentAddress extends AlipayObject {

	private static final long serialVersionUID = 1523116329834642217L;

	/**
	 * 所在的城市编码，取值：参考最新的国标编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 所在的详细地址
	 */
	@ApiField("detail_address")
	private String detailAddress;

	/**
	 * 所在区县对应的编码，取值：参考最新的国标编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 完整的地址信息，需要包含省市区和详细地址
	 */
	@ApiField("full_address")
	private String fullAddress;

	/**
	 * 所在的省份/直辖市对应的编码，取值：参考最新的国标编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getDetailAddress() {
		return this.detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getFullAddress() {
		return this.fullAddress;
	}
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

}
