package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据同步返回结果
 *
 * @author auto create
 * @since 1.0, 2022-06-23 20:34:18
 */
public class SyncDataResult extends AlipayObject {

	private static final long serialVersionUID = 5299188829568744321L;

	/**
	 * 数据同步结果键
	 */
	@ApiField("key")
	private String key;

	/**
	 * 数据同步结果值
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
