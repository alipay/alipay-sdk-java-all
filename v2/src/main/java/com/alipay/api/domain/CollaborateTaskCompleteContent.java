package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 协同任务完成内容
 *
 * @author auto create
 * @since 1.0, 2025-04-11 22:13:20
 */
public class CollaborateTaskCompleteContent extends AlipayObject {

	private static final long serialVersionUID = 5878166129486632642L;

	/**
	 * 完成任务以后，反馈内容的类型。
	 */
	@ApiField("type")
	private String type;

	/**
	 * 完成任务以后反馈内容的值
	 */
	@ApiField("value")
	private String value;

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
