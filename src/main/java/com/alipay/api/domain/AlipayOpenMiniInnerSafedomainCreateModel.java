package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一二方设置安全域名
 *
 * @author auto create
 * @since 1.0, 2022-04-26 14:55:11
 */
public class AlipayOpenMiniInnerSafedomainCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5782399722832294444L;

	/**
	 * 业务来源
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 开发者id
	 */
	@ApiField("dev_id")
	private String devId;

	/**
	 * 小程序id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 域名，示例：example.com。仅支持https协议。
	 */
	@ApiField("mini_app_safe_domain")
	private String miniAppSafeDomain;

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}

	public String getDevId() {
		return this.devId;
	}
	public void setDevId(String devId) {
		this.devId = devId;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getMiniAppSafeDomain() {
		return this.miniAppSafeDomain;
	}
	public void setMiniAppSafeDomain(String miniAppSafeDomain) {
		this.miniAppSafeDomain = miniAppSafeDomain;
	}

}
