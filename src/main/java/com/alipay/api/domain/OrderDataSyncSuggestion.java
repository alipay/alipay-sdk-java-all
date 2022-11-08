package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单同步建议
 *
 * @author auto create
 * @since 1.0, 2022-08-25 15:46:49
 */
public class OrderDataSyncSuggestion extends AlipayObject {

	private static final long serialVersionUID = 3526952397848612681L;

	/**
	 * 同步建议内容
	 */
	@ApiField("message")
	private String message;

	/**
	 * 同步建议类型
	 */
	@ApiField("type")
	private String type;

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
