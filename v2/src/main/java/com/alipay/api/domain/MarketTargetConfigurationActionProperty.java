package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销目标配置详细配置
 *
 * @author auto create
 * @since 1.0, 2025-05-12 16:14:53
 */
public class MarketTargetConfigurationActionProperty extends AlipayObject {

	private static final long serialVersionUID = 1226784151768663638L;

	/**
	 * 营销目标配置类别
	 */
	@ApiField("key")
	private String key;

	/**
	 * 营销目标配置类别对应值
	 */
	@ApiField("value")
	private String value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
