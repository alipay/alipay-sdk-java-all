package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可选标签值列表
 *
 * @author auto create
 * @since 1.0, 2023-04-14 13:55:42
 */
public class CrowdSelectTagSubOptionOpen extends AlipayObject {

	private static final long serialVersionUID = 3813214774727291272L;

	/**
	 * 标签值中文名称
	 */
	@ApiField("text")
	private String text;

	/**
	 * 标签值，通过标签创建人群时使用
	 */
	@ApiField("value")
	private String value;

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
