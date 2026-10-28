package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-27 10:57:57
 */
public class FieldList extends AlipayObject {

	private static final long serialVersionUID = 5528494599969458585L;

	/**
	 * 姓名
	 */
	@ApiField("key")
	private String key;

	/**
	 * 导入数据字段对应值
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
