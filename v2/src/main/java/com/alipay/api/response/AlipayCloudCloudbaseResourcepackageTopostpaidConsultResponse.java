package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourcepackage.topostpaid.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-19 10:37:07
 */
public class AlipayCloudCloudbaseResourcepackageTopostpaidConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2351339283142988873L;

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
