package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 闪蝶创建应用接口入参的应用信息对象
 *
 * @author auto create
 * @since 1.0, 2019-12-08 18:38:20
 */
public class MorphoCreateApp extends AlipayObject {

	private static final long serialVersionUID = 4651694167979325355L;

	/**
	 * 小程序类目
	 */
	@ApiField("app_category_ids")
	private String appCategoryIds;

	/**
	 * 小程序描述
	 */
	@ApiField("app_desc")
	private String appDesc;

	/**
	 * 小程序英文名称
	 */
	@ApiField("app_english_name")
	private String appEnglishName;

	/**
	 * 小程序LOGO
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
	 * 闪蝶创建小程序类型应用时应用的业务类型，目前氛围技术型和普通型，普通型不传，技术型为：'TECHNICAL_SUPPORT'
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 小程序所属PID
	 */
	@ApiField("dev_id")
	private String devId;

	/**
	 * 小程序ID，使用已有小程序创建闪蝶站点时使用
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 客服电话
	 */
	@ApiField("service_phone")
	private String servicePhone;

	/**
	 * 闪蝶应用名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 创建的闪蝶应用的类型：小程序、H5等
	 */
	@ApiField("type")
	private String type;

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

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getDevId() {
		return this.devId;
	}
	public void setDevId(String devId) {
		this.devId = devId;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getServicePhone() {
		return this.servicePhone;
	}
	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
