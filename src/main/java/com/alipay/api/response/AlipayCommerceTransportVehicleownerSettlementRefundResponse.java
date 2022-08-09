package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.vehicleowner.settlement.refund response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-25 19:03:49
 */
public class AlipayCommerceTransportVehicleownerSettlementRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 2577393654842988187L;

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
	 * 退款外部请求号，多次退款会有
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

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
	 * 支付宝收单：
"RI", "退款中";
"R", "已退款";
"PR", "部分退款";
银行收单：
"PART_PROCESS_REFUND", "受理部分退款";
"IN_PROCESSING_REFUND", "受理退款中";
"PROCESS_REFUND", "已受理退款".
	 */
	@ApiField("refund_status")
	private String refundStatus;

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

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
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
