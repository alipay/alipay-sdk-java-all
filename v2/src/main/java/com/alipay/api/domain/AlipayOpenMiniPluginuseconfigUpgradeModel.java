package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 插件版本升级
 *
 * @author auto create
 * @since 1.0, 2024-04-23 10:17:00
 */
public class AlipayOpenMiniPluginuseconfigUpgradeModel extends AlipayObject {

	private static final long serialVersionUID = 5253526247755299119L;

	/**
	 * 小程序客户端类型，默认为支付宝端。常见支持如下客户端：
com.alipay.alipaywallet：支付宝端；
com.alibaba.android.rimet：DINGDING端；
com.amap.app：高德端；
com.alibaba.ailabs.genie.webapps：天猫精灵端；
com.alipay.iot.xpaas：支付宝IoT端。
如需更多端投放，请联系业务BD。
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
	 * 灰度策略值
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
