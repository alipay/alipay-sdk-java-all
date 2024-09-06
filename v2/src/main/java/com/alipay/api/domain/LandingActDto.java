package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 落地页活动
 *
 * @author auto create
 * @since 1.0, 2024-08-19 23:02:32
 */
public class LandingActDto extends AlipayObject {

	private static final long serialVersionUID = 7851561897939925698L;

	/**
	 * 活动名称
	 */
	@ApiField("key")
	private String key;

	/**
	 * 活动值
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
