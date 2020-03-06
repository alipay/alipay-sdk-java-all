package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.vehicleowner.settlement.refund response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-22 23:05:01
 */
public class AlipayCommerceTransportVehicleownerSettlementRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 8741956374945581521L;

	/** 
	 * 买家在支付宝的用户id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/** 
	 * 退款支付时间
	 */
	@ApiField("gmt_refund_pay")
	private Date gmtRefundPay;

	/** 
	 * 商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 退款总金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getBuyerId( ) {
		return this.buyerId;
	}

	public void setGmtRefundPay(Date gmtRefundPay) {
		this.gmtRefundPay = gmtRefundPay;
	}
	public Date getGmtRefundPay( ) {
		return this.gmtRefundPay;
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

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
