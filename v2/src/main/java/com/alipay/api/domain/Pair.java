package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * K-V对象
 *
 * @author auto create
 * @since 1.0, 2019-09-04 11:39:08
 */
public class Pair extends AlipayObject {

	private static final long serialVersionUID = 5153882983114228839L;

	/**
	 * KEY
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
