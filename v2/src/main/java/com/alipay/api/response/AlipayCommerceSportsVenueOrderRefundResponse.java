package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.sports.venue.order.refund response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 17:43:57
 */
public class AlipayCommerceSportsVenueOrderRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 5463922932888983928L;

	/** 
	 * 操作描述
	 */
	@ApiField("desc")
	private String desc;

	/** 
	 * 支付宝业务订单唯一ID
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 服务商内部唯一订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/** 
	 * 退款结果
refund_succ -退款成功
refund_fail -退款失败
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/** 
	 * 支付宝退款单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc( ) {
		return this.desc;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}
	public String getOutOrderId( ) {
		return this.outOrderId;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	public String getRefundStatus( ) {
		return this.refundStatus;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
