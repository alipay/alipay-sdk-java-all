package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.hrcominsu.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-09 17:57:52
 */
public class AlipayDigitalmgmtHrcominsuOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2749184442768191784L;

	/** 
	 * 家空间统一订单号（并发冲突时为空，调用方可重试）
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}
