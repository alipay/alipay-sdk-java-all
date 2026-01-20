package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 海外商户报备接口
 *
 * @author auto create
 * @since 1.0, 2021-10-25 13:38:13
 */
public class AlipayOverseasSecondmerchantOfflineMaintainModel extends AlipayObject {

	private static final long serialVersionUID = 1698962178436634127L;

	/**
	 * 联系人邮箱
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/**
	 * 联系人电话
	 */
	@ApiField("contact_no")
	private String contactNo;

	/**
	 * 客服邮箱
	 */
	@ApiField("cs_email")
	private String csEmail;

	/**
	 * 客服电话
	 */
	@ApiField("cs_no")
	private String csNo;

	/**
	 * 店铺外景照URL地址
	 */
	@ApiField("external_storefront_photo")
	private String externalStorefrontPhoto;

	/**
	 * 店铺内景照URL地址
	 */
	@ApiField("internal_store_photo")
	private String internalStorePhoto;

	/**
	 * 公司注册地址
	 */
	@ApiField("register_address")
	private String registerAddress;

	/**
	 * 商户注册国家
	 */
	@ApiField("register_country")
	private String registerCountry;

	/**
	 * 公司注册号
	 */
	@ApiField("registration_no")
	private String registrationNo;

	/**
	 * 个人ID
	 */
	@ApiField("representative_id")
	private String representativeId;

	/**
	 * 个人姓名
	 */
	@ApiField("representative_name")
	private String representativeName;

	/**
	 * 法定代表人国籍
	 */
	@ApiField("representative_nationality")
	private String representativeNationality;

	/**
	 * 二级商户ID
	 */
	@ApiField("secondary_merchant_id")
	private String secondaryMerchantId;

	/**
	 * 二级商户名称
	 */
	@ApiField("secondary_merchant_name")
	private String secondaryMerchantName;

	/**
	 * 二级商户类型
	 */
	@ApiField("secondary_merchant_type")
	private String secondaryMerchantType;

	/**
	 * 商户结算卡号
	 */
	@ApiField("settlement_no")
	private String settlementNo;

	/**
	 * 股东ID
	 */
	@ApiField("shareholder_id")
	private String shareholderId;

	/**
	 * 股东名称
	 */
	@ApiField("shareholder_name")
	private String shareholderName;

	/**
	 * 股东国籍
	 */
	@ApiField("shareholder_nationality")
	private String shareholderNationality;

	/**
	 * 店铺地址信息
	 */
	@ApiField("store_address")
	private String storeAddress;

	/**
	 * 店铺所在城市
	 */
	@ApiField("store_city")
	private String storeCity;

	/**
	 * 店铺所在国家，两位国家码
	 */
	@ApiField("store_country")
	private String storeCountry;

	/**
	 * 店铺ID
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 店铺行业类型
	 */
	@ApiField("store_industry")
	private String storeIndustry;

	/**
	 * 店铺名称
	 */
	@ApiField("store_name")
	private String storeName;

	public String getContactEmail() {
		return this.contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactNo() {
		return this.contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getCsEmail() {
		return this.csEmail;
	}
	public void setCsEmail(String csEmail) {
		this.csEmail = csEmail;
	}

	public String getCsNo() {
		return this.csNo;
	}
	public void setCsNo(String csNo) {
		this.csNo = csNo;
	}

	public String getExternalStorefrontPhoto() {
		return this.externalStorefrontPhoto;
	}
	public void setExternalStorefrontPhoto(String externalStorefrontPhoto) {
		this.externalStorefrontPhoto = externalStorefrontPhoto;
	}

	public String getInternalStorePhoto() {
		return this.internalStorePhoto;
	}
	public void setInternalStorePhoto(String internalStorePhoto) {
		this.internalStorePhoto = internalStorePhoto;
	}

	public String getRegisterAddress() {
		return this.registerAddress;
	}
	public void setRegisterAddress(String registerAddress) {
		this.registerAddress = registerAddress;
	}

	public String getRegisterCountry() {
		return this.registerCountry;
	}
	public void setRegisterCountry(String registerCountry) {
		this.registerCountry = registerCountry;
	}

	public String getRegistrationNo() {
		return this.registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getRepresentativeId() {
		return this.representativeId;
	}
	public void setRepresentativeId(String representativeId) {
		this.representativeId = representativeId;
	}

	public String getRepresentativeName() {
		return this.representativeName;
	}
	public void setRepresentativeName(String representativeName) {
		this.representativeName = representativeName;
	}

	public String getRepresentativeNationality() {
		return this.representativeNationality;
	}
	public void setRepresentativeNationality(String representativeNationality) {
		this.representativeNationality = representativeNationality;
	}

	public String getSecondaryMerchantId() {
		return this.secondaryMerchantId;
	}
	public void setSecondaryMerchantId(String secondaryMerchantId) {
		this.secondaryMerchantId = secondaryMerchantId;
	}

	public String getSecondaryMerchantName() {
		return this.secondaryMerchantName;
	}
	public void setSecondaryMerchantName(String secondaryMerchantName) {
		this.secondaryMerchantName = secondaryMerchantName;
	}

	public String getSecondaryMerchantType() {
		return this.secondaryMerchantType;
	}
	public void setSecondaryMerchantType(String secondaryMerchantType) {
		this.secondaryMerchantType = secondaryMerchantType;
	}

	public String getSettlementNo() {
		return this.settlementNo;
	}
	public void setSettlementNo(String settlementNo) {
		this.settlementNo = settlementNo;
	}

	public String getShareholderId() {
		return this.shareholderId;
	}
	public void setShareholderId(String shareholderId) {
		this.shareholderId = shareholderId;
	}

	public String getShareholderName() {
		return this.shareholderName;
	}
	public void setShareholderName(String shareholderName) {
		this.shareholderName = shareholderName;
	}

	public String getShareholderNationality() {
		return this.shareholderNationality;
	}
	public void setShareholderNationality(String shareholderNationality) {
		this.shareholderNationality = shareholderNationality;
	}

	public String getStoreAddress() {
		return this.storeAddress;
	}
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getStoreCity() {
		return this.storeCity;
	}
	public void setStoreCity(String storeCity) {
		this.storeCity = storeCity;
	}

	public String getStoreCountry() {
		return this.storeCountry;
	}
	public void setStoreCountry(String storeCountry) {
		this.storeCountry = storeCountry;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getStoreIndustry() {
		return this.storeIndustry;
	}
	public void setStoreIndustry(String storeIndustry) {
		this.storeIndustry = storeIndustry;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

}
