package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 上线插件使用端版本配置
 *
 * @author auto create
 * @since 1.0, 2024-04-23 10:18:26
 */
public class AlipayOpenMiniInnerappPluginuseconfigOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 2578687735175969898L;

	/**
	 * 来源
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 端id
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 小程序应用 ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 插件研发版本
	 */
	@ApiField("plugin_dev_version")
	private String pluginDevVersion;

	/**
	 * 插件id
	 */
	@ApiField("plugin_id")
	private String pluginId;

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getPluginDevVersion() {
		return this.pluginDevVersion;
	}
	public void setPluginDevVersion(String pluginDevVersion) {
		this.pluginDevVersion = pluginDevVersion;
	}

	public String getPluginId() {
		return this.pluginId;
	}
	public void setPluginId(String pluginId) {
		this.pluginId = pluginId;
	}

}
