package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 插件版本撤销灰度
 *
 * @author auto create
 * @since 1.0, 2022-01-04 10:32:10
 */
public class AlipayOpenMiniPluginuseconfigUpgradeCancelModel extends AlipayObject {

	private static final long serialVersionUID = 6858853645191775838L;

	/**
	 * 端id
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 插件研发版本号
	 */
	@ApiField("plugin_dev_version")
	private String pluginDevVersion;

	/**
	 * 插件appid
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
