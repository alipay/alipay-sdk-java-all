package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CredentialsResponseHeader;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.codec.applepay.credentials.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-27 12:27:59
 */
public class AlipayPayCodecApplepayCredentialsGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8148291596765217595L;

	/** 
	 * 结果。 statusCode:Status code used to indicate an error. If omitted, assumed to be 200 (success);subStatusCode:Conveys failure codes from downstream entities or for more granular conveyance of specific error conditions;statusMessage:Not parsed programmatically. Example "Downstream system offline".
	 */
	@ApiField("response_header")
	private CredentialsResponseHeader responseHeader;

	public void setResponseHeader(CredentialsResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}
	public CredentialsResponseHeader getResponseHeader( ) {
		return this.responseHeader;
	}

}
