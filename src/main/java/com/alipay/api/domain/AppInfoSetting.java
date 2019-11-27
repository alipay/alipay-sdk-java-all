package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务窗基本信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class AppInfoSetting extends AlipayObject {

	private static final long serialVersionUID = 2566859865313494167L;

	/**
	 * 介绍
	 */
	@ApiField("app_desc")
	private String appDesc;

	/**
	 * 该公众账号是否能绑定外部户的标识
	 */
	@ApiField("can_add_third_account")
	private String canAddThirdAccount;

	/**
	 * 可以绑定外部户时，页面显示的文案
	 */
	@ApiField("display_third_account_text")
	private String displayThirdAccountText;

	/**
	 * 关注欢迎语
	 */
	@ApiField("greeting")
	private String greeting;

	/**
	 * 头像地址
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 公众号页面顶部分割线颜色
	 */
	@ApiField("public_divider_color")
	private String publicDividerColor;

	/**
	 * 服务区域
	 */
	@ApiField("service_area")
	private String serviceArea;

	public String getAppDesc() {
		return this.appDesc;
	}
	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}

	public String getCanAddThirdAccount() {
		return this.canAddThirdAccount;
	}
	public void setCanAddThirdAccount(String canAddThirdAccount) {
		this.canAddThirdAccount = canAddThirdAccount;
	}

	public String getDisplayThirdAccountText() {
		return this.displayThirdAccountText;
	}
	public void setDisplayThirdAccountText(String displayThirdAccountText) {
		this.displayThirdAccountText = displayThirdAccountText;
	}

	public String getGreeting() {
		return this.greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getPublicDividerColor() {
		return this.publicDividerColor;
	}
	public void setPublicDividerColor(String publicDividerColor) {
		this.publicDividerColor = publicDividerColor;
	}

	public String getServiceArea() {
		return this.serviceArea;
	}
	public void setServiceArea(String serviceArea) {
		this.serviceArea = serviceArea;
	}

}
