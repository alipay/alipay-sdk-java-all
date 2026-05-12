package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-04-09 21:12:44
 */
public class ObTemplateParamRequest extends AlipayObject {

	private static final long serialVersionUID = 1791396824441735651L;

	/**
	 * 描述字段类型的关键字
	 */
	@ApiField("key")
	private String key;

	/**
	 * 反序列化对象
	 */
	@ApiField("type")
	private String type;

	/**
	 * map中value的描述
	 */
	@ApiField("value")
	private String value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
