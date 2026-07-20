package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 安心生活门店创建
 *
 * @author auto create
 * @since 1.0, 2026-07-16 10:17:55
 */
public class AlipayCommerceLifeserviceShopCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3639136273115264245L;

	/**
	 * 授权委托书图片osskey
	 */
	@ApiField("authorization_letter")
	private String authorizationLetter;

	/**
	 * 营业执照信息
	 */
	@ApiField("business_license_info")
	private LucBusinessLicenseInfo businessLicenseInfo;

	/**
	 * null
	 */
	@ApiListField("contact_ways")
	@ApiField("luc_contact_way_info")
	private List<LucContactWayInfo> contactWays;

	/**
	 * 法人身份证信息
	 */
	@ApiField("legal_person_info")
	private LucLegalPersonInfo legalPersonInfo;

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
	 * 资质类型: 营业执照-BUSINESS_LICENSE/
食品卫生许可证-FOOD_SANITATION_LICENSE/
卫生许可证-SANITATION_LICENSE
	 */
	@ApiField("qualification_type")
	private String qualificationType;

	/**
	 * 门店类目编码
	 */
	@ApiField("shop_category")
	private String shopCategory;

	/**
	 * 门店类目名称
	 */
	@ApiField("shop_category_name")
	private String shopCategoryName;

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
	 * 门店地址信息（线下门店必填）<a href="https://mdn.alipayobjects.com/moneycard_bizfmcg/afts/file/O4-hR75f0RQAAAAAR_AAAAgADe7SAQBr">获取省、市、区编码</a>
	 */
	@ApiField("store_address_info")
	private LucStoreAddressInfo storeAddressInfo;

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

	public String getAuthorizationLetter() {
		return this.authorizationLetter;
	}
	public void setAuthorizationLetter(String authorizationLetter) {
		this.authorizationLetter = authorizationLetter;
	}

	public LucBusinessLicenseInfo getBusinessLicenseInfo() {
		return this.businessLicenseInfo;
	}
	public void setBusinessLicenseInfo(LucBusinessLicenseInfo businessLicenseInfo) {
		this.businessLicenseInfo = businessLicenseInfo;
	}

	public List<LucContactWayInfo> getContactWays() {
		return this.contactWays;
	}
	public void setContactWays(List<LucContactWayInfo> contactWays) {
		this.contactWays = contactWays;
	}

	public LucLegalPersonInfo getLegalPersonInfo() {
		return this.legalPersonInfo;
	}
	public void setLegalPersonInfo(LucLegalPersonInfo legalPersonInfo) {
		this.legalPersonInfo = legalPersonInfo;
	}

	public String getQualificationBusinessLicense() {
		return this.qualificationBusinessLicense;
	}
	public void setQualificationBusinessLicense(String qualificationBusinessLicense) {
		this.qualificationBusinessLicense = qualificationBusinessLicense;
	}

	public String getQualificationCertificates() {
		return this.qualificationCertificates;
	}
	public void setQualificationCertificates(String qualificationCertificates) {
		this.qualificationCertificates = qualificationCertificates;
	}

	public String getQualificationExpirationDate() {
		return this.qualificationExpirationDate;
	}
	public void setQualificationExpirationDate(String qualificationExpirationDate) {
		this.qualificationExpirationDate = qualificationExpirationDate;
	}

	public String getQualificationType() {
		return this.qualificationType;
	}
	public void setQualificationType(String qualificationType) {
		this.qualificationType = qualificationType;
	}

	public String getShopCategory() {
		return this.shopCategory;
	}
	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}

	public String getShopCategoryName() {
		return this.shopCategoryName;
	}
	public void setShopCategoryName(String shopCategoryName) {
		this.shopCategoryName = shopCategoryName;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopType() {
		return this.shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public LucStoreAddressInfo getStoreAddressInfo() {
		return this.storeAddressInfo;
	}
	public void setStoreAddressInfo(LucStoreAddressInfo storeAddressInfo) {
		this.storeAddressInfo = storeAddressInfo;
	}

	public String getSupplementaryMaterialType() {
		return this.supplementaryMaterialType;
	}
	public void setSupplementaryMaterialType(String supplementaryMaterialType) {
		this.supplementaryMaterialType = supplementaryMaterialType;
	}

	public String getSupplementaryMaterialUrl() {
		return this.supplementaryMaterialUrl;
	}
	public void setSupplementaryMaterialUrl(String supplementaryMaterialUrl) {
		this.supplementaryMaterialUrl = supplementaryMaterialUrl;
	}

}
