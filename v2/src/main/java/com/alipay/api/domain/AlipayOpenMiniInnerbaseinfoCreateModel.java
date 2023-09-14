package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序创建接口
 *
 * @author auto create
 * @since 1.0, 2020-05-28 15:53:57
 */
public class AlipayOpenMiniInnerbaseinfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3558993464427235748L;

	/**
	 * 小程序应用名称
	 */
	@ApiField("app_alias_name")
	private String appAliasName;

	/**
	 * 小程序类目ID列表
	 */
	@ApiField("app_category_ids")
	private String appCategoryIds;

	/**
	 * 小程序应用描述，20-200个字
	 */
	@ApiField("app_desc")
	private String appDesc;

	/**
	 * 小程序英文名称
	 */
	@ApiField("app_english_name")
	private String appEnglishName;

	/**
	 * 淘宝鉴权key
	 */
	@ApiField("app_key")
	private String appKey;

	/**
	 * 小程序logo图标，建议上传像素为180*180
	 */
	@ApiField("app_logo")
	private String appLogo;

	/**
	 * 小程序中文名名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 应用来源
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 小程序应用简介，一句话描述小程序功能
	 */
	@ApiField("app_slogan")
	private String appSlogan;

	/**
	 * 小程序类型
普通小程序：TINYAPP_NORMAL
	 */
	@ApiField("app_sub_type")
	private String appSubType;

	/**
	 * 小程序类型，H5 or RN，区分于 app_sub_type
	 */
	@ApiField("app_type")
	private String appType;

	/**
	 * 多端类型
	 */
	@ApiField("client_type")
	private String clientType;

	/**
	 * 租户编码，不同租户下的数据是隔离的
支付宝：alipay
淘宝：taobao
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 需要同步的小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 新小程序前台类目，一级与二级、三级用下划线隔开，最多可以选四个类目，类目之间;隔开。使用后不再读取app_category_ids值，老前台类目将废弃
	 */
	@ApiField("mini_category_ids")
	private String miniCategoryIds;

	/**
	 * 应用主体
	 */
	@ApiField("owner_entity")
	private String ownerEntity;

	/**
	 * 应用来源
MAYI：蚂蚁域内应用
ALIBABA：阿里域内应用
	 */
	@ApiField("partner_domain")
	private String partnerDomain;

	/**
	 * 小程序管理员虚拟 ID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 客服邮箱
	 */
	@ApiField("service_mail")
	private String serviceMail;

	/**
	 * 客服电话
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

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
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

	public String getAppType() {
		return this.appType;
	}
	public void setAppType(String appType) {
		this.appType = appType;
	}

	public String getClientType() {
		return this.clientType;
	}
	public void setClientType(String clientType) {
		this.clientType = clientType;
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

	public String getMiniCategoryIds() {
		return this.miniCategoryIds;
	}
	public void setMiniCategoryIds(String miniCategoryIds) {
		this.miniCategoryIds = miniCategoryIds;
	}

	public String getOwnerEntity() {
		return this.ownerEntity;
	}
	public void setOwnerEntity(String ownerEntity) {
		this.ownerEntity = ownerEntity;
	}

	public String getPartnerDomain() {
		return this.partnerDomain;
	}
	public void setPartnerDomain(String partnerDomain) {
		this.partnerDomain = partnerDomain;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getServiceMail() {
		return this.serviceMail;
	}
	public void setServiceMail(String serviceMail) {
		this.serviceMail = serviceMail;
	}

	public String getServicePhone() {
		return this.servicePhone;
	}
	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}

}
