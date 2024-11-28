package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心付的商户配置
 *
 * @author auto create
 * @since 1.0, 2024-11-15 16:02:19
 */
public class AxfMerchantConfig extends AlipayObject {

	private static final long serialVersionUID = 7752172771687442543L;

	/**
	 * 如果需要监听开放消息，并且卡上没有配置msg_app_id，一定要配置MERCHANT_MSG_APP_ID
	 */
	@ApiField("config_key")
	private String configKey;

	/**
	 * (1)当config_key=MERCHANT_MSG_APP_ID时，config_value需要是商户的appId
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
