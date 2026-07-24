package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LsqBusinessLicenseInfo;
import com.alipay.api.domain.LsqContactWayInfo;
import com.alipay.api.domain.LsqLegalPersonInfo;
import com.alipay.api.domain.LsqStoreAddressInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.shopcopydetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-16 10:22:54
 */
public class AlipayCommerceLifeserviceShopcopydetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5254188571783287139L;

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
	private LsqBusinessLicenseInfo businessLicenseInfo;

	/** 
	 * null
	 */
	@ApiListField("contact_ways")
	@ApiField("lsq_contact_way_info")
	private List<LsqContactWayInfo> contactWays;

	/** 
	 * 副本业务ID
	 */
	@ApiField("copy_id")
	private String copyId;

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
	private LsqLegalPersonInfo legalPersonInfo;

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
	 * 驳回原因（审核驳回时有值）
	 */
	@ApiField("reject_reason")
	private String rejectReason;

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
	 * 副本状态: CREATING-创建中 / UPDATING-更新中 / AUDITING-审核中 / PASS-审核通过 / REJECT-审核驳回 / DELETING-删除中 / DISCARDED-已废弃
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 门店地址信息
	 */
	@ApiField("store_address_info")
	private LsqStoreAddressInfo storeAddressInfo;

	/** 
	 * 门店主键ID（正本表ID）
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

	public void setBusinessLicenseInfo(LsqBusinessLicenseInfo businessLicenseInfo) {
		this.businessLicenseInfo = businessLicenseInfo;
	}
	public LsqBusinessLicenseInfo getBusinessLicenseInfo( ) {
		return this.businessLicenseInfo;
	}

	public void setContactWays(List<LsqContactWayInfo> contactWays) {
		this.contactWays = contactWays;
	}
	public List<LsqContactWayInfo> getContactWays( ) {
		return this.contactWays;
	}

	public void setCopyId(String copyId) {
		this.copyId = copyId;
	}
	public String getCopyId( ) {
		return this.copyId;
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

	public void setLegalPersonInfo(LsqLegalPersonInfo legalPersonInfo) {
		this.legalPersonInfo = legalPersonInfo;
	}
	public LsqLegalPersonInfo getLegalPersonInfo( ) {
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

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public String getRejectReason( ) {
		return this.rejectReason;
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

	public void setStoreAddressInfo(LsqStoreAddressInfo storeAddressInfo) {
		this.storeAddressInfo = storeAddressInfo;
	}
	public LsqStoreAddressInfo getStoreAddressInfo( ) {
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
