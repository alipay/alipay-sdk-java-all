package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.baseinfo.multi.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-23 11:33:46
 */
public class AlipayOpenMiniBaseinfoMultiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8343951289829934477L;

	/** 
	 * 01:企业 06：个人
	 */
	@ApiField("account_type")
	private String accountType;

	/** 
	 * 小程序应用描述
	 */
	@ApiField("app_desc")
	private String appDesc;

	/** 
	 * 小程序应用英文名称
	 */
	@ApiField("app_english_name")
	private String appEnglishName;

	/** 
	 * 小程序应用logo图标
	 */
	@ApiField("app_logo")
	private String appLogo;

	/** 
	 * 小程序应用名称
	 */
	@ApiField("app_name")
	private String appName;

	/** 
	 * 小程序应用简介，一句话描述小程序功能
	 */
	@ApiField("app_slogan")
	private String appSlogan;

	/** 
	 * 所在地址
	 */
	@ApiField("area")
	private String area;

	/** 
	 * 企业执照注册号
	 */
	@ApiField("business_license_no")
	private String businessLicenseNo;

	/** 
	 * 企业名称
	 */
	@ApiField("business_name")
	private String businessName;

	/** 
	 * 类目名称，格式为第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目;
	 */
	@ApiField("category_names")
	private String categoryNames;

	/** 
	 * 联系人邮箱
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/** 
	 * 联系人手机
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/** 
	 * 联系人
	 */
	@ApiField("contact_name")
	private String contactName;

	/** 
	 * 商户id
	 */
	@ApiField("pid")
	private String pid;

	/** 
	 * 小程序客服邮箱
	 */
	@ApiField("service_email")
	private String serviceEmail;

	/** 
	 * 小程序客服电话
	 */
	@ApiField("service_phone")
	private String servicePhone;

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountType( ) {
		return this.accountType;
	}

	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}
	public String getAppDesc( ) {
		return this.appDesc;
	}

	public void setAppEnglishName(String appEnglishName) {
		this.appEnglishName = appEnglishName;
	}
	public String getAppEnglishName( ) {
		return this.appEnglishName;
	}

	public void setAppLogo(String appLogo) {
		this.appLogo = appLogo;
	}
	public String getAppLogo( ) {
		return this.appLogo;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppName( ) {
		return this.appName;
	}

	public void setAppSlogan(String appSlogan) {
		this.appSlogan = appSlogan;
	}
	public String getAppSlogan( ) {
		return this.appSlogan;
	}

	public void setArea(String area) {
		this.area = area;
	}
	public String getArea( ) {
		return this.area;
	}

	public void setBusinessLicenseNo(String businessLicenseNo) {
		this.businessLicenseNo = businessLicenseNo;
	}
	public String getBusinessLicenseNo( ) {
		return this.businessLicenseNo;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getBusinessName( ) {
		return this.businessName;
	}

	public void setCategoryNames(String categoryNames) {
		this.categoryNames = categoryNames;
	}
	public String getCategoryNames( ) {
		return this.categoryNames;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getContactEmail( ) {
		return this.contactEmail;
	}

	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}
	public String getContactMobile( ) {
		return this.contactMobile;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactName( ) {
		return this.contactName;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPid( ) {
		return this.pid;
	}

	public void setServiceEmail(String serviceEmail) {
		this.serviceEmail = serviceEmail;
	}
	public String getServiceEmail( ) {
		return this.serviceEmail;
	}

	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}
	public String getServicePhone( ) {
		return this.servicePhone;
	}

}
