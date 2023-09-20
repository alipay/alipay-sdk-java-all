package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.wallet.refund response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-29 17:18:18
 */
public class AlipayCloudCloudbaseWalletRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 5284587815828651287L;

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
