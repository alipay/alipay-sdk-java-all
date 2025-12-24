package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能体版本预览
 *
 * @author auto create
 * @since 1.0, 2025-04-22 10:57:29
 */
public class AlipayOpenAgentVersionPreviewModel extends AlipayObject {

	private static final long serialVersionUID = 7613651231765154692L;

	/**
	 * 智能体版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 智能体投放的客户端类型。支持如下客户端：支小宝、web服务
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 包含体验、正式二个参数枚举值可选
	 */
	@ApiField("environment")
	private String environment;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getEnvironment() {
		return this.environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}

}
