package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SaasTradeFundBill;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.saas.order.refund response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-03 11:52:51
 */
public class AlipayTradeSaasOrderRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 1167699646339732352L;

	/** 
	 * 本次退款是否发生资金变化。Y表示发生资金变化，N表示未发生资金变化。
	 */
	@ApiField("fund_change")
	private String fundChange;

	/** 
	 * 退款成功时间，格式为yyyy-MM-dd HH:mm:ss。按query_options返回。
	 */
	@ApiField("gmt_refund_pay")
	private String gmtRefundPay;

	/** 
	 * 商户退款请求号。请求传入时返回。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 商户订单号。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * null
	 */
	@ApiListField("refund_detail_item_list")
	@ApiField("saas_trade_fund_bill")
	private List<SaasTradeFundBill> refundDetailItemList;

	/** 
	 * 本次退款金额，单位为元。
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/** 
	 * 下游支付渠道交易号。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setFundChange(String fundChange) {
		this.fundChange = fundChange;
	}
	public String getFundChange( ) {
		return this.fundChange;
	}

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

	public void setRefundDetailItemList(List<SaasTradeFundBill> refundDetailItemList) {
		this.refundDetailItemList = refundDetailItemList;
	}
	public List<SaasTradeFundBill> getRefundDetailItemList( ) {
		return this.refundDetailItemList;
	}

	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}
	public String getRefundFee( ) {
		return this.refundFee;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
