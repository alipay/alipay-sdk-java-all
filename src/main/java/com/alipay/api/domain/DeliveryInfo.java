package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 配送信息
 *
 * @author auto create
 * @since 1.0, 2018-10-09 11:55:09
 */
public class DeliveryInfo extends AlipayObject {

	private static final long serialVersionUID = 6798663592913131326L;

	/**
	 * 市区编码，国标码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 收件人
	 */
	@ApiField("consignee")
	private String consignee;

	/**
	 * 收件人联系方式
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 详细地区
	 */
	@ApiField("detail_address")
	private String detailAddress;

	/**
	 * 县区编码，国标码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 省份编码，国标码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 邮政编码
	 */
	@ApiField("zip_code")
	private String zipCode;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getConsignee() {
		return this.consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
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

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getZipCode() {
		return this.zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
