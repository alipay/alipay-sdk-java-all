package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改企业配置
 *
 * @author auto create
 * @since 1.0, 2024-03-14 15:40:15
 */
public class AlipayCommerceEcEnterpriseConfigModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2471511663758283467L;

	/**
	 * 企业所需配置的key
	 */
	@ApiField("config_key")
	private String configKey;

	/**
	 * 企业所需配置的value
	 */
	@ApiField("config_value")
	private Boolean configValue;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	public String getConfigKey() {
		return this.configKey;
	}
	public void setConfigKey(String configKey) {
		this.configKey = configKey;
	}

	public Boolean getConfigValue() {
		return this.configValue;
	}
	public void setConfigValue(Boolean configValue) {
		this.configValue = configValue;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

}
