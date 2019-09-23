package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内部链路小程序创建
 *
 * @author auto create
 * @since 1.0, 2019-09-16 12:11:36
 */
public class AlipayOpenMiniInnerappCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4813753964128416329L;

	/**
	 * 小程序类目，二级类目与三级类目下划线隔开，最多可以选择3个类目，类目之间以;隔开
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
	 * 小程序logo
	 */
	@ApiField("app_logo")
	private String appLogo;

	/**
	 * 小程序名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 来源的业务方
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 小程序简介，在搜索透出
	 */
	@ApiField("app_slogan")
	private String appSlogan;

	/**
	 * 应用子类型
	 */
	@ApiField("app_sub_type")
	private String appSubType;

	/**
	 * 应用类型
	 */
	@ApiField("app_type")
	private String appType;

	/**
	 * 三方应用ID，仅在创建模板小程序时需要传入
	 */
	@ApiField("isv_app_id")
	private String isvAppId;

	/**
	 * 创建的小程序所属的PID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 邮箱，与客服电话二选一
	 */
	@ApiField("service_email")
	private String serviceEmail;

	/**
	 * 客服电话
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

	public String getAppType() {
		return this.appType;
	}
	public void setAppType(String appType) {
		this.appType = appType;
	}

	public String getIsvAppId() {
		return this.isvAppId;
	}
	public void setIsvAppId(String isvAppId) {
		this.isvAppId = isvAppId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
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
