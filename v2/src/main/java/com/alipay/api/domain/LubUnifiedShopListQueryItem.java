package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-16 10:27:53
 */
public class LubUnifiedShopListQueryItem extends AlipayObject {

	private static final long serialVersionUID = 7849292638727959588L;

	/**
	 * 营业执照信息
	 */
	@ApiField("business_license_info")
	private LubBusinessLicenseInfo businessLicenseInfo;

	/**
	 * null
	 */
	@ApiListField("contact_ways")
	@ApiField("lub_contact_way_info")
	private List<LubContactWayInfo> contactWays;

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
	private LubLegalPersonInfo legalPersonInfo;

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
	 * 资质类型
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
	 * 门店类型
	 */
	@ApiField("shop_type")
	private String shopType;

	/**
	 * 门店状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 门店地址信息
	 */
	@ApiField("store_address_info")
	private LubStoreAddressInfo storeAddressInfo;

	/**
	 * 门店主键ID
	 */
	@ApiField("store_id")
	private String storeId;

	public LubBusinessLicenseInfo getBusinessLicenseInfo() {
		return this.businessLicenseInfo;
	}
	public void setBusinessLicenseInfo(LubBusinessLicenseInfo businessLicenseInfo) {
		this.businessLicenseInfo = businessLicenseInfo;
	}

	public List<LubContactWayInfo> getContactWays() {
		return this.contactWays;
	}
	public void setContactWays(List<LubContactWayInfo> contactWays) {
		this.contactWays = contactWays;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public LubLegalPersonInfo getLegalPersonInfo() {
		return this.legalPersonInfo;
	}
	public void setLegalPersonInfo(LubLegalPersonInfo legalPersonInfo) {
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

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public LubStoreAddressInfo getStoreAddressInfo() {
		return this.storeAddressInfo;
	}
	public void setStoreAddressInfo(LubStoreAddressInfo storeAddressInfo) {
		this.storeAddressInfo = storeAddressInfo;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
