package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerversion.last.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 17:50:57
 */
public class AlipayOpenMiniInnerversionLastQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6857844451393716514L;

	/** 
	 * 小程序应用描述
	 */
	@ApiField("app_desc")
	private String appDesc;

	/** 
	 * 小程序的名称
	 */
	@ApiField("app_name")
	private String appName;

	/** 
	 * 版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/** 
	 * 端信息
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/** 
	 * 小程序所属类目
	 */
	@ApiField("category_ids")
	private String categoryIds;

	/** 
	 * 小程序英文名称
	 */
	@ApiField("english_name")
	private String englishName;

	/** 
	 * 小程序应用logo图标
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/** 
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/** 
	 * 小程序客服电话
	 */
	@ApiField("service_phone")
	private String servicePhone;

	/** 
	 * 小程序应用简介，一句话描述小程序功能
	 */
	@ApiField("slogan")
	private String slogan;

	/** 
	 * 版本状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 小程序子类型，自研、模板类型
	 */
	@ApiField("sub_application_type")
	private String subApplicationType;

	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}
	public String getAppDesc( ) {
		return this.appDesc;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppName( ) {
		return this.appName;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
	public String getAppVersion( ) {
		return this.appVersion;
	}

	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}
	public String getBundleId( ) {
		return this.bundleId;
	}

	public void setCategoryIds(String categoryIds) {
		this.categoryIds = categoryIds;
	}
	public String getCategoryIds( ) {
		return this.categoryIds;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}
	public String getEnglishName( ) {
		return this.englishName;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	public String getLogoUrl( ) {
		return this.logoUrl;
	}

	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}
	public String getMiniAppId( ) {
		return this.miniAppId;
	}

	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}
	public String getServicePhone( ) {
		return this.servicePhone;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	public String getSlogan( ) {
		return this.slogan;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setSubApplicationType(String subApplicationType) {
		this.subApplicationType = subApplicationType;
	}
	public String getSubApplicationType( ) {
		return this.subApplicationType;
	}

}
