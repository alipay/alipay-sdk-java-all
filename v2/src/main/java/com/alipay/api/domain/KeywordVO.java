package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息内容中关键词的展示信息
 *
 * @author auto create
 * @since 1.0, 2024-01-14 22:42:48
 */
public class KeywordVO extends AlipayObject {

	private static final long serialVersionUID = 1294544247287951414L;

	/**
	 * 关键词名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 关键词内容
	 */
	@ApiField("value")
	private String value;

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
