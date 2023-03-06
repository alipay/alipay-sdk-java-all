package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡面文案信息模型，展示在卡面上，形如：
学校    武汉理工大学
 *
 * @author auto create
 * @since 1.0, 2022-12-01 14:47:54
 */
public class CardFrontTextDTO extends AlipayObject {

	private static final long serialVersionUID = 1159739944726942862L;

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
