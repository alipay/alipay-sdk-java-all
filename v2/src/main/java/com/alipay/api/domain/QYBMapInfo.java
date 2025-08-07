package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益宝map类型数据模型
 *
 * @author auto create
 * @since 1.0, 2021-09-24 11:11:34
 */
public class QYBMapInfo extends AlipayObject {

	private static final long serialVersionUID = 5725333144759212823L;

	/**
	 * map里的key值
	 */
	@ApiField("key")
	private String key;

	/**
	 * map类型的value
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
