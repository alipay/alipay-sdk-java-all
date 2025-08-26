package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.activity.access.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-26 10:32:36
 */
public class AlipayCommerceLogisticsActivityAccessConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4357915699697478621L;

	/** 
	 * true表示可参加活动，false表示不可参加活动
	 */
	@ApiField("consult_result")
	private Boolean consultResult;

	public void setConsultResult(Boolean consultResult) {
		this.consultResult = consultResult;
	}
	public Boolean getConsultResult( ) {
		return this.consultResult;
	}

}
