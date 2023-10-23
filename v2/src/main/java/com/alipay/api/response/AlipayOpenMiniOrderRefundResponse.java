package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.order.refund response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-17 11:06:46
 */
public class AlipayOpenMiniOrderRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 3865277487829135827L;

	/** 
	 * 退款id
	 */
	@ApiField("refund_id")
	private String refundId;

	/** 
	 * 本次商户实际退回金额,单位"元"
	 */
	@ApiField("send_back_fee")
	private String sendBackFee;

	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}
	public String getRefundId( ) {
		return this.refundId;
	}

	public void setSendBackFee(String sendBackFee) {
		this.sendBackFee = sendBackFee;
	}
	public String getSendBackFee( ) {
		return this.sendBackFee;
	}

}
