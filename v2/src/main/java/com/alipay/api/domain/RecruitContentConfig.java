package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动报名内容的配置信息
 *
 * @author auto create
 * @since 1.0, 2023-03-26 14:08:10
 */
public class RecruitContentConfig extends AlipayObject {

	private static final long serialVersionUID = 1777491627222481562L;

	/**
	 * 活动报名内容的配置信息CODE。
	 */
	@ApiField("config_code")
	private String configCode;

	/**
	 * 活动报名内容的配置信息CODE对应值。
	 */
	@ApiField("config_value")
	private String configValue;

	public String getConfigCode() {
		return this.configCode;
	}
	public void setConfigCode(String configCode) {
		this.configCode = configCode;
	}

	public String getConfigValue() {
		return this.configValue;
	}
	public void setConfigValue(String configValue) {
		this.configValue = configValue;
	}

}
