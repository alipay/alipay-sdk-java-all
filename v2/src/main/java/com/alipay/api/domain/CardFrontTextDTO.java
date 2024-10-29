package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡面文案信息模型，展示在卡面上，形如：
学校    武汉理工大学
 *
 * @author auto create
 * @since 1.0, 2023-07-03 13:55:45
 */
public class CardFrontTextDTO extends AlipayObject {

	private static final long serialVersionUID = 2815155918715664313L;

	/**
	 * 文案标签
	 */
	@ApiField("label")
	private String label;

	/**
	 * 展示文案
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
