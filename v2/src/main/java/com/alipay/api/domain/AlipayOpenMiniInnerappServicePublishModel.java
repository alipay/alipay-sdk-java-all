package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序模板发布服务市场
 *
 * @author auto create
 * @since 1.0, 2020-02-14 09:44:35
 */
public class AlipayOpenMiniInnerappServicePublishModel extends AlipayObject {

	private static final long serialVersionUID = 1756713495886497817L;

	/**
	 * 服务发布logo
	 */
	@ApiField("app_logo")
	private String appLogo;

	/**
	 * 业务来源
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 小程序ID，仅特殊场景使用，普通业务方无需关注该参数。
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 小程序模板所属PID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 服务子标题
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 服务名称
	 */
	@ApiField("title")
	private String title;

	public String getAppLogo() {
		return this.appLogo;
	}
	public void setAppLogo(String appLogo) {
		this.appLogo = appLogo;
	}

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
