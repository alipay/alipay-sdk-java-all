package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 反馈子选项
 *
 * @author auto create
 * @since 1.0, 2025-03-31 14:08:34
 */
public class FeedbackSuboption extends AlipayObject {

	private static final long serialVersionUID = 7123459984841141195L;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 名称值
	 */
	@ApiField("value")
	private String value;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
