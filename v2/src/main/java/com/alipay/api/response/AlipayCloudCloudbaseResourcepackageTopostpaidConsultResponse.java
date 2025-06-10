package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourcepackage.topostpaid.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-12 16:07:28
 */
public class AlipayCloudCloudbaseResourcepackageTopostpaidConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 1214975955185134855L;

	/** 
	 * 待退款金额（分）
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

}
