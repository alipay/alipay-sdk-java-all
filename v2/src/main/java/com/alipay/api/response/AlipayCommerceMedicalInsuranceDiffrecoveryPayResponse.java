package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.diffrecovery.pay response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-02 17:32:18
 */
public class AlipayCommerceMedicalInsuranceDiffrecoveryPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 5121977364262558297L;

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
