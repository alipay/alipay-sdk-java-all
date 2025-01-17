package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 飞猪返回小程序内容
 *
 * @author auto create
 * @since 1.0, 2020-03-20 10:31:37
 */
public class Appinfos extends AlipayObject {

	private static final long serialVersionUID = 4348399271819437253L;

	/**
	 * 小程序名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 小程序类型
	 */
	@ApiField("app_type")
	private Long appType;

	/**
	 * 小程序id
	 */
	@ApiField("mini_app_id")
	private Long miniAppId;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public Long getAppType() {
		return this.appType;
	}
	public void setAppType(Long appType) {
		this.appType = appType;
	}

	public Long getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(Long miniAppId) {
		this.miniAppId = miniAppId;
	}

}
