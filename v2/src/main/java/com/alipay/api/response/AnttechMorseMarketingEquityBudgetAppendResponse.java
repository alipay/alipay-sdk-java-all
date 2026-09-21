package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.marketing.equity.budget.append response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-21 10:37:50
 */
public class AnttechMorseMarketingEquityBudgetAppendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7795818944929373481L;

	/** 
	 * 原样返回请求中的业务幂等号
	 */
	@ApiField("request_id")
	private String requestId;

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
