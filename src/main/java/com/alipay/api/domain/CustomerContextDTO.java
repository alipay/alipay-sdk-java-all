package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义业务数据
 *
 * @author auto create
 * @since 1.0, 2021-12-02 10:25:13
 */
public class CustomerContextDTO extends AlipayObject {

	private static final long serialVersionUID = 4643681872351658149L;

	/**
	 * 自定义业务参数的key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 自定义业务参数的value
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
