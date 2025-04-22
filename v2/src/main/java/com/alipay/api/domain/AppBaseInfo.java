package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序信息
 *
 * @author auto create
 * @since 1.0, 2024-08-26 13:46:58
 */
public class AppBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 2843448265512648332L;

	/**
	 * 小程序的名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 小程序归属pid
	 */
	@ApiField("pid")
	private String pid;

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

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
