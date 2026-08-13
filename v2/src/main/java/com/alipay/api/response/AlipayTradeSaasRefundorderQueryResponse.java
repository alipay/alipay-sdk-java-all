package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SaasTradeFundBill;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.saas.refundorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-03 11:57:51
 */
public class AlipayTradeSaasRefundorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5846476711661733882L;

	/** 
	 * 退款成功时间，格式为yyyy-MM-dd HH:mm:ss。按query_options返回。
	 */
	@ApiField("gmt_refund_pay")
	private String gmtRefundPay;

	/** 
	 * 商户退款请求号。原退款请求传入时返回。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 商户订单号。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 退款金额，单位为元。
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * null
	 */
	@ApiListField("refund_detail_item_list")
	@ApiField("saas_trade_fund_bill")
	private List<SaasTradeFundBill> refundDetailItemList;

	/** 
	 * 退款原因。
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/** 
	 * 退款状态。
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/** 
	 * 本次商户实际退回金额，单位为元。
	 */
	@ApiField("send_back_fee")
	private String sendBackFee;

	/** 
	 * 原订单金额，单位为元。
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 下游支付渠道交易号。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setGmtRefundPay(String gmtRefundPay) {
		this.gmtRefundPay = gmtRefundPay;
	}
	public String getGmtRefundPay( ) {
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

	public void setRefundDetailItemList(List<SaasTradeFundBill> refundDetailItemList) {
		this.refundDetailItemList = refundDetailItemList;
	}
	public List<SaasTradeFundBill> getRefundDetailItemList( ) {
		return this.refundDetailItemList;
	}

	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}
	public String getRefundReason( ) {
		return this.refundReason;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	public String getRefundStatus( ) {
		return this.refundStatus;
	}

	public void setSendBackFee(String sendBackFee) {
		this.sendBackFee = sendBackFee;
	}
	public String getSendBackFee( ) {
		return this.sendBackFee;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
