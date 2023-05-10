package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * key、value数据结构
 *
 * @author auto create
 * @since 1.0, 2021-01-28 20:14:57
 */
public class IoTBPaaSKeyValue extends AlipayObject {

	private static final long serialVersionUID = 5769122232257348312L;

	/**
	 * 参数名key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 参数值value
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
