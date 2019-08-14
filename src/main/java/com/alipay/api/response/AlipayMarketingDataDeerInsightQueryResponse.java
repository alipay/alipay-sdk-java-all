package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.data.deer.insight.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-22 14:30:20
 */
public class AlipayMarketingDataDeerInsightQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6184847682933414379L;

	/** 
	 * 凤蝶洞察信息
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 请求是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
