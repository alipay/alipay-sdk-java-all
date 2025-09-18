package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扩展参数
 *
 * @author auto create
 * @since 1.0, 2024-03-06 14:32:04
 */
public class ExtensionMap extends AlipayObject {

	private static final long serialVersionUID = 5657386928162721783L;

	/**
	 * 键值对中的key{"orderDetail":"/order/detail"}中的 orderDetail
	 */
	@ApiField("key")
	private String key;

	/**
	 * 键值对中的值{"orderDetail":"order/detail"}中的order/detail
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
