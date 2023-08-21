package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建支付宝IOT应用
 *
 * @author auto create
 * @since 1.0, 2021-03-22 09:58:19
 */
public class AlipayOpenBpaasAppCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5423898279918562337L;

	/**
	 * 应用icon 链接下载地址
	 */
	@ApiField("app_icon_url")
	private String appIconUrl;

	/**
	 * 应用介绍
	 */
	@ApiField("app_introduction")
	private String appIntroduction;

	/**
	 * 应用名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 可选参数，ANDROID应用为必填项
	 */
	@ApiField("app_package")
	private String appPackage;

	/**
	 * 应用平台，native应用类型支持ANDROID、ROTS、LINUX、WINDOWS
	 */
	@ApiField("app_platform")
	private String appPlatform;

	/**
	 * 应用签名
	 */
	@ApiField("app_sign")
	private String appSign;

	/**
	 * 应用类型，IOT_BPAAS_MOBILE
	 */
	@ApiField("app_type")
	private String appType;

	public String getAppIconUrl() {
		return this.appIconUrl;
	}
	public void setAppIconUrl(String appIconUrl) {
		this.appIconUrl = appIconUrl;
	}

	public String getAppIntroduction() {
		return this.appIntroduction;
	}
	public void setAppIntroduction(String appIntroduction) {
		this.appIntroduction = appIntroduction;
	}

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppPackage() {
		return this.appPackage;
	}
	public void setAppPackage(String appPackage) {
		this.appPackage = appPackage;
	}

	public String getAppPlatform() {
		return this.appPlatform;
	}
	public void setAppPlatform(String appPlatform) {
		this.appPlatform = appPlatform;
	}

	public String getAppSign() {
		return this.appSign;
	}
	public void setAppSign(String appSign) {
		this.appSign = appSign;
	}

	public String getAppType() {
		return this.appType;
	}
	public void setAppType(String appType) {
		this.appType = appType;
	}

}
