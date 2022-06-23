package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序引用的插件信息，包含插件的id和插件的版本
 *
 * @author auto create
 * @since 1.0, 2019-06-06 19:02:17
 */
public class MiniAppPluginReference extends AlipayObject {

	private static final long serialVersionUID = 5597599147688266165L;

	/**
	 * 插件id，即插件的唯一标识，形如小程序的appId
	 */
	@ApiField("plugin_id")
	private String pluginId;

	/**
	 * 小程序引用的插件版本，可以指定插件版本，如：1.0.11；也可以填*，表示引用最新的插件版本，此时，当插件发布新版本后，小程序内的插件会自动更新到最新的版本。
	 */
	@ApiField("plugin_version")
	private String pluginVersion;

	public String getPluginId() {
		return this.pluginId;
	}
	public void setPluginId(String pluginId) {
		this.pluginId = pluginId;
	}

	public String getPluginVersion() {
		return this.pluginVersion;
	}
	public void setPluginVersion(String pluginVersion) {
		this.pluginVersion = pluginVersion;
	}

}
