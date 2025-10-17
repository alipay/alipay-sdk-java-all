package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 评论热度标签
 *
 * @author auto create
 * @since 1.0, 2024-01-24 10:57:51
 */
public class CommonTag extends AlipayObject {

	private static final long serialVersionUID = 6619937221883644666L;

	/**
	 * 点评热度
	 */
	@ApiField("heat_value")
	private String heatValue;

	/**
	 * 点评名称
	 */
	@ApiField("tag_name")
	private String tagName;

	public String getHeatValue() {
		return this.heatValue;
	}
	public void setHeatValue(String heatValue) {
		this.heatValue = heatValue;
	}

	public String getTagName() {
		return this.tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

}
