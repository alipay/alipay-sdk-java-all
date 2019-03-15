package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.data.deer.insight.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayMarketingDataDeerInsightQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5252523429575497234L;

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
