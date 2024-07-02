package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.ecny.trade.refund response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-12 15:16:55
 */
public class MybankEcnyTradeRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 7729599742829171447L;

	/** 
	 * 本次退款是否发生了资金变化：Y-是；N-否
	 */
	@ApiField("fund_change")
	private String fundChange;

	/** 
	 * 调用方订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 退款总金额。指该笔交易累计已经退款成功的金额。
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/** 
	 * 运营机构交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setFundChange(String fundChange) {
		this.fundChange = fundChange;
	}
	public String getFundChange( ) {
		return this.fundChange;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
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
