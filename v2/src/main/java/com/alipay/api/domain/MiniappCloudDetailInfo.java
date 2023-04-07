package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户金融云展示的小程序信息
 *
 * @author auto create
 * @since 1.0, 2019-04-08 20:01:02
 */
public class MiniappCloudDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 4268794162544228338L;

	/**
	 * 小程序应用描述
	 */
	@ApiField("app_desc")
	private String appDesc;

	/**
	 * 小程序应用英文名称
	 */
	@ApiField("app_english_name")
	private String appEnglishName;

	/**
	 * 小程序应用logo图标
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
	 * 生活服务_汽车服务
	 */
	@ApiField("category_names")
	private String categoryNames;

	/**
	 * 小程序创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 小程序应用的appid
	 */
	@ApiField("mini_appid")
	private String miniAppid;

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

	public String getCategoryNames() {
		return this.categoryNames;
	}
	public void setCategoryNames(String categoryNames) {
		this.categoryNames = categoryNames;
	}

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getMiniAppid() {
		return this.miniAppid;
	}
	public void setMiniAppid(String miniAppid) {
		this.miniAppid = miniAppid;
	}

}
