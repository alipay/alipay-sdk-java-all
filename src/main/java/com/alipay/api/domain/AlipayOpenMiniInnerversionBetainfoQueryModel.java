package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查看可邀测状态接口
 *
 * @author auto create
 * @since 1.0, 2021-05-25 17:10:11
 */
public class AlipayOpenMiniInnerversionBetainfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5663599959629546121L;

	/**
	 * 业务来源
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 端信息
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 插件ID
	 */
	@ApiField("plugin_id")
	private String pluginId;

	/**
	 * 查询版本号
	 */
	@ApiField("plugin_version")
	private String pluginVersion;

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
