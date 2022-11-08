package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * KV模型，key 和 value 都是 String 类型
 *
 * @author auto create
 * @since 1.0, 2022-06-10 15:34:11
 */
public class KVObj extends AlipayObject {

	private static final long serialVersionUID = 7198225273672249995L;

	/**
	 * KV模型的key
	 */
	@ApiField("key")
	private String key;

	/**
	 * KV模型的value
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
