package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * k,v键值对
 *
 * @author auto create
 * @since 1.0, 2023-03-29 17:29:22
 */
public class ExtInfoPair extends AlipayObject {

	private static final long serialVersionUID = 3361744248816267565L;

	/**
	 * 属性
	 */
	@ApiField("key")
	private String key;

	/**
	 * 属性值
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
