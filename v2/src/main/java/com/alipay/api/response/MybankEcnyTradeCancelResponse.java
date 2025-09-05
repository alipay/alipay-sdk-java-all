package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.ecny.trade.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:52:42
 */
public class MybankEcnyTradeCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 2625745596513741928L;

	/** 
	 * 本次撤销触发的交易动作,接口调用成功且交易存在时返回。可能的返回值：
close：交易未支付，触发关闭交易动作，无退款；
refund：交易已支付，触发交易退款动作；
未返回：未查询到交易，或接口调用失败；
	 */
	@ApiField("action")
	private String action;

	/** 
	 * 调用方订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 重试标志：
Y-需要重试；N-不需要重试
	 */
	@ApiField("retry_flag")
	private String retryFlag;

	/** 
	 * 运营机构交易号;
当发生交易关闭或交易退款时返回；
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
