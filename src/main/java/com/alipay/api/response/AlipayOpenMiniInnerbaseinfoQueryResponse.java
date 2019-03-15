package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerbaseinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenMiniInnerbaseinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7481425762868663852L;

	/** 
	 * 类目Id列表
	 */
	@ApiField("app_category_ids")
	private String appCategoryIds;

	/** 
	 * 小程序应用描述
	 */
	@ApiField("app_desc")
	private String appDesc;

	/** 
	 * 小程序英文名称
	 */
	@ApiField("app_english_name")
	private String appEnglishName;

	/** 
	 * 小程序应用logo图标
	 */
	@ApiField("app_logo")
	private String appLogo;

	/** 
	 * 小程序名称
	 */
	@ApiField("app_name")
	private String appName;

	/** 
	 * 小程序简介
	 */
	@ApiField("app_slogan")
	private String appSlogan;

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

	public void setAppCategoryIds(String appCategoryIds) {
		this.appCategoryIds = appCategoryIds;
	}
	public String getAppCategoryIds( ) {
		return this.appCategoryIds;
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
