package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多端应用信息
 *
 * @author auto create
 * @since 1.0, 2019-04-11 10:42:46
 */
public class MultiAppBaseInfoDto extends AlipayObject {

	private static final long serialVersionUID = 1382948823719449753L;

	/**
	 * 小程序应用描述
	 */
	@ApiField("app_desc")
	private String appDesc;

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
	 * 应用id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 1：表示上线状态 0：表示下架状态
	 */
	@ApiField("status")
	private String status;

	public String getAppDesc() {
		return this.appDesc;
	}
	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
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

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
