package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MerchantSiteInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.secondmerchant.maintain.querystatus response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-19 14:00:58
 */
public class AlipayOverseasSecondmerchantMaintainQuerystatusResponse extends AlipayResponse {

	private static final long serialVersionUID = 4333859628675211431L;

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
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * 二级商户的支付场景，包括INSTORE_PAYMENT 和 ONLINE_PAYMENT
	 */
	@ApiField("payment_method")
	private String paymentMethod;

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
	 * 二级商户报备失败原因描述
	 */
	@ApiField("reject_reason")
	private String rejectReason;

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
	 * 二级商户ID
	 */
	@ApiField("secondary_merchant_id")
	private String secondaryMerchantId;

	/** 
	 * 二级商户行业类型
	 */
	@ApiField("secondary_merchant_industry")
	private String secondaryMerchantIndustry;

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
	 * 线上二级商户网站信息
	 */
	@ApiListField("site_infos")
	@ApiField("merchant_site_info")
	private List<MerchantSiteInfo> siteInfos;

	/** 
	 * 二级商户报备审核结果，
SUCCESS: The latest registration or update succeeds.
UNDER_REVIEW: The latest registration is under review.
MODIFICATION_REVIEW: The latest update is under review.
FAILED: The latest registration or update is failed and the reject_reason field will be returned.
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 店铺地址信息
	 */
	@ApiField("store_address")
	private String storeAddress;

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

	/** 
	 * Store status. The value can be one of the following items:
ARCHIVED: The store is archived, so that the store information cannot be viewed.
ACTIVATED: The store is registered successfully.
INACTIVATE: The store is not registered.
	 */
	@ApiField("store_status")
	private String storeStatus;

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getContactEmail( ) {
		return this.contactEmail;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getContactNo( ) {
		return this.contactNo;
	}

	public void setCsEmail(String csEmail) {
		this.csEmail = csEmail;
	}
	public String getCsEmail( ) {
		return this.csEmail;
	}

	public void setCsNo(String csNo) {
		this.csNo = csNo;
	}
	public String getCsNo( ) {
		return this.csNo;
	}

	public void setExternalStorefrontPhoto(String externalStorefrontPhoto) {
		this.externalStorefrontPhoto = externalStorefrontPhoto;
	}
	public String getExternalStorefrontPhoto( ) {
		return this.externalStorefrontPhoto;
	}

	public void setInternalStorePhoto(String internalStorePhoto) {
		this.internalStorePhoto = internalStorePhoto;
	}
	public String getInternalStorePhoto( ) {
		return this.internalStorePhoto;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId( ) {
		return this.partnerId;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getPaymentMethod( ) {
		return this.paymentMethod;
	}

	public void setRegisterAddress(String registerAddress) {
		this.registerAddress = registerAddress;
	}
	public String getRegisterAddress( ) {
		return this.registerAddress;
	}

	public void setRegisterCountry(String registerCountry) {
		this.registerCountry = registerCountry;
	}
	public String getRegisterCountry( ) {
		return this.registerCountry;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getRegistrationNo( ) {
		return this.registrationNo;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public String getRejectReason( ) {
		return this.rejectReason;
	}

	public void setRepresentativeId(String representativeId) {
		this.representativeId = representativeId;
	}
	public String getRepresentativeId( ) {
		return this.representativeId;
	}

	public void setRepresentativeName(String representativeName) {
		this.representativeName = representativeName;
	}
	public String getRepresentativeName( ) {
		return this.representativeName;
	}

	public void setSecondaryMerchantId(String secondaryMerchantId) {
		this.secondaryMerchantId = secondaryMerchantId;
	}
	public String getSecondaryMerchantId( ) {
		return this.secondaryMerchantId;
	}

	public void setSecondaryMerchantIndustry(String secondaryMerchantIndustry) {
		this.secondaryMerchantIndustry = secondaryMerchantIndustry;
	}
	public String getSecondaryMerchantIndustry( ) {
		return this.secondaryMerchantIndustry;
	}

	public void setSecondaryMerchantName(String secondaryMerchantName) {
		this.secondaryMerchantName = secondaryMerchantName;
	}
	public String getSecondaryMerchantName( ) {
		return this.secondaryMerchantName;
	}

	public void setSecondaryMerchantType(String secondaryMerchantType) {
		this.secondaryMerchantType = secondaryMerchantType;
	}
	public String getSecondaryMerchantType( ) {
		return this.secondaryMerchantType;
	}

	public void setSettlementNo(String settlementNo) {
		this.settlementNo = settlementNo;
	}
	public String getSettlementNo( ) {
		return this.settlementNo;
	}

	public void setShareholderId(String shareholderId) {
		this.shareholderId = shareholderId;
	}
	public String getShareholderId( ) {
		return this.shareholderId;
	}

	public void setShareholderName(String shareholderName) {
		this.shareholderName = shareholderName;
	}
	public String getShareholderName( ) {
		return this.shareholderName;
	}

	public void setSiteInfos(List<MerchantSiteInfo> siteInfos) {
		this.siteInfos = siteInfos;
	}
	public List<MerchantSiteInfo> getSiteInfos( ) {
		return this.siteInfos;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}
	public String getStoreAddress( ) {
		return this.storeAddress;
	}

	public void setStoreCountry(String storeCountry) {
		this.storeCountry = storeCountry;
	}
	public String getStoreCountry( ) {
		return this.storeCountry;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getStoreId( ) {
		return this.storeId;
	}

	public void setStoreIndustry(String storeIndustry) {
		this.storeIndustry = storeIndustry;
	}
	public String getStoreIndustry( ) {
		return this.storeIndustry;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStoreName( ) {
		return this.storeName;
	}

	public void setStoreStatus(String storeStatus) {
		this.storeStatus = storeStatus;
	}
	public String getStoreStatus( ) {
		return this.storeStatus;
	}

}
