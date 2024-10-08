package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心付的商户配置
 *
 * @author auto create
 * @since 1.0, 2024-09-03 16:43:40
 */
public class AxfMerchantConfig extends AlipayObject {

	private static final long serialVersionUID = 1375326397612547536L;

	/**
	 * 配置key
	 */
	@ApiField("config_key")
	private String configKey;

	/**
	 * 配置value
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
