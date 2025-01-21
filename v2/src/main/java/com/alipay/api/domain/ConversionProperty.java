package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转化数据属性
 *
 * @author auto create
 * @since 1.0, 2024-07-16 10:59:51
 */
public class ConversionProperty extends AlipayObject {

	private static final long serialVersionUID = 8514321311691937892L;

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
	 * 业务转化属性实例值，
property_list的value值需与转化管理里创建转化事件时填写的归因口径值保持一致<br>
attrbute_list的value值请参考该文档：<a href='https://adpub.alipay.com/adrlark/ivdktpyh511x9r6i'>转化事件类型属性规则</a>
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
