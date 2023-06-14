package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ka外部平台一键入驻生活号
 *
 * @author auto create
 * @since 1.0, 2022-12-14 19:41:14
 */
public class AlipayOpenPublicLifeaccountCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1185417973239919545L;

	/**
	 * 勾选同意生活号协议（true：同意，false：不同意）
	 */
	@ApiField("agreement")
	private String agreement;

	/**
	 * 号主页背景图
	 */
	@ApiField("background")
	private String background;

	/**
	 * 营业执照号
	 */
	@ApiField("biz_license_no")
	private String bizLicenseNo;

	/**
	 * 商标授权
	 */
	@ApiListField("brand_authorization")
	@ApiField("string")
	private List<String> brandAuthorization;

	/**
	 * 生活号的简介信息
	 */
	@ApiField("brief_introduction")
	private String briefIntroduction;

	/**
	 * 营业执照图片地址
	 */
	@ApiField("business_license")
	private String businessLicense;

	/**
	 * 行业类目mcc类目code
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 联系人电子邮件
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/**
	 * 作为生活号管理者的联系人
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 联系人电话
	 */
	@ApiField("contact_tel")
	private String contactTel;

	/**
	 * 客服电话
	 */
	@ApiField("customer_tel")
	private String customerTel;

	/**
	 * 生活号头像地址
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 菜单信息（非必填）（一级菜单最多4个，具体的菜单格式，见文档
	 */
	@ApiField("menu_info")
	private String menuInfo;

	/**
	 * 生活号名称（店铺名等）
	 */
	@ApiField("name")
	private String name;

	/**
	 * 支付宝用户唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 平台帐号id（比如1688帐号id）
	 */
	@ApiField("platform_account_id")
	private String platformAccountId;

	/**
	 * 平台码（标识1688、饿了么等）
	 */
	@ApiField("platform_unique_id")
	private String platformUniqueId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAgreement() {
		return this.agreement;
	}
	public void setAgreement(String agreement) {
		this.agreement = agreement;
	}

	public String getBackground() {
		return this.background;
	}
	public void setBackground(String background) {
		this.background = background;
	}

	public String getBizLicenseNo() {
		return this.bizLicenseNo;
	}
	public void setBizLicenseNo(String bizLicenseNo) {
		this.bizLicenseNo = bizLicenseNo;
	}

	public List<String> getBrandAuthorization() {
		return this.brandAuthorization;
	}
	public void setBrandAuthorization(List<String> brandAuthorization) {
		this.brandAuthorization = brandAuthorization;
	}

	public String getBriefIntroduction() {
		return this.briefIntroduction;
	}
	public void setBriefIntroduction(String briefIntroduction) {
		this.briefIntroduction = briefIntroduction;
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

	public String getContactEmail() {
		return this.contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactTel() {
		return this.contactTel;
	}
	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}

	public String getCustomerTel() {
		return this.customerTel;
	}
	public void setCustomerTel(String customerTel) {
		this.customerTel = customerTel;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getMenuInfo() {
		return this.menuInfo;
	}
	public void setMenuInfo(String menuInfo) {
		this.menuInfo = menuInfo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPlatformAccountId() {
		return this.platformAccountId;
	}
	public void setPlatformAccountId(String platformAccountId) {
		this.platformAccountId = platformAccountId;
	}

	public String getPlatformUniqueId() {
		return this.platformUniqueId;
	}
	public void setPlatformUniqueId(String platformUniqueId) {
		this.platformUniqueId = platformUniqueId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
