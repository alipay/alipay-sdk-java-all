package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.direct.refund.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-15 16:38:19
 */
public class AlipayCommerceMedicalDirectRefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3694865984574994449L;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/** 
	 * 订单类型
	 */
	@ApiField("order_type")
	private String orderType;

	/** 
	 * 外部交易号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 退款金额,单位是yuan
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 退款描述
	 */
	@ApiField("refund_msg")
	private String refundMsg;

	/** 
	 * 退款请求流水号
	 */
	@ApiField("refund_request_no")
	private String refundRequestNo;

	/** 
	 * 退款状态
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/** 
	 * 退款成功时该字段有值
	 */
	@ApiField("refund_time")
	private Date refundTime;

	/** 
	 * 逸康交易单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}
	public String getAlipayTradeNo( ) {
		return this.alipayTradeNo;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderType( ) {
		return this.orderType;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setRefundMsg(String refundMsg) {
		this.refundMsg = refundMsg;
	}
	public String getRefundMsg( ) {
		return this.refundMsg;
	}

	public void setRefundRequestNo(String refundRequestNo) {
		this.refundRequestNo = refundRequestNo;
	}
	public String getRefundRequestNo( ) {
		return this.refundRequestNo;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	public String getRefundStatus( ) {
		return this.refundStatus;
	}

	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}
	public Date getRefundTime( ) {
		return this.refundTime;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
