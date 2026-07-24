package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 安心生活门店更新
 *
 * @author auto create
 * @since 1.0, 2026-07-16 10:17:56
 */
public class AlipayCommerceLifeserviceUnifiedshopModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8461623875595117642L;

	/**
	 * 授权委托书图片osskey
	 */
	@ApiField("authorization_letter")
	private String authorizationLetter;

	/**
	 * 营业执照信息，可选重传，不传则保留原值
	 */
	@ApiField("business_license_info")
	private LumBusinessLicenseInfo businessLicenseInfo;

	/**
	 * null
	 */
	@ApiListField("contact_ways")
	@ApiField("lum_contact_way_info")
	private List<LumContactWayInfo> contactWays;

	/**
	 * 门店副本ID，update_from=COPY时必填
	 */
	@ApiField("copy_id")
	private String copyId;

	/**
	 * 法人身份证信息，与business_license_info同时传或同时不传
	 */
	@ApiField("legal_person_info")
	private LumLegalPersonInfo legalPersonInfo;

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
	 * 证件有效期（资质证明-有效期），格式yyyy-MM-dd，空表示长期有效
	 */
	@ApiField("qualification_expiration_date")
	private String qualificationExpirationDate;

	/**
	 * 资质类型：FOOD_BUSINESS_LICENSE-食品经营许可证 / OTHER_FOOD_BUSINESS_LICENSE-其他食品经营许可证
	 */
	@ApiField("qualification_type")
	private String qualificationType;

	/**
	 * 门店类目编码路径，如A0002/B0013/C0025
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
	 * 门店地址信息（线下门店修改时必填）<a href="https://mdn.alipayobjects.com/moneycard_bizfmcg/afts/file/O4-hR75f0RQAAAAAR_AAAAgADe7SAQBr">获取省、市、区编码</a>
	 */
	@ApiField("store_address_info")
	private LumStoreAddressInfo storeAddressInfo;

	/**
	 * 门店主键ID（正本表ID）
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 补充材料类型：LEASE_CONTRACT-租赁合同 / PROPERTY_CERTIFICATE-产权证明 / AUTHORIZATION_MATERIAL-授权材料
	 */
	@ApiField("supplementary_material_type")
	private String supplementaryMaterialType;

	/**
	 * 补充材料图片URL
	 */
	@ApiField("supplementary_material_url")
	private String supplementaryMaterialUrl;

	/**
	 * 更新来源：ORIGINAL-基于正本更新 / COPY-基于副本更新
	 */
	@ApiField("update_from")
	private String updateFrom;

	public String getAuthorizationLetter() {
		return this.authorizationLetter;
	}
	public void setAuthorizationLetter(String authorizationLetter) {
		this.authorizationLetter = authorizationLetter;
	}

	public LumBusinessLicenseInfo getBusinessLicenseInfo() {
		return this.businessLicenseInfo;
	}
	public void setBusinessLicenseInfo(LumBusinessLicenseInfo businessLicenseInfo) {
		this.businessLicenseInfo = businessLicenseInfo;
	}

	public List<LumContactWayInfo> getContactWays() {
		return this.contactWays;
	}
	public void setContactWays(List<LumContactWayInfo> contactWays) {
		this.contactWays = contactWays;
	}

	public String getCopyId() {
		return this.copyId;
	}
	public void setCopyId(String copyId) {
		this.copyId = copyId;
	}

	public LumLegalPersonInfo getLegalPersonInfo() {
		return this.legalPersonInfo;
	}
	public void setLegalPersonInfo(LumLegalPersonInfo legalPersonInfo) {
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

	public LumStoreAddressInfo getStoreAddressInfo() {
		return this.storeAddressInfo;
	}
	public void setStoreAddressInfo(LumStoreAddressInfo storeAddressInfo) {
		this.storeAddressInfo = storeAddressInfo;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
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

	public String getUpdateFrom() {
		return this.updateFrom;
	}
	public void setUpdateFrom(String updateFrom) {
		this.updateFrom = updateFrom;
	}

}
