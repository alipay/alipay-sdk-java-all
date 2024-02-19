package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.marketing.equitycode.discrypt.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 07:32:04
 */
public class AntfortuneMarketingEquitycodeDiscryptGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5287913181172545836L;

	/** 
	 * 解密后的第三方券码
	 */
	@ApiField("equity_code")
	private String equityCode;

	/** 
	 * 是否推荐重试
	 */
	@ApiField("should_retry")
	private Boolean shouldRetry;

	public void setEquityCode(String equityCode) {
		this.equityCode = equityCode;
	}
	public String getEquityCode( ) {
		return this.equityCode;
	}

	public void setShouldRetry(Boolean shouldRetry) {
		this.shouldRetry = shouldRetry;
	}
	public Boolean getShouldRetry( ) {
		return this.shouldRetry;
	}

}
