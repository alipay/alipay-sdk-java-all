package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.data.deer.insight.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-01-06 16:28:10
 */
public class AlipayMarketingDataDeerInsightQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6272541479711773321L;

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
