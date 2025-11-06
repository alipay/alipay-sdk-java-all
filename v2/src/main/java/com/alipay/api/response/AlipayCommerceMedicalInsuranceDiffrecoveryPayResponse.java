package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.diffrecovery.pay response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-29 19:42:41
 */
public class AlipayCommerceMedicalInsuranceDiffrecoveryPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 2186438875317984729L;

	/** 
	 * 支付宝交易订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
