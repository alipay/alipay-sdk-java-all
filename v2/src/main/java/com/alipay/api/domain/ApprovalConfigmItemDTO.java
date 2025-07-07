package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 审批单配置项定义
 *
 * @author auto create
 * @since 1.0, 2025-06-03 16:17:40
 */
public class ApprovalConfigmItemDTO extends AlipayObject {

	private static final long serialVersionUID = 5586765589664868237L;

	/**
	 * 配置项的名称
	 */
	@ApiField("config_key")
	private String configKey;

	/**
	 * 配置项对应的配置值
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
