package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.saas.fund.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-20 10:42:52
 */
public class AlipayTradeSaasFundConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 8279415328595239968L;

	/** 
	 * Fundds已受理的超额部分自动退款金额，单位为元；等额认款时为0.00。
	 */
	@ApiField("auto_refund_amount")
	private String autoRefundAmount;

	/** 
	 * 真实入金金额，单位为元，不等同于订单金额。
	 */
	@ApiField("buyer_pay_amount")
	private String buyerPayAmount;

	/** 
	 * 本次实际认款金额，单位为元。
	 */
	@ApiField("claim_amount")
	private String claimAmount;

	/** 
	 * 本次商户认款请求幂等号。
	 */
	@ApiField("claim_request_no")
	private String claimRequestNo;

	/** 
	 * 已绑定的SaaS资金流水号。
	 */
	@ApiField("fund_no")
	private String fundNo;

	/** 
	 * SaaS交易主单号。无订单认款时由SaaS根据资金流水补建。
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 商户订单号。无订单认款时由SaaS以资金流水号生成并固化。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 银行转账渠道交易号。Fundds返回ACCEPTED时即返回已创建设备的交易号，最终状态以订单查询或交易成功通知为准。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 订单当前状态。WAIT_BUYER_PAY：认款已受理，订单仍待支付结果；TRADE_SUCCESS：认款最终成功。Fundds返回ACCEPTED时为WAIT_BUYER_PAY，商户应通过订单查询或交易成功通知确认最终结果。
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	public void setAutoRefundAmount(String autoRefundAmount) {
		this.autoRefundAmount = autoRefundAmount;
	}
	public String getAutoRefundAmount( ) {
		return this.autoRefundAmount;
	}

	public void setBuyerPayAmount(String buyerPayAmount) {
		this.buyerPayAmount = buyerPayAmount;
	}
	public String getBuyerPayAmount( ) {
		return this.buyerPayAmount;
	}

	public void setClaimAmount(String claimAmount) {
		this.claimAmount = claimAmount;
	}
	public String getClaimAmount( ) {
		return this.claimAmount;
	}

	public void setClaimRequestNo(String claimRequestNo) {
		this.claimRequestNo = claimRequestNo;
	}
	public String getClaimRequestNo( ) {
		return this.claimRequestNo;
	}

	public void setFundNo(String fundNo) {
		this.fundNo = fundNo;
	}
	public String getFundNo( ) {
		return this.fundNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	public String getTradeStatus( ) {
		return this.tradeStatus;
	}

}
