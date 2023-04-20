package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.credit.pay.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 07:02:34
 */
public class AlipayTradeCreditPayConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3291442173136654888L;

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
