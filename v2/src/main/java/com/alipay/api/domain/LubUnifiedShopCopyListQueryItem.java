package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-16 10:22:54
 */
public class LubUnifiedShopCopyListQueryItem extends AlipayObject {

	private static final long serialVersionUID = 4743744684843748161L;

	/**
	 * 营业执照信息
	 */
	@ApiField("business_license_info")
	private LubBusinessCopyLicenseInfo businessLicenseInfo;

	/**
	 * null
	 */
	@ApiListField("contact_ways")
	@ApiField("lub_copy_contact_way_info")
	private List<LubCopyContactWayInfo> contactWays;

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
	private LubLegalCopyPersonInfo legalPersonInfo;

	/**
	 * 商户ID
	 */
	@ApiField("pid")
	private String pid;

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
	 * 驳回原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

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
	 * 门店类型
	 */
	@ApiField("shop_type")
	private String shopType;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 门店地址信息
	 */
	@ApiField("store_address_info")
	private LubStoreCopyAddressInfo storeAddressInfo;

	/**
	 * 门店主键ID
	 */
	@ApiField("store_id")
	private String storeId;

	public LubBusinessCopyLicenseInfo getBusinessLicenseInfo() {
		return this.businessLicenseInfo;
	}
	public void setBusinessLicenseInfo(LubBusinessCopyLicenseInfo businessLicenseInfo) {
		this.businessLicenseInfo = businessLicenseInfo;
	}

	public List<LubCopyContactWayInfo> getContactWays() {
		return this.contactWays;
	}
	public void setContactWays(List<LubCopyContactWayInfo> contactWays) {
		this.contactWays = contactWays;
	}

	public String getCopyId() {
		return this.copyId;
	}
	public void setCopyId(String copyId) {
		this.copyId = copyId;
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

	public LubLegalCopyPersonInfo getLegalPersonInfo() {
		return this.legalPersonInfo;
	}
	public void setLegalPersonInfo(LubLegalCopyPersonInfo legalPersonInfo) {
		this.legalPersonInfo = legalPersonInfo;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
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

	public String getRejectReason() {
		return this.rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public LubStoreCopyAddressInfo getStoreAddressInfo() {
		return this.storeAddressInfo;
	}
	public void setStoreAddressInfo(LubStoreCopyAddressInfo storeAddressInfo) {
		this.storeAddressInfo = storeAddressInfo;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
