package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.fin.risk.identify response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-09 16:57:01
 */
public class ZhimaCreditEpFinRiskIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3222763295663748139L;

	/** 
	 * 与入参中的request_id保持一致，标识某一次请求的返回结果
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 风控决策结果，由JSON序列化得到，需要反序列化后使用
	 */
	@ApiField("result")
	private String result;

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
