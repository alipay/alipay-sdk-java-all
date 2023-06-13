package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BaseOpenApiResponseHeaderDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.applepay.transactionauthtoken.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 02:11:53
 */
public class AlipayPayApplepayTransactionauthtokenDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 2578527354772443719L;

	/** 
	 * 响应报文头部
	 */
	@ApiField("response_header")
	private BaseOpenApiResponseHeaderDTO responseHeader;

	public void setResponseHeader(BaseOpenApiResponseHeaderDTO responseHeader) {
		this.responseHeader = responseHeader;
	}
	public BaseOpenApiResponseHeaderDTO getResponseHeader( ) {
		return this.responseHeader;
	}

}
