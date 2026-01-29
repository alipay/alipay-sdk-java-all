package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.supervision.funds.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 16:37:36
 */
public class AlipayEbppIndustrySupervisionFundsTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 8747124515445225639L;

	/** 
	 * 支付宝内部受理本次资金划拨请求时生成的流水单号
	 */
	@ApiField("operate_no")
	private String operateNo;

	/** 
	 * 对应当前请求参数的「外部请求流水号 out_trade_no 」
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	public void setOperateNo(String operateNo) {
		this.operateNo = operateNo;
	}
	public String getOperateNo( ) {
		return this.operateNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

}
