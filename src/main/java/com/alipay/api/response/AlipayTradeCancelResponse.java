package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2017-10-19 16:09:44
 */
public class AlipayTradeCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 8199328515214449324L;

	/** 
	 * 本次撤销触发的交易动作
close：关闭交易，无退款
refund：产生了退款
	 */
	@ApiField("action")
	private String action;

	/** 
	 * 商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 是否需要重试
	 */
	@ApiField("retry_flag")
	private String retryFlag;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setAction(String action) {
		this.action = action;
	}
	public String getAction( ) {
		return this.action;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setRetryFlag(String retryFlag) {
		this.retryFlag = retryFlag;
	}
	public String getRetryFlag( ) {
		return this.retryFlag;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
