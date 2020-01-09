package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Map结构的入参
 *
 * @author auto create
 * @since 1.0, 2019-11-18 17:36:08
 */
public class MapParameter extends AlipayObject {

	private static final long serialVersionUID = 4792292792694935129L;

	/**
	 * 参数的名字
	 */
	@ApiField("key")
	private String key;

	/**
	 * 参数的值
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
