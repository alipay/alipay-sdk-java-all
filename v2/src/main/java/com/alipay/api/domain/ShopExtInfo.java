package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺扩展信息，key-value键值对
 *
 * @author auto create
 * @since 1.0, 2023-05-10 19:05:06
 */
public class ShopExtInfo extends AlipayObject {

	private static final long serialVersionUID = 2427256972364176584L;

	/**
	 * KV数据对的key，表示该kv对象表示什么含义。
	 */
	@ApiField("key_name")
	private String keyName;

	/**
	 * kv对象的值
	 */
	@ApiField("value")
	private String value;

	public String getKeyName() {
		return this.keyName;
	}
	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
