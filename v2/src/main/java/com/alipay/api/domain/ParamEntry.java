package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * key-value实体对象
 *
 * @author auto create
 * @since 1.0, 2023-10-17 17:58:36
 */
public class ParamEntry extends AlipayObject {

	private static final long serialVersionUID = 2333675866461122391L;

	/**
	 * key值，主要包含一些人群相关的字段，如人群id，人群行为
	 */
	@ApiField("key")
	private String key;

	/**
	 * value值，key值对应的字段的具体值
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
