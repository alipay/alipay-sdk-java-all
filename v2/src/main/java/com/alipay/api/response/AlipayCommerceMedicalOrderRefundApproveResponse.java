package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.order.refund.approve response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-29 14:37:07
 */
public class AlipayCommerceMedicalOrderRefundApproveResponse extends AlipayResponse {

	private static final long serialVersionUID = 2636813547633558511L;

	/** 
	 * 返回信息true/false
	 */
	@ApiField("data")
	private Boolean data;

	public void setData(Boolean data) {
		this.data = data;
	}
	public Boolean getData( ) {
		return this.data;
	}

}
