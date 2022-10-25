package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创意交互行为属性实例值
 *
 * @author auto create
 * @since 1.0, 2019-10-25 19:10:36
 */
public class ActionProperty extends AlipayObject {

	private static final long serialVersionUID = 8764638126299628392L;

	/**
	 * 属性C端渲染key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 交互动作属性元素类型，IMG-图片；TEXT-普通文本
	 */
	@ApiField("type")
	private String type;

	/**
	 * 属性图片URL；属性文本值
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
