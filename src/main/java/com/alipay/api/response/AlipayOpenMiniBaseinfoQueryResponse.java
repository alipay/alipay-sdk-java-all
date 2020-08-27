package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.baseinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-16 10:17:11
 */
public class AlipayOpenMiniBaseinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5185996667489261593L;

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
