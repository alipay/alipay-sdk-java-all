package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.settle.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-08 15:19:56
 */
public class AlipayTradeSettleConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 8154383696197199533L;

	/** 
	 * 确认结算请求流水号，开发者自行生成并保证唯一性，作为业务幂等性控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

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

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
