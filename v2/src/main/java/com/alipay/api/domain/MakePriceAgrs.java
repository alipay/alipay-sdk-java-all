package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扩展变量
 *
 * @author auto create
 * @since 1.0, 2019-12-11 20:40:49
 */
public class MakePriceAgrs extends AlipayObject {

	private static final long serialVersionUID = 3737338968253141873L;

	/**
	 * 属性名称
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
