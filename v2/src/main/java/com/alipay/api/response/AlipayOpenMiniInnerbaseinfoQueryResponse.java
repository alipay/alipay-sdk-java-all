package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerbaseinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:36
 */
public class AlipayOpenMiniInnerbaseinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6492878419655478151L;

	/** 
	 * 小程序别名，简称
	 */
	@ApiField("app_alias_name")
	private String appAliasName;

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
	 * 小程序主体创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 小程序主体更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/** 
	 * 小程序Id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/** 
	 * 新小程序前台类目，一级与二级、三级用下划线隔开，最多可以选四个类目，类目之间;隔开。使用后不再读取app_category_ids值，老前台类目将废弃
	 */
	@ApiField("mini_category_ids")
	private String miniCategoryIds;

	/** 
	 * 应用创建来源，alipay = 支付宝，taobao = 淘宝
	 */
	@ApiField("origin")
	private String origin;

	/** 
	 * 小程序主体信息
	 */
	@ApiField("owner_entity")
	private String ownerEntity;

	/** 
	 * 小程序主体头像信息
	 */
	@ApiField("owner_portrait")
	private String ownerPortrait;

	/** 
	 * AUTO/自动更新、MANUAL/手动更新
	 */
	@ApiField("plugin_refresh_type")
	private String pluginRefreshType;

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

	public void setAppAliasName(String appAliasName) {
		this.appAliasName = appAliasName;
	}
	public String getAppAliasName( ) {
		return this.appAliasName;
	}

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

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}
	public String getAppKey( ) {
		return this.appKey;
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

	public void setAppSubType(String appSubType) {
		this.appSubType = appSubType;
	}
	public String getAppSubType( ) {
		return this.appSubType;
	}

	public void setDevId(String devId) {
		this.devId = devId;
	}
	public String getDevId( ) {
		return this.devId;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	public Date getGmtModified( ) {
		return this.gmtModified;
	}

	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}
	public String getMiniAppId( ) {
		return this.miniAppId;
	}

	public void setMiniCategoryIds(String miniCategoryIds) {
		this.miniCategoryIds = miniCategoryIds;
	}
	public String getMiniCategoryIds( ) {
		return this.miniCategoryIds;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getOrigin( ) {
		return this.origin;
	}

	public void setOwnerEntity(String ownerEntity) {
		this.ownerEntity = ownerEntity;
	}
	public String getOwnerEntity( ) {
		return this.ownerEntity;
	}

	public void setOwnerPortrait(String ownerPortrait) {
		this.ownerPortrait = ownerPortrait;
	}
	public String getOwnerPortrait( ) {
		return this.ownerPortrait;
	}

	public void setPluginRefreshType(String pluginRefreshType) {
		this.pluginRefreshType = pluginRefreshType;
	}
	public String getPluginRefreshType( ) {
		return this.pluginRefreshType;
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
