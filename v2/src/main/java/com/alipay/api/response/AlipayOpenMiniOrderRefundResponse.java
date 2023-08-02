package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.order.refund response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-26 11:09:40
 */
public class AlipayOpenMiniOrderRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 7363423451389571885L;

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
