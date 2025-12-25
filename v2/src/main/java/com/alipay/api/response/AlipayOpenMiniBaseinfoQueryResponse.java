package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.baseinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-15 14:02:14
 */
public class AlipayOpenMiniBaseinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5624956553296363333L;

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
	 * 类目名称，格式为第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目;
	 */
	@ApiField("category_names")
	private String categoryNames;

	/** 
	 * 功能包名称
	 */
	@ApiListField("package_names")
	@ApiField("string")
	private List<String> packageNames;

	/** 
	 * false：非受限发布；true：受限发布。
受限发布：是为了能让首次发版的小程序在备案未完成的情况下，进行上架的一种折中的操作方式，小程序可以上架可扫码进行使用，但不可被搜索、限制访问人数（50人/每天）、限制公域（无法进行商品、服务、营促销）、限制上架后90天不完成备案自动下架。
	 */
	@ApiField("registration_limit_release")
	private Boolean registrationLimitRelease;

	/** 
	 * 域白名单
	 */
	@ApiListField("safe_domains")
	@ApiField("string")
	private List<String> safeDomains;

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

	public void setCategoryNames(String categoryNames) {
		this.categoryNames = categoryNames;
	}
	public String getCategoryNames( ) {
		return this.categoryNames;
	}

	public void setPackageNames(List<String> packageNames) {
		this.packageNames = packageNames;
	}
	public List<String> getPackageNames( ) {
		return this.packageNames;
	}

	public void setRegistrationLimitRelease(Boolean registrationLimitRelease) {
		this.registrationLimitRelease = registrationLimitRelease;
	}
	public Boolean getRegistrationLimitRelease( ) {
		return this.registrationLimitRelease;
	}

	public void setSafeDomains(List<String> safeDomains) {
		this.safeDomains = safeDomains;
	}
	public List<String> getSafeDomains( ) {
		return this.safeDomains;
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
