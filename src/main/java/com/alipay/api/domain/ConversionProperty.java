package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 留资数据
 *
 * @author auto create
 * @since 1.0, 2020-12-28 15:33:35
 */
public class ConversionProperty extends AlipayObject {

	private static final long serialVersionUID = 7118938195397676512L;

	/**
	 * 业务转化数据属性
	 */
	@ApiField("key")
	private String key;

	/**
	 * 转化属性名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 业务转化属性实例值
	 */
	@ApiField("value")
	private String value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
