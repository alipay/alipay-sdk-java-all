package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单取消信息
 *
 * @author auto create
 * @since 1.0, 2025-03-14 17:37:49
 */
public class OrderCancelInfo extends AlipayObject {

	private static final long serialVersionUID = 8678515719951332657L;

	/**
	 * 订单取消操作方
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 订单取消原因
	 */
	@ApiField("reason")
	private String reason;

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

}
