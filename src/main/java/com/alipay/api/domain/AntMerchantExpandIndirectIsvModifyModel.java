package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连渠道服务商商户信息补全接口
 *
 * @author auto create
 * @since 1.0, 2020-09-28 11:17:14
 */
public class AntMerchantExpandIndirectIsvModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3153186975235976112L;

	/**
	 * 商户地址信息
	 */
	@ApiField("address_info")
	private AddressInfo addressInfo;

	/**
	 * 商户简称
	 */
	@ApiField("alias_name")
	private String aliasName;

	/**
	 * 商户证件编号（企业或者个体工商户提供营业执照，事业单位提供事证号）
	 */
	@ApiField("business_license")
	private String businessLicense;

	/**
	 * 营业执照，要求营业执照文本信息清晰可见。 请上传照片OSSKey。图片的值为使用ant.merchant.expand.indirect.image.upload上传得到的一串oss key。
	 */
	@ApiField("business_license_photo")
	private String businessLicensePhoto;

	/**
	 * 商户证件类型，取值范围：NATIONAL_LEGAL：营业执照；NATIONAL_LEGAL_MERGE:营业执照(多证合一)；INST_RGST_CTF：事业单位法人证书
	 */
	@ApiField("business_license_type")
	private String businessLicenseType;

	/**
	 * 商户负责人信息。关键联系人必填。
	 */
	@ApiField("contact_info")
	private ContactInfo contactInfo;

	/**
	 * 标准商户类别码，例如5976表示“专业销售-药品医疗-康复和身体辅助用品”，银联网联调用时必传
	 */
	@ApiField("mcc")
	private String mcc;

	/**
	 * 商户名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商户客服电话
	 */
	@ApiField("service_phone")
	private String servicePhone;

	/**
	 * 商户在支付宝入驻成功后，生成的支付宝内全局唯一的商户编号
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	public AddressInfo getAddressInfo() {
		return this.addressInfo;
	}
	public void setAddressInfo(AddressInfo addressInfo) {
		this.addressInfo = addressInfo;
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

	public String getBusinessLicensePhoto() {
		return this.businessLicensePhoto;
	}
	public void setBusinessLicensePhoto(String businessLicensePhoto) {
		this.businessLicensePhoto = businessLicensePhoto;
	}

	public String getBusinessLicenseType() {
		return this.businessLicenseType;
	}
	public void setBusinessLicenseType(String businessLicenseType) {
		this.businessLicenseType = businessLicenseType;
	}

	public ContactInfo getContactInfo() {
		return this.contactInfo;
	}
	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getMcc() {
		return this.mcc;
	}
	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getServicePhone() {
		return this.servicePhone;
	}
	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

}
