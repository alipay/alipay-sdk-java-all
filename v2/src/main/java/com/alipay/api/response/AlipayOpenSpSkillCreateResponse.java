package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.skill.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-20 10:03:58
 */
public class AlipayOpenSpSkillCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7398994822274913833L;

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
