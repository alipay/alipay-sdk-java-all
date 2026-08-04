package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.saas.order.close response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-03 11:52:51
 */
public class AlipayTradeSaasOrderCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 2574941818397936537L;

	/** 
	 * 关闭时间，格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("close_time")
	private String closeTime;

	/** 
	 * SaaS交易订单号。历史B2C交易不返回。
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 商户订单号。历史B2C交易仅使用trade_no定位且无法恢复商户订单号时不返回。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 下游支付渠道交易号。多渠道无法唯一表达时不返回。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 关闭后的交易状态，固定为TRADE_CLOSED。
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}
	public String getCloseTime( ) {
		return this.closeTime;
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
