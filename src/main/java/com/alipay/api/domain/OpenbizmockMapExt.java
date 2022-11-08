package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Openbizmock应用的Map结构
 *
 * @author auto create
 * @since 1.0, 2022-11-02 15:42:15
 */
public class OpenbizmockMapExt extends AlipayObject {

	private static final long serialVersionUID = 4326287957764815993L;

	/**
	 * 参数的key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 参数的value
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
