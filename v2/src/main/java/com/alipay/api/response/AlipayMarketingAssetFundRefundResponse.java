package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.asset.fund.refund response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-11 10:54:36
 */
public class AlipayMarketingAssetFundRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 3453931139463777799L;

	/** 
	 * 当笔资产资金操作的流水id
	 */
	@ApiField("refund_order_id")
	private String refundOrderId;

	public void setRefundOrderId(String refundOrderId) {
		this.refundOrderId = refundOrderId;
	}
	public String getRefundOrderId( ) {
		return this.refundOrderId;
	}

}
