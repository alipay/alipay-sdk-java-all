package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能体版本预览
 *
 * @author auto create
 * @since 1.0, 2025-04-11 10:07:42
 */
public class AlipayOpenAgentVesionPreviewModel extends AlipayObject {

	private static final long serialVersionUID = 7578588115578944811L;

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
	@ApiField("enviroment")
	private String enviroment;

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

	public String getEnviroment() {
		return this.enviroment;
	}
	public void setEnviroment(String enviroment) {
		this.enviroment = enviroment;
	}

}
