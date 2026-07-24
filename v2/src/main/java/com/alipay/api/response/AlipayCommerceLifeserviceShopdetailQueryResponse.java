package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LudBusinessLicenseInfo;
import com.alipay.api.domain.LudContactWayInfo;
import com.alipay.api.domain.LudLegalPersonInfo;
import com.alipay.api.domain.LudStoreAddressInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.shopdetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-16 10:22:54
 */
public class AlipayCommerceLifeserviceShopdetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1314459932171354564L;

	/** 
	 * 授权委托书图片osskey
	 */
	@ApiField("authorization_letter")
	private String authorizationLetter;

	/** 
	 * 授权委托书图片URL
	 */
	@ApiField("authorization_letter_url")
	private String authorizationLetterUrl;

	/** 
	 * 营业执照信息
	 */
	@ApiField("business_license_info")
	private LudBusinessLicenseInfo businessLicenseInfo;

	/** 
	 * null
	 */
	@ApiListField("contact_ways")
	@ApiField("lud_contact_way_info")
	private List<LudContactWayInfo> contactWays;

	/** 
	 * 创建时间，格式 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/** 
	 * 修改时间，格式 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/** 
	 * 法人身份证信息
	 */
	@ApiField("legal_person_info")
	private LudLegalPersonInfo legalPersonInfo;

	/** 
	 * MCC类目编码
	 */
	@ApiField("mcc_code")
	private String mccCode;

	/** 
	 * 许可证编码（资质证明-许可证编码）
	 */
	@ApiField("qualification_business_license")
	private String qualificationBusinessLicense;

	/** 
	 * 资质证明图片URL
	 */
	@ApiField("qualification_certificates")
	private String qualificationCertificates;

	/** 
	 * 证件有效期（资质证明-有效期），格式 yyyy-MM-dd
	 */
	@ApiField("qualification_expiration_date")
	private String qualificationExpirationDate;

	/** 
	 * 资质类型: FOOD_BUSINESS_LICENSE-食品经营许可证 / OTHER_FOOD_BUSINESS_LICENSE-其他食品经营许可证
	 */
	@ApiField("qualification_type")
	private String qualificationType;

	/** 
	 * 门店类目编码路径
	 */
	@ApiField("shop_category")
	private String shopCategory;

	/** 
	 * 门店类目名称
	 */
	@ApiField("shop_category_name")
	private String shopCategoryName;

	/** 
	 * 蚂蚁门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/** 
	 * 门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/** 
	 * 门店类型: PHYSICAL_STORE-线下门店 / CLOUD_STORE-线上云店
	 */
	@ApiField("shop_type")
	private String shopType;

	/** 
	 * 门店状态: INIT-初始化 / NORMAL-正常 / CANCEL-注销 / FREEZON-冻结 / PAUSED-暂停营业
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 门店地址信息
	 */
	@ApiField("store_address_info")
	private LudStoreAddressInfo storeAddressInfo;

	/** 
	 * 门店主键ID
	 */
	@ApiField("store_id")
	private String storeId;

	/** 
	 * 补充材料类型: LEASE_CONTRACT-租赁合同 / PROPERTY_CERTIFICATE-产权证明 / AUTHORIZATION_MATERIAL-授权材料
	 */
	@ApiField("supplementary_material_type")
	private String supplementaryMaterialType;

	/** 
	 * 补充材料图片URL
	 */
	@ApiField("supplementary_material_url")
	private String supplementaryMaterialUrl;

	public void setAuthorizationLetter(String authorizationLetter) {
		this.authorizationLetter = authorizationLetter;
	}
	public String getAuthorizationLetter( ) {
		return this.authorizationLetter;
	}

	public void setAuthorizationLetterUrl(String authorizationLetterUrl) {
		this.authorizationLetterUrl = authorizationLetterUrl;
	}
	public String getAuthorizationLetterUrl( ) {
		return this.authorizationLetterUrl;
	}

	public void setBusinessLicenseInfo(LudBusinessLicenseInfo businessLicenseInfo) {
		this.businessLicenseInfo = businessLicenseInfo;
	}
	public LudBusinessLicenseInfo getBusinessLicenseInfo( ) {
		return this.businessLicenseInfo;
	}

	public void setContactWays(List<LudContactWayInfo> contactWays) {
		this.contactWays = contactWays;
	}
	public List<LudContactWayInfo> getContactWays( ) {
		return this.contactWays;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public String getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}
	public String getGmtModified( ) {
		return this.gmtModified;
	}

	public void setLegalPersonInfo(LudLegalPersonInfo legalPersonInfo) {
		this.legalPersonInfo = legalPersonInfo;
	}
	public LudLegalPersonInfo getLegalPersonInfo( ) {
		return this.legalPersonInfo;
	}

	public void setMccCode(String mccCode) {
		this.mccCode = mccCode;
	}
	public String getMccCode( ) {
		return this.mccCode;
	}

	public void setQualificationBusinessLicense(String qualificationBusinessLicense) {
		this.qualificationBusinessLicense = qualificationBusinessLicense;
	}
	public String getQualificationBusinessLicense( ) {
		return this.qualificationBusinessLicense;
	}

	public void setQualificationCertificates(String qualificationCertificates) {
		this.qualificationCertificates = qualificationCertificates;
	}
	public String getQualificationCertificates( ) {
		return this.qualificationCertificates;
	}

	public void setQualificationExpirationDate(String qualificationExpirationDate) {
		this.qualificationExpirationDate = qualificationExpirationDate;
	}
	public String getQualificationExpirationDate( ) {
		return this.qualificationExpirationDate;
	}

	public void setQualificationType(String qualificationType) {
		this.qualificationType = qualificationType;
	}
	public String getQualificationType( ) {
		return this.qualificationType;
	}

	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}
	public String getShopCategory( ) {
		return this.shopCategory;
	}

	public void setShopCategoryName(String shopCategoryName) {
		this.shopCategoryName = shopCategoryName;
	}
	public String getShopCategoryName( ) {
		return this.shopCategoryName;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopName( ) {
		return this.shopName;
	}

	public void setShopType(String shopType) {
		this.shopType = shopType;
	}
	public String getShopType( ) {
		return this.shopType;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setStoreAddressInfo(LudStoreAddressInfo storeAddressInfo) {
		this.storeAddressInfo = storeAddressInfo;
	}
	public LudStoreAddressInfo getStoreAddressInfo( ) {
		return this.storeAddressInfo;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getStoreId( ) {
		return this.storeId;
	}

	public void setSupplementaryMaterialType(String supplementaryMaterialType) {
		this.supplementaryMaterialType = supplementaryMaterialType;
	}
	public String getSupplementaryMaterialType( ) {
		return this.supplementaryMaterialType;
	}

	public void setSupplementaryMaterialUrl(String supplementaryMaterialUrl) {
		this.supplementaryMaterialUrl = supplementaryMaterialUrl;
	}
	public String getSupplementaryMaterialUrl( ) {
		return this.supplementaryMaterialUrl;
	}

}
