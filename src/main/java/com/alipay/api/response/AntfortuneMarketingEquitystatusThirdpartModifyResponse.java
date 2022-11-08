package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.marketing.equitystatus.thirdpart.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-21 16:31:39
 */
public class AntfortuneMarketingEquitystatusThirdpartModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7896573215455929612L;

	/** 
	 * 返回值：true或者false
	 */
	@ApiField("should_retry")
	private String shouldRetry;

	public void setShouldRetry(String shouldRetry) {
		this.shouldRetry = shouldRetry;
	}
	public String getShouldRetry( ) {
		return this.shouldRetry;
	}

}
