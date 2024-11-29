package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 导购信息
 *
 * @author auto create
 * @since 1.0, 2024-01-18 14:49:50
 */
public class GuideInfoVO extends AlipayObject {

	private static final long serialVersionUID = 1688293615453135972L;

	/**
	 * 导购信息key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 导购信息value
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
