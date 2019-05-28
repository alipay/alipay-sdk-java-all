package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户修改接口
 *
 * @author auto create
 * @since 1.0, 2019-05-15 11:15:59
 */
public class AlipayBossProdSubmerchantModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4537978622422683778L;

	/**
	 * 受理商户详细经营地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 受理商户简称
	 */
	@ApiField("alias_name")
	private String aliasName;

	/**
	 * 受理商户营业执照编号
	 */
	@ApiField("business_license")
	private String businessLicense;

	/**
	 * 受理商户城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 受理商户联系人名称
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 受理商户区县编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 受理商户编号，与sub_merchant_id二选一必传
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 受理商户身份证编号
	 */
	@ApiField("id_card")
	private String idCard;

	/**
	 * 受理商户省份编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 受理商户客服电话
	 */
	@ApiField("service_phone")
	private String servicePhone;

	/**
	 * 受理商户来源机构标识，填写受理机构在支付宝的pid
	 */
	@ApiField("source")
	private String source;

	/**
	 * 本次修改受理商户的支付宝识别号，同请求传入的sub_merchant_id字段，与external_id二选一必传
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAliasName() {
		return this.aliasName;
	}
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public String getBusinessLicense() {
		return this.businessLicense;
	}
	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getIdCard() {
		return this.idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getServicePhone() {
		return this.servicePhone;
	}
	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

}
