package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 答题选择要素
 *
 * @author auto create
 * @since 1.0, 2022-05-24 14:14:29
 */
public class AnswerSelectDTO extends AlipayObject {

	private static final long serialVersionUID = 5834239261184159335L;

	/**
	 * 选择元素的标签提示
	 */
	@ApiField("label")
	private String label;

	/**
	 * 选择元素对应的value
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
