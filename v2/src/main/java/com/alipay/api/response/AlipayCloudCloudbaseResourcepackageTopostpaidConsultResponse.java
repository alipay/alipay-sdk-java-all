package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourcepackage.topostpaid.consult response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-19 17:47:43
 */
public class AlipayCloudCloudbaseResourcepackageTopostpaidConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7236913565374215463L;

	/** 
	 * 原始待退款金额（分）
	 */
	@ApiField("origin_refund_amount")
	private String originRefundAmount;

	/** 
	 * 待退款金额（分）
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	public void setOriginRefundAmount(String originRefundAmount) {
		this.originRefundAmount = originRefundAmount;
	}
	public String getOriginRefundAmount( ) {
		return this.originRefundAmount;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

}
