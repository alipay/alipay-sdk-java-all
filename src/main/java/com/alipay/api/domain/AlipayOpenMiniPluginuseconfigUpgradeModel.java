package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 插件版本升级
 *
 * @author auto create
 * @since 1.0, 2022-02-26 16:15:39
 */
public class AlipayOpenMiniPluginuseconfigUpgradeModel extends AlipayObject {

	private static final long serialVersionUID = 1495916364979471252L;

	/**
	 * 端参数，枚举列举：支付宝：com.alipay.alipaywallet，高德：com.amap.app
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 插件研发版本
	 */
	@ApiField("plugin_dev_version")
	private String pluginDevVersion;

	/**
	 * 插件appid
	 */
	@ApiField("plugin_id")
	private String pluginId;

	/**
	 * 灰度策略值。枚举支持：p10、p30、p50。其中 p10 代表 10% 的用户，p30 代表 30% 的用户，p50 代表 50% 的用户。
	 */
	@ApiField("strategy_value")
	private String strategyValue;

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

	public String getStrategyValue() {
		return this.strategyValue;
	}
	public void setStrategyValue(String strategyValue) {
		this.strategyValue = strategyValue;
	}

}
