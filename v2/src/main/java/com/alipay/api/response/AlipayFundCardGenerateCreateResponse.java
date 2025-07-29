package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.card.generate.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-28 17:52:04
 */
public class AlipayFundCardGenerateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8428648238676273273L;

	/** 
	 * 接收制卡请求落地之后的返回的支付宝制卡单号
	 */
	@ApiField("fund_card_generate_no")
	private String fundCardGenerateNo;

	public void setFundCardGenerateNo(String fundCardGenerateNo) {
		this.fundCardGenerateNo = fundCardGenerateNo;
	}
	public String getFundCardGenerateNo( ) {
		return this.fundCardGenerateNo;
	}

}
