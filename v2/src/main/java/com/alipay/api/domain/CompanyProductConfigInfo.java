package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业产品配置信息，以键，值的形式返回
 *
 * @author auto create
 * @since 1.0, 2025-07-07 14:29:55
 */
public class CompanyProductConfigInfo extends AlipayObject {

	private static final long serialVersionUID = 3269727837478684326L;

	/**
	 * 企业发票产品配置键
	 */
	@ApiField("config_key")
	private String configKey;

	/**
	 * 企业发票产品配置值
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
