package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BaseOpenApiResponseHeaderDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.applepay.transactionauthtoken.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-03 14:20:12
 */
public class AlipayPayApplepayTransactionauthtokenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7267144568133457464L;

	/** 
	 * 通知authToken
	 */
	@ApiField("authentication_token")
	private String authenticationToken;

	/** 
	 * 响应报文头部
	 */
	@ApiField("response_header")
	private BaseOpenApiResponseHeaderDTO responseHeader;

	/** 
	 * 是否允许通知状态转移
	 */
	@ApiField("supports_settlement")
	private Boolean supportsSettlement;

	public void setAuthenticationToken(String authenticationToken) {
		this.authenticationToken = authenticationToken;
	}
	public String getAuthenticationToken( ) {
		return this.authenticationToken;
	}

	public void setResponseHeader(BaseOpenApiResponseHeaderDTO responseHeader) {
		this.responseHeader = responseHeader;
	}
	public BaseOpenApiResponseHeaderDTO getResponseHeader( ) {
		return this.responseHeader;
	}

	public void setSupportsSettlement(Boolean supportsSettlement) {
		this.supportsSettlement = supportsSettlement;
	}
	public Boolean getSupportsSettlement( ) {
		return this.supportsSettlement;
	}

}
