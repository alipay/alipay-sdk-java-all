package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.wallet.refundstatus.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:40:35
 */
public class AlipayCloudCloudbaseWalletRefundstatusGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8276546679293819828L;

	/** 
	 * 提现状态
	 */
	@ApiField("refund_status")
	private String refundStatus;

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	public String getRefundStatus( ) {
		return this.refundStatus;
	}

}
