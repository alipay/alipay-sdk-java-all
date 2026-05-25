package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.aipay.agent.payment.verify response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-29 11:52:45
 */
public class AlipayAipayAgentPaymentVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1411388389138842889L;

	/** 
	 * 支付凭证是否有效
	 */
	@ApiField("active")
	private Boolean active;

	/** 
	 * 订单金额，CNY
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 外部幂等号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 卖家自定义的resourceId
	 */
	@ApiField("resource_id")
	private String resourceId;

	/** 
	 * 支付宝交易号，交易的唯一标识
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setActive(Boolean active) {
		this.active = active;
	}
	public Boolean getActive( ) {
		return this.active;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	public String getResourceId( ) {
		return this.resourceId;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
