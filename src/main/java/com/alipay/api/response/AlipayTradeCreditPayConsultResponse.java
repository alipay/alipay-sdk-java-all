package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.credit.pay.consult response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-25 16:10:20
 */
public class AlipayTradeCreditPayConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5312144966342197246L;

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
