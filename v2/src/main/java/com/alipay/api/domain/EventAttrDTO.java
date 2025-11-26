package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-06-05 15:27:29
 */
public class EventAttrDTO extends AlipayObject {

	private static final long serialVersionUID = 5694995392587167688L;

	/**
	 * 配置名称:
1.监控持续时间（单位：分钟）：MONITOR_DURATION
2.统计次数（单位：次）：STATISTICS_COUNT
两种配置必须同时出现
	 */
	@ApiField("config_key")
	private String configKey;

	/**
	 * 配置值：
MONITOR_DURATION：建议值:1-60的整数值，单位为分钟。
STATISTICS_COUNT:大于0的整数。
	 */
	@ApiField("config_value")
	private String configValue;

	public String getConfigKey() {
		return this.configKey;
	}
	public void setConfigKey(String configKey) {
		this.configKey = configKey;
	}

	public String getConfigValue() {
		return this.configValue;
	}
	public void setConfigValue(String configValue) {
		this.configValue = configValue;
	}

}
