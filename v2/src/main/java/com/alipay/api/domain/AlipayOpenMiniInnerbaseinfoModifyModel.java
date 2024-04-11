package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多端小程序-修改基本信息
 *
 * @author auto create
 * @since 1.0, 2021-10-09 10:16:54
 */
public class AlipayOpenMiniInnerbaseinfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8726555729923614152L;

	/**
	 * 应用别名，简称
	 */
	@ApiField("app_alias_name")
	private String appAliasName;

	/**
	 * 类目列表
	 */
	@ApiField("app_category_ids")
	private String appCategoryIds;

	/**
	 * 小程序应用描述，20-200个字
	 */
	@ApiField("app_desc")
	private String appDesc;

	/**
	 * 小程序应用英文名称
	 */
	@ApiField("app_english_name")
	private String appEnglishName;

	/**
	 * 手淘开放平台鉴权key，支付宝不需要
	 */
	@ApiField("app_key")
	private String appKey;

	/**
	 * 小程序logo图标，建议上传像素为180*180
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
	 * 租户code，alipay 或是 taobao
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 小程序Id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

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

	public String getAppAliasName() {
		return this.appAliasName;
	}
	public void setAppAliasName(String appAliasName) {
		this.appAliasName = appAliasName;
	}

	public String getAppCategoryIds() {
		return this.appCategoryIds;
	}
	public void setAppCategoryIds(String appCategoryIds) {
		this.appCategoryIds = appCategoryIds;
	}

	public String getAppDesc() {
		return this.appDesc;
	}
	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}

	public String getAppEnglishName() {
		return this.appEnglishName;
	}
	public void setAppEnglishName(String appEnglishName) {
		this.appEnglishName = appEnglishName;
	}

	public String getAppKey() {
		return this.appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getAppLogo() {
		return this.appLogo;
	}
	public void setAppLogo(String appLogo) {
		this.appLogo = appLogo;
	}

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppSlogan() {
		return this.appSlogan;
	}
	public void setAppSlogan(String appSlogan) {
		this.appSlogan = appSlogan;
	}

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getServiceEmail() {
		return this.serviceEmail;
	}
	public void setServiceEmail(String serviceEmail) {
		this.serviceEmail = serviceEmail;
	}

	public String getServicePhone() {
		return this.servicePhone;
	}
	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}

}
