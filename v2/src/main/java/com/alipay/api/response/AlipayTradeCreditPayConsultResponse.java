package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.credit.pay.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-29 11:14:00
 */
public class AlipayTradeCreditPayConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4122563298842913945L;

	/** 
	 * 准入咨询结果AVAILABLE：可用；UNAVAILABLE：不可用。
	 */
	@ApiField("consult_result")
	private String consultResult;

	public void setConsultResult(String consultResult) {
		this.consultResult = consultResult;
	}
	public String getConsultResult( ) {
		return this.consultResult;
	}

}
