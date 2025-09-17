package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创意交互属性信息
 *
 * @author auto create
 * @since 1.0, 2025-05-06 19:36:36
 */
public class CreativeActionProperty extends AlipayObject {

	private static final long serialVersionUID = 4473121912364263531L;

	/**
	 * 属性C端渲染key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 交互动作属性元素类型，本字段类型限制参考落地页介绍文档
	 */
	@ApiField("type")
	private String type;

	/**
	 * 属性图片URL；
属性文本值
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
