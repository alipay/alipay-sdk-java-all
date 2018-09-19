package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.request.batch.send response.
 * 
 * @author auto create
 * @since 1.0, 2018-09-17 14:35:00
 */
public class AlipayOpenRequestBatchSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7568199426141751556L;

	/** 
	 * 批量请求中子业务接口的响应拼接报文:
{
"alipay_trade_query_response":{"code":"10000","msg":"Success","out_trade_no":"2018232"}}#S#{
"alipay_trade_query_response":{"code":"10000","msg":"Success","out_trade_no":"2018232"}}
	 */
	@ApiField("response_body")
	private String responseBody;

	public void setResponseBody(String responseBody) {
		this.responseBody = responseBody;
	}
	public String getResponseBody( ) {
		return this.responseBody;
	}

}
