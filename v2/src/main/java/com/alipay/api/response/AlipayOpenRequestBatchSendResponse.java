package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.request.batch.send response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenRequestBatchSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4535114856193539636L;

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
