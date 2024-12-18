package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模版标签文案信息
 *
 * @author auto create
 * @since 1.0, 2023-06-25 15:17:04
 */
public class TemplateTextMessageDTO extends AlipayObject {

	private static final long serialVersionUID = 2132554445462744516L;

	/**
	 * 标签标题文案，支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("label")
	private String label;

	/**
	 * 模版标签值，支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("value")
	private String value;

	public String getLabel() {
		return this.label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
