package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序预创建接口
 *
 * @author auto create
 * @since 1.0, 2021-10-20 17:43:19
 */
public class AlipayOpenMiniInnerbaseinfoPrecreateModel extends AlipayObject {

	private static final long serialVersionUID = 5616428975385469556L;

	/**
	 * 小程序类目ID列表
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
	 * 小程序logo图片地址
	 */
	@ApiField("app_logo")
	private String appLogo;

	/**
	 * 小程序中文名
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 应用创建方，接入时请联系minicenter owner添加
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 应用简介
	 */
	@ApiField("app_slogan")
	private String appSlogan;

	/**
	 * 小程序应用类型
普通小程序: TINYAPP_NORMAL
	 */
	@ApiField("app_sub_type")
	private String appSubType;

	/**
	 * 新小程序前台类目，一级与二级、三级用下划线隔开，最多可以选四个类目，类目之间;隔开。使用后不再读取app_category_ids值，老前台类目将废弃
	 */
	@ApiField("mini_category_ids")
	private String miniCategoryIds;

	/**
	 * 小程序业务主体
	 */
	@ApiField("owner_entity")
	private String ownerEntity;

	/**
	 * 接入方所属域，接入前请联系系统owner提供
MAYI：蚂蚁域内应用
ALIBABA：阿里域内应用
	 */
	@ApiField("partner_domain")
	private String partnerDomain;

	/**
	 * 小程序主账户ID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 小程序客服电话
	 */
	@ApiField("service_phone")
	private String servicePhone;

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

	public String getServicePhone() {
		return this.servicePhone;
	}
	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}

}
