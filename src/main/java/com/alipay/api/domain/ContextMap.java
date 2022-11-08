package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 纸质用印上下文
 *
 * @author auto create
 * @since 1.0, 2021-12-27 09:32:45
 */
public class ContextMap extends AlipayObject {

	private static final long serialVersionUID = 4198388347496898737L;

	/**
	 * key
	 */
	@ApiField("key")
	private String key;

	/**
	 * value
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
