package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 协同任务完成内容
 *
 * @author auto create
 * @since 1.0, 2025-01-14 10:33:45
 */
public class CollaborateTaskCompleteContent extends AlipayObject {

	private static final long serialVersionUID = 6251663592349536153L;

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
