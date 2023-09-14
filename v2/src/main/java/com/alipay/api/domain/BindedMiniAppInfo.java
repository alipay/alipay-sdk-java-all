package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 已绑定小程序信息
 *
 * @author auto create
 * @since 1.0, 2020-07-06 10:10:19
 */
public class BindedMiniAppInfo extends AlipayObject {

	private static final long serialVersionUID = 5247315889846665295L;

	/**
	 * 开发者名称
	 */
	@ApiField("dev_name")
	private String devName;

	/**
	 * 小程序应用ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 小程序logo url地址
	 */
	@ApiField("mini_app_logo")
	private String miniAppLogo;

	/**
	 * 小程序名称
	 */
	@ApiField("mini_app_name")
	private String miniAppName;

	/**
	 * 小程序的简介
	 */
	@ApiField("mini_app_slogan")
	private String miniAppSlogan;

	/**
	 * true：小程序在架
false：小程序当前未在架
	 */
	@ApiField("online")
	private Boolean online;

	/**
	 * 当前小程序是否加入AMPE计划，小程序开发者可以自行进行AMPE的开通和关闭
	 */
	@ApiField("support_ampe")
	private Boolean supportAmpe;

	public String getDevName() {
		return this.devName;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getMiniAppLogo() {
		return this.miniAppLogo;
	}
	public void setMiniAppLogo(String miniAppLogo) {
		this.miniAppLogo = miniAppLogo;
	}

	public String getMiniAppName() {
		return this.miniAppName;
	}
	public void setMiniAppName(String miniAppName) {
		this.miniAppName = miniAppName;
	}

	public String getMiniAppSlogan() {
		return this.miniAppSlogan;
	}
	public void setMiniAppSlogan(String miniAppSlogan) {
		this.miniAppSlogan = miniAppSlogan;
	}

	public Boolean getOnline() {
		return this.online;
	}
	public void setOnline(Boolean online) {
		this.online = online;
	}

	public Boolean getSupportAmpe() {
		return this.supportAmpe;
	}
	public void setSupportAmpe(Boolean supportAmpe) {
		this.supportAmpe = supportAmpe;
	}

}
