package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.settle.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-26 17:21:49
 */
public class AlipayTradeSettleConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 1668543677936867958L;

	/** 
	 * 确认结算请求流水号，开发者自行生成并保证唯一性，作为业务幂等性控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 本次确认结算的实际结算金额，单位为元。
	 */
	@ApiField("settle_amount")
	private String settleAmount;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setSettleAmount(String settleAmount) {
		this.settleAmount = settleAmount;
	}
	public String getSettleAmount( ) {
		return this.settleAmount;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
