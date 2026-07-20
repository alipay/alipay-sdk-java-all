package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.StandardRefundOrderDTO;
import com.alipay.api.domain.ResultInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.voyager.payments.refund.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-14 14:57:53
 */
public class AlipayVoyagerPaymentsRefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2861193918656618144L;

	/** 
	 * 退款订单
	 */
	@ApiField("refund_order")
	private StandardRefundOrderDTO refundOrder;

	/** 
	 * 结果信息
	 */
	@ApiField("result")
	private ResultInfoDTO result;

	public void setRefundOrder(StandardRefundOrderDTO refundOrder) {
		this.refundOrder = refundOrder;
	}
	public StandardRefundOrderDTO getRefundOrder( ) {
		return this.refundOrder;
	}

	public void setResult(ResultInfoDTO result) {
		this.result = result;
	}
	public ResultInfoDTO getResult( ) {
		return this.result;
	}

}
