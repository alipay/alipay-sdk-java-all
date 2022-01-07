package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 全量插件使用端版本配置
 *
 * @author auto create
 * @since 1.0, 2022-01-04 10:32:21
 */
public class AlipayOpenMiniPluginuseconfigOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 5445293995321572894L;

	/**
	 * 端id
	 */
	@ApiField("bundle_id")
	private String bundleId;

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

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
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
