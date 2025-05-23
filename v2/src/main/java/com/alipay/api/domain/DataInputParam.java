package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据输入参数
 *
 * @author auto create
 * @since 1.0, 2024-07-29 10:38:57
 */
public class DataInputParam extends AlipayObject {

	private static final long serialVersionUID = 6546446294424915436L;

	/**
	 * 字段属性值
	 */
	@ApiField("content")
	private String content;

	/**
	 * 由蚂蚁定义颁发的字段属性字段
	 */
	@ApiField("property")
	private String property;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getProperty() {
		return this.property;
	}
	public void setProperty(String property) {
		this.property = property;
	}

}
