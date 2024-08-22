package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序基本信息返回
 *
 * @author auto create
 * @since 1.0, 2020-12-30 22:19:08
 */
public class MiniAppBaseInfoQueryResponse extends AlipayObject {

	private static final long serialVersionUID = 3672167761656181247L;

	/**
	 * 应用别名，简称
	 */
	@ApiField("app_alias_name")
	private String appAliasName;

	/**
	 * 小程序应用描述
	 */
	@ApiField("app_desc")
	private String appDesc;

	/**
	 * tinyapp
	 */
	@ApiField("app_english_name")
	private String appEnglishName;

	/**
	 * 手淘开放平台鉴权key，支付宝不需要
	 */
	@ApiField("app_key")
	private String appKey;

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
	 * 小程序类型，TINYAPP_TEMPLATE，TINYAPP_NORMAL，TINYAPP_PLUGIN
	 */
	@ApiField("app_sub_type")
	private String appSubType;

	/**
	 * 小程序所属主体信息
	 */
	@ApiField("dev_id")
	private String devId;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 小程序id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 应用创建来源，alipay = 支付宝，taobao = 淘宝
	 */
	@ApiField("origin")
	private String origin;

	/**
	 * 1：表示上线状态 0：初始化状态 -1 下架状态
	 */
	@ApiField("status")
	private String status;

	public String getAppAliasName() {
		return this.appAliasName;
	}
	public void setAppAliasName(String appAliasName) {
		this.appAliasName = appAliasName;
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

	public String getAppSubType() {
		return this.appSubType;
	}
	public void setAppSubType(String appSubType) {
		this.appSubType = appSubType;
	}

	public String getDevId() {
		return this.devId;
	}
	public void setDevId(String devId) {
		this.devId = devId;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getOrigin() {
		return this.origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
