package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序插件包查询服务
 *
 * @author auto create
 * @since 1.0, 2019-05-16 17:12:56
 */
public class AlipayOpenMiniInnerversionPluginpackageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1858647251818199866L;

	/**
	 * 一个端的标识，用于区分不同的客户端，每接入一个客户端，都需要向小程序应用中心申请bundelId入驻
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 接入租户类型
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 插件的唯一标识
	 */
	@ApiField("plugin_id")
	private String pluginId;

	/**
	 * 小程序引用的插件版本，可以指定插件版本，如：1.0.11；也可以填*，表示引用最新的插件版本，此时，当插件发布新版本后，小程序内的插件会自动更新到最新的版本。
	 */
	@ApiField("plugin_version")
	private String pluginVersion;

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
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
