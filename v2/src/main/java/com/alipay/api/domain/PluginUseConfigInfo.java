package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 使用关系分端版本配置
 *
 * @author auto create
 * @since 1.0, 2024-04-23 10:24:45
 */
public class PluginUseConfigInfo extends AlipayObject {

	private static final long serialVersionUID = 7888811488114572151L;

	/**
	 * 端
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 灰度策略
	 */
	@ApiField("gray_code")
	private String grayCode;

	/**
	 * 插件研发版本
	 */
	@ApiField("plugin_develop_version")
	private String pluginDevelopVersion;

	/**
	 * GRAY(灰度中)/RELEASE(在线状态)
	 */
	@ApiField("status")
	private String status;

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getGrayCode() {
		return this.grayCode;
	}
	public void setGrayCode(String grayCode) {
		this.grayCode = grayCode;
	}

	public String getPluginDevelopVersion() {
		return this.pluginDevelopVersion;
	}
	public void setPluginDevelopVersion(String pluginDevelopVersion) {
		this.pluginDevelopVersion = pluginDevelopVersion;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
