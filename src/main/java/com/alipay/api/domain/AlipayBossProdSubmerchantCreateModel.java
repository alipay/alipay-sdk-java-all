package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行二清商户入驻接口
 *
 * @author auto create
 * @since 1.0, 2017-09-23 20:46:27
 */
public class AlipayBossProdSubmerchantCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1134337756624622972L;

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
	 * 受理商户经营类目，参考开放平台口碑开放行业入驻要求
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 受理商户所在城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 受理商户联系人邮箱
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/**
	 * 受理商户联系人手机号
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 受理商户联系人名称
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 受理商户联系人电话
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 受理商户所在区县编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 受理商户编号，由受理机构定义，需要保证在受理机构下唯一
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 受理商户身份证编号
	 */
	@ApiField("id_card")
	private String idCard;

	/**
	 * 受理商户备注信息，可填写额外信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 受理商户名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 受理商户所在省份编码
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

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getContactEmail() {
		return this.contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactMobile() {
		return this.contactMobile;
	}
	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
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

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
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

}
