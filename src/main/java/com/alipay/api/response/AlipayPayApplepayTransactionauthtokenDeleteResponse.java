package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BaseOpenApiResponseHeaderDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.applepay.transactionauthtoken.delete response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-23 14:01:11
 */
public class AlipayPayApplepayTransactionauthtokenDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 6561949485451896565L;

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
