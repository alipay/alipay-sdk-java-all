package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.skill.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-05 16:32:54
 */
public class AlipayOpenSpSkillCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7812117288854214272L;

	/** 
	 * 申请单号
	 */
	@ApiField("order_id")
	private String orderId;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}
