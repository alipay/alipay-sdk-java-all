package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 引用插件信息
 *
 * @author auto create
 * @since 1.0, 2020-02-05 10:33:07
 */
public class MiniAppPluginInfo extends AlipayObject {

	private static final long serialVersionUID = 7184787611114747483L;

	/**
	 * 插件包地址
	 */
	@ApiField("package_url")
	private String packageUrl;

	/**
	 * 插件id，即插件的唯一标识
	 */
	@ApiField("plugin_id")
	private String pluginId;

	/**
	 * 小程序引用的插件版本，可以指定插件版本，1.2.3。也可以使用最新版本,*。推荐使用*
	 */
	@ApiField("require_version")
	private String requireVersion;

	public String getPackageUrl() {
		return this.packageUrl;
	}
	public void setPackageUrl(String packageUrl) {
		this.packageUrl = packageUrl;
	}

	public String getPluginId() {
		return this.pluginId;
	}
	public void setPluginId(String pluginId) {
		this.pluginId = pluginId;
	}

	public String getRequireVersion() {
		return this.requireVersion;
	}
	public void setRequireVersion(String requireVersion) {
		this.requireVersion = requireVersion;
	}

}
