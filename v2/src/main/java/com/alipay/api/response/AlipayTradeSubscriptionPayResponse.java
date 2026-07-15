package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.subscription.pay response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-30 16:22:57
 */
public class AlipayTradeSubscriptionPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 4118221386754164296L;

	/** 
	 * 支付请求受理时生成的支付请求单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 商户侧外部单号，幂等键。一致则重新唤起原单支付，不一致则重新创单
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 16	扣款状态。
PENDING_PAY 待支付
PAID 已支付
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 订阅id，订阅唯一标识
	 */
	@ApiField("subscription_id")
	private String subscriptionId;

	/** 
	 * 支付宝交易号（仅支付受理成功时返回）
	 */
	@ApiField("trade_no")
	private String tradeNo;

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

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	public String getSubscriptionId( ) {
		return this.subscriptionId;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
