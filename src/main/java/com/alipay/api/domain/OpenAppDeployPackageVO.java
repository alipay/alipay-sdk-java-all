package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序应用部署包模型
 *
 * @author auto create
 * @since 1.0, 2020-01-04 00:31:44
 */
public class OpenAppDeployPackageVO extends AlipayObject {

	private static final long serialVersionUID = 5715482441311457531L;

	/**
	 * 发布标识
	 */
	@ApiField("deploy_version")
	private String deployVersion;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 普通小程序包地址
	 */
	@ApiField("package_url")
	private String packageUrl;

	/**
	 * 插件包地址
	 */
	@ApiField("plugin_url")
	private String pluginUrl;

	public String getDeployVersion() {
		return this.deployVersion;
	}
	public void setDeployVersion(String deployVersion) {
		this.deployVersion = deployVersion;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getPackageUrl() {
		return this.packageUrl;
	}
	public void setPackageUrl(String packageUrl) {
		this.packageUrl = packageUrl;
	}

	public String getPluginUrl() {
		return this.pluginUrl;
	}
	public void setPluginUrl(String pluginUrl) {
		this.pluginUrl = pluginUrl;
	}

}
