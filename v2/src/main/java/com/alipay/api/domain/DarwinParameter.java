package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 达尔文实验参数
 *
 * @author auto create
 * @since 1.0, 2024-06-28 16:37:42
 */
public class DarwinParameter extends AlipayObject {

	private static final long serialVersionUID = 8125322573272524945L;

	/**
	 * 达尔文实验参数
	 */
	@ApiField("key")
	private String key;

	/**
	 * 达尔文实验参数值
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
