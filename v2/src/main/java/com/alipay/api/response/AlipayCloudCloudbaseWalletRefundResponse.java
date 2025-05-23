package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.wallet.refund response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:40:37
 */
public class AlipayCloudCloudbaseWalletRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 8893564812587412923L;

	/** 
	 * 提现单号
	 */
	@ApiField("refund_order_no")
	private String refundOrderNo;

	public void setRefundOrderNo(String refundOrderNo) {
		this.refundOrderNo = refundOrderNo;
	}
	public String getRefundOrderNo( ) {
		return this.refundOrderNo;
	}

}
