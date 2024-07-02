package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 打标model
 *
 * @author auto create
 * @since 1.0, 2019-03-08 11:47:03
 */
public class LabelForOpenapi extends AlipayObject {

	private static final long serialVersionUID = 2331146291865117634L;

	/**
	 * 标记类型
	 */
	@ApiField("label_type")
	private String labelType;

	/**
	 * 标记类型的值
	 */
	@ApiField("value")
	private String value;

	public String getLabelType() {
		return this.labelType;
	}
	public void setLabelType(String labelType) {
		this.labelType = labelType;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
