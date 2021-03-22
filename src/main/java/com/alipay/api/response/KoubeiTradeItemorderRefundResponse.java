package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.itemorder.refund response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-10 16:58:18
 */
public class KoubeiTradeItemorderRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 8158262439665551188L;

	/** 
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 退款唯一请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 实际退的资金。
	 */
	@ApiField("real_refund_amount")
	private String realRefundAmount;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setRealRefundAmount(String realRefundAmount) {
		this.realRefundAmount = realRefundAmount;
	}
	public String getRealRefundAmount( ) {
		return this.realRefundAmount;
	}

}
