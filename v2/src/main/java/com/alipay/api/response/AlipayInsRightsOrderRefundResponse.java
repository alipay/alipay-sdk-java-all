package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.rights.order.refund response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-19 11:42:30
 */
public class AlipayInsRightsOrderRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 8896255554976657755L;

	/** 
	 * 返回当前退单的结果
	 */
	@ApiField("refund_valid")
	private Boolean refundValid;

	public void setRefundValid(Boolean refundValid) {
		this.refundValid = refundValid;
	}
	public Boolean getRefundValid( ) {
		return this.refundValid;
	}

}
